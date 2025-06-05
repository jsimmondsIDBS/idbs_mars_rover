package com.codemanship.marsrover;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoverTest
{

    @Test
    void roverIsDroppedOnInitialLocation()
    {
        Rover rover = new Rover(5, 6, Direction.North);

        assertEquals("The rover has been dropped at coordinates (5,6) facing North", rover.getInitialState());
    }

    @Test
    void roverIsDroppedOnCustomLocation()
    {
        Rover rover = new Rover(2, 3, Direction.South);

        assertEquals("The rover has been dropped at coordinates (2,3) facing South", rover.getInitialState());
    }

    @Test
    void roverRightTurnFromInitialLocation()
    {
        Rover rover = new Rover(5, 6, Direction.North);
        rover.turn("R");
        assertRoverLocationAndDirection(rover, 5, 6, Direction.East);
    }

    @Test
    void roverRightTurnFromEast()
    {
        Rover rover = new Rover(5,6, Direction.East);
        rover.turn("R");
        assertRoverLocationAndDirection(rover, 5,6, Direction.South);
    }

    @Test
    void roverRightTurnFullCircleFromInitialPosition()
    {
        Rover rover = new Rover(5,6,Direction.North);
        rover.turn("R");
        assertRoverLocationAndDirection(rover, 5, 6, Direction.East);
        rover.turn("R");
        assertRoverLocationAndDirection(rover, 5, 6, Direction.South);
        rover.turn("R");
        assertRoverLocationAndDirection(rover, 5,6,Direction.West);
        rover.turn("R");
        assertRoverLocationAndDirection(rover, 5,6, Direction.North);
    }


    private static void assertRoverLocationAndDirection(Rover rover, int expectedX, int expectedY, Direction expectedDirection)
    {
        assertEquals(expectedX, rover.getX());
        assertEquals(expectedY, rover.getY());
        assertEquals(expectedDirection, rover.getDirection());
    }




}