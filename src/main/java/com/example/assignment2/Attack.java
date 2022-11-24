package com.example.assignment2;

public class Attack {
    
    private int attackId;
    private String name;
    private String buttonInput;
    private int fighterId;

    public Attack(int attackId, String name, String buttonInput, int fighterId) {
        setAttackId(attackId);
        setName(name);
        setButtonInput(buttonInput);
        setFighterId(fighterId);
    }

    public int getAttackId() {
        return attackId;
    }

    public void setAttackId(int attackId) {
        this.attackId = attackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getButtonInput() {
        return buttonInput;
    }

    public void setButtonInput(String buttonInput) {
        this.buttonInput = buttonInput;
    }

    public int getFighterId() {
        return fighterId;
    }

    public void setFighterId(int fighterId) {
        this.fighterId = fighterId;
    }

    @Override
    public String toString() {
        return getName();
    }
}
