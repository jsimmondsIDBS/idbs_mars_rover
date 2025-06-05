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

    public Rover(String userInput)
    {
        String[] split = userInput.trim().split(",");
        x = Integer.parseInt(split[0]);
        y = Integer.parseInt(split[1]);
        direction = Direction.valueOf(split[2]);
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
        return "The rover has been dropped at coordinates (" + x + "," + y + ") facing " + direction.getName();
    }

    public void turn(String turnDirection)
    {
        if(turnDirection.equals("R"))
        {
            turnRight();
        }

    }

    private void turnRight()
    {
        if(direction == Direction.N)
        {
            direction = Direction.E;
        } else if (direction == Direction.E)
        {
            direction = Direction.S;
        }
        else if (direction == Direction.S)
        {
            direction = Direction.W;
        } else if (direction == Direction.W)
        {
            direction = Direction.N;
        }
    }
}