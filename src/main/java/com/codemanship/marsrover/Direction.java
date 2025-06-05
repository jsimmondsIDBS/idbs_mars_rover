package com.codemanship.marsrover;

public enum Direction
{
    N("North"),
    E("East"),
    S("South"),
    W("West");

    private final String name;

    public String getName()
    {
        return name;
    }

    Direction(String name)
    {
        this.name = name;
    }
}
