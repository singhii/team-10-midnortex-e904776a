package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Character {
    String name;
    String DEFAULT_CHARACTER_NAME= "Player 1";
    int defaultStartingX=0;
    int defaultStartingY=0;
    Position position;
   

    public Character(){
        this.name=DEFAULT_CHARACTER_NAME;
        Position startingPosition = new Position(defaultStartingX, defaultStartingY);
        this.position=startingPosition;

    }
    public Character(String name){
        this.name=name;
        Position startingPosition = new Position(defaultStartingX, defaultStartingY);
        this.position=startingPosition;
            
    }

    public void setName(String name){
        this.name=name;    
    }
    
    public String getName(){
        return this.name;
    }
    
   public Position getPosition()
   {
        return this.position;
   }
   
   public void setPosition(int xCoordinates, int yCoordinates)
   {
       // position.setPosition(xCoordinates, yCoordinates);
       Position position = new Position(xCoordinates, yCoordinates);
       this.position=position;
   }
    public Position moveCharacter(DIRECTION direction) {

        GameMap g = new GameMap();
        Position p = new Position(0,0);
        Position currentPos = getPosition();
        p = g.calculatePosition(currentPos,direction);
        return p;
    }

}
