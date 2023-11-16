package com.levelup.forestsandmonsters;

public class Character {
    String name;
    String DEFAULT_CHARACTER_NAME;


    public Character(){
        this.DEFAULT_CHARACTER_NAME="Player 1";
    }
    public Character(String name){
        this.name=name;    
    }

    void setName(String name){
        this.name=name;    
    }
    String getName(){
        return this.name;
    }
}
