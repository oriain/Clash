package com.oriain.Cards.Troops;

import com.oriain.Cards.Enums.RarityType;
import com.oriain.Cards.Enums.SpeedType;
import com.oriain.Cards.Enums.TargetType;
import com.oriain.Cards.Interfaces.ITroop;
import com.oriain.Cards.Troop;
import com.oriain.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by littl on 8/5/2017.
 */
public class Princess extends Troop implements ITroop {

    public static final String Description = "This stunning Princess shoots flaming arrows from long range. If you're feeling warm feelings towards her, it's probably because you're on fire.";
    public static final RarityType Rarity = RarityType.LEGENDARY;
    public static final int FromArena = 7;
    public static final List<TargetType> Target = Arrays.asList(TargetType.AIR, TargetType.GROUND);
    public static final double Radius = 2.5;
    public static final double Range = 9.0;
    public static final double HitSpeed = 3.0;
    public static final SpeedType Speed = SpeedType.MEDIUM;
    // TODO: StatsRoyale lists Radius twice...
    // public static final double Radius = 2.0;

    public static final int[] HitPoints = {
            216, // 1
            237, // 2
            261, // 3
            287, // 4
            315  // 5
    };

    public static final int[] AreaDamage = {
            140, // 1
            154, // 2
            169, // 3
            186, // 4
            204  // 5
    };

    public static final int[] DamagePerSecond = Utils.CalculateDamagePerSecond(HitSpeed, AreaDamage);

    public static void ShowStats() {
        int levels = Rarity.getMaxLevel();
        ArrayList<Princess> princesses = new ArrayList<>(levels);
        for (int i = 0; i < levels; i++) {
            princesses.add(i, new Princess(i+1));
        }

        // Heading
        System.out.println("Princess Statistics:");

        // Levels
        System.out.print("Card Level\t");
        for (Princess princess : princesses) {
            System.out.print("\tLvl " + princess.getLevel());
        }
        System.out.println();

        // Hit Points
        System.out.print("Hit Points");
        for (Princess princess : princesses) {
            System.out.print("\t\t" + princess.getHitPoints());
        }
        System.out.println();

        // Area Damage
        System.out.print("Area Damage");
        for (Princess princess : princesses) {
            System.out.print("\t\t" + princess.getAreaDamage());
        }
        System.out.println();

        // Damage Per Second
        System.out.print("Damage/sec");
        for (Princess princess : princesses) {
            System.out.print("\t\t" + princess.getDamagePerSec());
        }
        System.out.println();

        System.out.println();
    }

    public Princess(int level) {
        super(level, Rarity);
    }

    public int getHitPoints() {
        return HitPoints[getLevel()-1];
    }

    public int getAreaDamage() {
        return AreaDamage[getLevel()-1];
    }

    @Override
    public int getDamagePerSec() {
        return DamagePerSecond[getLevel()-1];
    }

    @Override
    public double getHitSpeed() {
        return HitSpeed;
    }

    @Override
    public TargetType getTroopType() {
        return TargetType.GROUND;
    }

}
