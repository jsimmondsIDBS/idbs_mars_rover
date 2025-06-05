package com.codemanship.marsrover;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RoverTest
{

    @Test
    void roverIsDroppedOnInitialLocation()
    {
        Rover rover = new Rover(5, 6, Direction.North);
        assertRoverLocationAndDirection(rover, 5, 6, Direction.North);
    }


    private static void assertRoverLocationAndDirection(Rover rover, int expectedX,
                                                        int expectedY, Direction expectedDirection)
    {
        assertEquals(expectedX, rover.getX());
        assertEquals(expectedY, rover.getY());
        assertEquals(expectedDirection, rover.getDirection());
    }
}
