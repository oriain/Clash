package com.oriain;

import com.oriain.Cards.Buildings.XBow;
import com.oriain.Cards.Spells.Arrows;
import com.oriain.Cards.Troops.Princess;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        new Princess(1).ShowStats();
        new Arrows(1).ShowStats();
        new XBow(1).ShowStats();
    }
}
