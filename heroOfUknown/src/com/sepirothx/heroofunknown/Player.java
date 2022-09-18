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
