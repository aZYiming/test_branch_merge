package com.vainycos.dear.dal;

public class Vainycos {

    public String getName(String name){
        if(name.contains("v")){
            return name;
        }
        return "this is demo branch";
    }

    public String demoBranch(String name){
        if(name.contains("contains")){
            return "demo branch";
        }
        return "demo";
    }
}
