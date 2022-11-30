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
        if (gameId > 0)
            this.gameId = gameId;
        else
            throw new IllegalArgumentException("Game ID must be greater than 0");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0)
            this.name = name;
        else
            throw new IllegalArgumentException("Name of game must be at least 1 character long.");
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        if (yearOfRelease >= 1958)
            this.yearOfRelease = yearOfRelease;
        else
            throw new IllegalArgumentException("Everyone knows that the first video game came out in 1958, so there's n way the release year could be before that.");
    }

    @Override
    public String toString() {
        return getName();
    }
}
