package com.example.assignment2;

public class Fighter {

    private int fighterId;
    private String name;
    private String gender;
    private String playStyle;
    private int skillLevel;
    private String strengths;
    private String weaknesses;
    private int gameId;

    public Fighter(int fighterId, String name, String gender, String playStyle, int skillLevel, String strengths, String weaknesses, int gameId) {
        setFighterId(fighterId);
        setName(name);
        setGender(gender);
        setPlayStyle(playStyle);
        setSkillLevel(skillLevel);
        setStrengths(strengths);
        setWeaknesses(weaknesses);
        setGameId(gameId);
    }

    public int getFighterId() {
        return fighterId;
    }

    public void setFighterId(int fighterId) {
        this.fighterId = fighterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPlayStyle() {
        return playStyle;
    }

    public void setPlayStyle(String playStyle) {
        this.playStyle = playStyle;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String getStrengths() {
        return strengths;
    }

    public void setStrengths(String strengths) {
        this.strengths = strengths;
    }

    public String getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(String weaknesses) {
        this.weaknesses = weaknesses;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    @Override
    public String toString() {
        return getName();
    }
}
