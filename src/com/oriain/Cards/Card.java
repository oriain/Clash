package com.oriain.Cards;

import com.oriain.Cards.Enums.RarityType;

/**
 * Created by littl on 8/5/2017.
 */
public abstract class Card {
    private RarityType rarity;

    private int level;

    public Card(int level, RarityType rarity) {
        this.rarity = rarity;
        ValidateCardLevel(level);
        this.level = level;
    }

    public int getMinLevel() {
        return 1;
    }

    public int getMaxLevel() {
        return rarity.getMaxLevel();
    }

    public int getTournamentLevel() {
        return rarity.getTournamentLevel();
    }

    public int getLevel(){
        return level;
    }

    void ValidateCardLevel(int level) {
        if (level < getMinLevel()) {
            throw new IllegalArgumentException("Level must be no less than " + getMinLevel() + ".");
        }

        if (level > getMaxLevel()) {
            throw new IllegalArgumentException("Level must be no greater than " + getMaxLevel() + ".");
        }
    }

    public abstract void ShowStats();
}
