package com.company;

public class Warrior extends Hero implements HavingSuperAbility {


    @Override
    public String applySuperAbility(String Phyic) {
        return "Воин рименил" + " "+ Phyic;
    }
}
