/**
 * Hero Of Unknown
 * Category: Game / Text-based
 * By: Sepiroth-X a.k.a Richard Cebel Cupal, LPT
 * License: Open-Source (Feel free to copy and modify)
 * The objective of this source code is to teach students
 * the concepts in java language.
 * **/


package com.sepirothx.heroofunknown;

public class Player {

    private String name;
    private int hp;
    private int mana;
    private String charClass;

    private int level;


    public Player(String name, int hp, int mana, String charClass, int level) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
        this.charClass = charClass;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public String getCharClass() {
        return charClass;
    }

    public int getlevel() {
        return level;
    }
}
