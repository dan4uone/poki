package com.company;

public class Main {


    public static void main(String[] args) {
        Hero[] h1 = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < h1.length; i++) {
            allHeroes(h1[i]);
        }
    }
    public static void allHeroes(Hero hero ){
        System.out.println(new Magic().applySuperAbility("magic"));
        System.out.println(new Medic().applySuperAbility("heal ")+ new Medic().increase_experience());
        System.out.println(new Warrior().applySuperAbility("doubleDamage"));


        }




}


