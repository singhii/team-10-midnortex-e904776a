![Gamer](images/specByExample.jpg)
Feature: Move in a direction 
    
    I want to move my character. If they attempt to 
    move past a boundary, the move results in no change in position but does increment move count.

    Scenario Outline: Move in a direction
        Given the character starts at position with XCoordinates <startingPositionX> 
        And starts at YCoordinates <startingPositionY>
        And the player chooses to move in <direction>
        And the current move count is <startingMoveCount>
        When the character moves
        Then the character is now at position with XCoordinates <endingPositionX>
        And YCoordinates <endingPositionY>
        And the new move count is <endingMoveCount>
        Examples:
            | startingPositionX | startingPositionY | direction | startingMoveCount | endingPositionX | endingPositionY | endingMoveCount |
            | 0 | 0 | RIGHT | 0 | 1 | 0 | 1 |
            | 0 | 0 | DOWN | 0 | 0 | 0 | 1 |
            | 0 | 5 | LEFT | 5 | 0 | 5 | 6 |
            | 9 | 9 | RIGHT | 21 | 9 | 9 | 22 |
            | 4 | 8 | LEFT | 113 | 3 | 8 | 114 |