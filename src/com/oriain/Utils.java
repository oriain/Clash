package com.oriain;

/**
 * Created by littl on 8/6/2017.
 */
public class Utils {
    public static int[] CalculateDamagePerSecond(double hitSpeed, int[] Damage) {
        double hitsPerSecond = 1 / hitSpeed;
        if (hitSpeed < 1) {
            hitsPerSecond = Math.ceil(hitsPerSecond);
        }
        int[] damagePerSecond = new int[Damage.length];
        for (int i = 0; i < Damage.length; i++) {
            damagePerSecond[i] = (int)(Damage[i] * hitsPerSecond);
        }
        return damagePerSecond;
    }
}
