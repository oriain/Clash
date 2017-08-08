package com.oriain;

import com.oriain.Cards.Buildings.XBow;
import com.oriain.Cards.Spells.Arrows;
import com.oriain.Cards.Troops.Princess;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final List<Class<?>> cards;
    private static final List<Class<?>> buildings;
    private static final List<Class<?>> spells;
    private static final List<Class<?>> troops;

    static {
        List<Class<?>> b = new ArrayList<>();
        b.add(XBow.class);
        buildings = b;

        List<Class<?>> s = new ArrayList<>();
        s.add(Arrows.class);
        spells = s;

        List<Class<?>> t = new ArrayList<>();
        t.add(Princess.class);
        troops = t;

        List<Class<?>> c = new ArrayList<>();
        c.addAll(buildings);
        c.addAll(spells);
        c.addAll(troops);
        cards = c;
    }

    private static void showStats(List<Class<?>> classes) {
        for (Class<?> c : classes){
            try {
                Method showStats = c.getMethod("ShowStats");
                showStats.invoke(null);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }

    private static void showStats() {
        showStats(buildings);
        showStats(spells);
        showStats(troops);
    }

    public static void main(String[] args) {
        // write your code here

        showStats();
    }

}
