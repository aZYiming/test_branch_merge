package com.vainycos.dear.dal;

public class Vainycos {

    public String getName(String name){
        if(name.contains("v")){
            return name;
        }else {
            return "whose your daddy";
        }
    }

    public String demoBranch(String name){
        if(name.contains("contains")){
            return "branch";
        }else {
            return "";
        }
    }
}
