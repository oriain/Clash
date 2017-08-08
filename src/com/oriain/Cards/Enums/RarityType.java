package com.oriain.Cards.Enums;

/**
 * Created by littl on 8/6/2017.
 */
public enum RarityType {
    COMMON    (0),
    RARE      (1),
    EPIC      (2),
    LEGENDARY (3);

    private final int index;
    RarityType(int index) {
        this.index = index;
    }

    private static final int[] maxLevels = {
            13, // Common
            11, // Rare
            8,  // Epic
            5   // Legendary
    };

    private static final int[] tournamentLevels = {
            9, // Common
            7, // Rare
            4, // Epic
            1  // Legendary
    };

    public int getMaxLevel() {
        return maxLevels[index];
    }

    public int getTournamentLevel() {
        return tournamentLevels[index];
    }
}
