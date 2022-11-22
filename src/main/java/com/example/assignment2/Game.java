package com.example.assignment2;

public class Game {

    private int gameId;
    private String name;
    private int yearOfRelease;

    public Game(int gameId, String name, int yearOfRelease) {
        setGameId(gameId);
        setName(name);
        setYearOfRelease(yearOfRelease);
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return getName();
    }
}
