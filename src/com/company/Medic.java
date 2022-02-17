package com.company;

public class Medic extends Hero implements HavingSuperAbility{
    private int healPoints = 10;

    public String increase_experience() {
        return healPoints + "%";

    }
    @Override
    public String applySuperAbility(String Phyic) {
        return "Медик применил " + Phyic ;

    }
}

