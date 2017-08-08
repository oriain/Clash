package com.oriain.Cards.Buildings;

import com.oriain.Cards.Building;
import com.oriain.Cards.Enums.RarityType;
import com.oriain.Cards.Enums.TargetType;
import com.oriain.Cards.Interfaces.IBuilding;
import com.oriain.Utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by littl on 8/6/2017.
 */
public class XBow extends Building implements IBuilding {

    public static final String Description = "Nice tower you got there. Would be a shame if this X-Bow whittled it down from this side of the Arena...";
    public static final RarityType Rarity = RarityType.EPIC;
    public static final int FromArena = 3;
    public static final int DeployTime = 4; // Seconds
    public static final List<TargetType> Target = Collections.singletonList(TargetType.GROUND);
    public static final double Range = 11.5;
    public static final double HitSpeed = 0.3; // Seconds
    public static final int LifeTime = 40; // Seconds

    public static final int[] HitPoints = {
            1000,
            1100,
            1210,
            1330,
            1460,
            1600,
            1760,
            1930
    };

    public static final int[] Damage = {
            20,
            22,
            24,
            26,
            29,
            32,
            35,
            38
    };

    public static final int[] DamagePerSecond = Utils.CalculateDamagePerSecond(HitSpeed, Damage);

    public static void ShowStats() {
        int levels = Rarity.getMaxLevel();
        ArrayList<XBow> xbows = new ArrayList<>(levels);
        for (int i = 0; i < levels; i++) {
            xbows.add(i, new XBow(i+1));
        }

        // Heading
        System.out.println("X-Bow Statistics:");

        // Levels
        System.out.print("Card Level\t");
        for (XBow xbow : xbows) {
            System.out.print("\tLvl " + xbow.getLevel());
        }
        System.out.println();

        // Hit Points
        System.out.print("Hit Points\t");
        for (XBow xbow : xbows) {
            System.out.print("\t" + xbow.getHitPoints());
        }
        System.out.println();

        // Area Damage
        System.out.print("Damage\t");
        for (XBow xbow : xbows) {
            System.out.print("\t\t" + xbow.getDamage());
        }
        System.out.println();

        // Damage Per Second
        System.out.print("Damage/sec");
        for (XBow xbow : xbows) {
            System.out.print("\t\t" + xbow.getDamagePerSecond());
        }
        System.out.println();

        System.out.println();
    }

    public XBow(int level) {
        super(level, Rarity);
    }

    public int getHitPoints() {
        return HitPoints[getLevel()-1];
    }

    public int getDamage() {
        return Damage[getLevel()-1];
    }

    public int getDamagePerSecond() {
        return DamagePerSecond[getLevel()-1];
    }


}
