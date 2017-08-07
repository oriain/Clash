package com.oriain.Cards.Spells;

import com.oriain.Cards.Enums.RarityType;
import com.oriain.Cards.Enums.TargetType;
import com.oriain.Cards.Spell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by littl on 8/5/2017.
 */
public class Arrows extends Spell {

    public static final String Description = "Arrows pepper a large area, damaging all enemies hit. Reduced damage to Crown Towers.";
    public static final RarityType Rarity = RarityType.COMMON;
    public static final int FromArena = 0;
    public static final List<TargetType> Target = Arrays.asList(TargetType.AIR, TargetType.GROUND);
    public static final double Radius = 4.0;

    public static final int[] AreaDamage = {
            115, // 1
            126, // 2
            139, // 3
            152, // 4
            167, // 5
            184, // 6
            202, // 7
            221, // 8
            243, // 9
            267, // 10
            294, // 11
            323, // 12
            355  // 13
    };

    public static final int[] TowerDamage = {
            46,  // 1
            50,  // 2
            55,  // 3
            60,  // 4
            66,  // 5
            73,  // 6
            80,  // 7
            88,  // 8
            97,  // 9
            106, // 10
            117, // 11
            129, // 12
            142  // 13
    };

    public Arrows(int level) {
        super(level, Rarity);
    }

    public int getAreaDamage() {
        return AreaDamage[getLevel()-1];
    }

    public int getTowerDamage() {
        return TowerDamage[getLevel()-1];
    }

    @Override
    public void ShowStats() {
        ArrayList<Arrows> allLevels = new ArrayList<>(getMaxLevel());
        for (int i = 0; i < getMaxLevel(); i++) {
            allLevels.add(i, new Arrows(i+1));
        }

        // Heading
        System.out.println("Arrows Statistics:");

        // Levels
        System.out.print("Card Level\t");
        for (Arrows arrows : allLevels ) {
            System.out.print("\tLvl " + arrows.getLevel());
        }
        System.out.println();

        // Hit Points
        System.out.print("Hit Points");
        for (Arrows arrows : allLevels ) {
            System.out.print("\t\t" + arrows.getAreaDamage());
        }
        System.out.println();

        // Area Damage
        System.out.print("Area Damage");
        for (Arrows arrows : allLevels ) {
            System.out.print("\t\t" + arrows.getTowerDamage());
        }
        System.out.println();

        System.out.println();
    }
}
