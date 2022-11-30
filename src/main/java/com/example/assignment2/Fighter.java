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
        if (fighterId > 0)
            this.fighterId = fighterId;
        else
            throw new IllegalArgumentException("Fighter ID must be greater than 0");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0)
            this.name = name;
        else
            throw new IllegalArgumentException("Name of fighter must be at least one character long.");
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equals("M") || gender.equals("F") || gender.equals("B"))
            this.gender = gender;
        else
            throw new IllegalArgumentException("Gender can oly be M, F or B");
    }

    public String getPlayStyle() {
        return playStyle;
    }

    public void setPlayStyle(String playStyle) {
        if (playStyle.length() > 0)
            this.playStyle = playStyle;
        else
            throw new IllegalArgumentException("Name of playStyle must be at least one character long.");
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        if (skillLevel >= 0 && skillLevel <= 10)
            this.skillLevel = skillLevel;
        else
            throw new IllegalArgumentException("Skill level must be between 0 and 10");
    }

    public String getStrengths() {
        return strengths;
    }

    public void setStrengths(String strengths) {
        if (strengths == null || strengths.length() > 5)
            this.strengths = strengths;
        else
            throw new IllegalArgumentException("This fighter's strengths must be at least 5 characters long.");
    }

    public String getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(String weaknesses) {
        if (weaknesses == null || weaknesses.length() > 5)
            this.weaknesses = weaknesses;
        else
            throw new IllegalArgumentException("This fighter's weaknesses must be at least 5 characters long.");
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

    @Override
    public String toString() {
        return getName();
    }
}
