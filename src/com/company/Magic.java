package com.company;

public class Magic extends Hero implements HavingSuperAbility {


    @Override
    public String applySuperAbility(String Phyic) {
        return "Маг применил суперспособность  " + Phyic;
    }
}
