package com.oriain.Cards;

import com.oriain.Cards.Enums.RarityType;
import com.oriain.Cards.Enums.TargetType;

/**
 * Created by littl on 8/5/2017.
 */
public abstract class Troop extends Card {

    public Troop(int level, RarityType rarity) {
        super(level, rarity);
    }

    abstract public int getHitPoints();
    abstract public TargetType getTroopType();
    abstract public int getAreaDamage();
    abstract public int getDamagePerSec();
    abstract public double getHitSpeed();
}
