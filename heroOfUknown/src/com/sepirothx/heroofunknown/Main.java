package com.sepirothx.heroofunknown;

import java.util.*;
public class Main {


    public static void main(String[] args) {
        gameStart();


    }

    static public void gameStart() {
        Scanner console = new Scanner(System.in);
        char startOption;
        String name;
        int hp=0;
        int mana=0;
        String charClassName = null;

        System.out.println("Start game?[y/n]");
        startOption = console.next().charAt(0);

        if ((startOption == 'y') || (startOption == 'Y')){
            System.out.println("Please enter Player name:");
            name = console.next();

            System.out.println("Please choose a class:");
            System.out.println("1 - Warrior");
            System.out.println("2 - Rogue");
            System.out.println("3 - Archer");
            System.out.println("4 - Mage");

            int charChoice = console.nextInt();


            switch(charChoice){
                case 1:
                    System.out.println("You chose the Warrior class!");
                    charClassName = "Warrior";
                    CharacterClass charClassWarrior = new CharacterClass(charClassName);
                    charClassWarrior.warriorClass();  // this line assign default values for the character class
                    hp = charClassWarrior.getDefaultHp();
                    mana = charClassWarrior.getDefaultMana();

                    break;
                case 2:
                    System.out.println("You chose the Rogue class!");
                    charClassName = "Rogue";
                    CharacterClass charClassRogue = new CharacterClass(charClassName);
                    charClassRogue.rogueClass();  // this line assign default values for the character class
                    hp = charClassRogue.getDefaultHp();
                    mana = charClassRogue.getDefaultMana();

                    break;
                case 3:
                    System.out.println("You chose the Archer class!");
                    charClassName = "Archer";
                    CharacterClass charClassArcher = new CharacterClass(charClassName);
                    charClassArcher.archerClass();  // this line assign default values for the character class
                    hp = charClassArcher.getDefaultHp();
                    mana = charClassArcher.getDefaultMana();

                    break;
                case 4:
                    System.out.println("You chose the Mage class!");
                    charClassName = "Mage";
                    CharacterClass charClassMage = new CharacterClass(charClassName);
                    charClassMage.mageClass(); // this line assign default values for the character class
                    hp = charClassMage.getDefaultHp();
                    mana = charClassMage.getDefaultMana();

                    break;

                default:
                    System.out.println("Please choose valid class");
                    break;


            }

            Player player1 = new Player(name, hp, mana, charClassName,0);
            System.out.println("Player name: " + player1.getName());
            System.out.println("Class: " + player1.getCharClass());
            System.out.println("Level: " + player1.getlevel());
            System.out.println("HP: " + player1.getHp());
            System.out.println("MP: " + player1.getMana());

            System.out.println("Character Successfully Created!");


        } else {
            System.exit(0);
        }


    }
    static public void whatToDo(){
        //TODO:
    }

    static public void loadMap(){

        //TODO:

    }


}
