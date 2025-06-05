package com.codemanship.marsrover;

public class Rover
{
    private int x;
    private int y;
    private Direction direction;

    public Rover(int x, int y, Direction direction)
    {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public Direction getDirection()
    {
        return direction;
    }

    public String getInitialState()
    {
        return "The rover has been dropped at coordinates (" + x + "," + y + ") facing " + direction;
    }
}
