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
        if (attackId > 0)
            this.attackId = attackId;
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
            throw new IllegalArgumentException("Name of attack must be at least one character long.");
    }

    public String getButtonInput() {
        return buttonInput;
    }

    public void setButtonInput(String buttonInput) {
        if (buttonInput.length() > 0)
            this.buttonInput = buttonInput;
        else
            throw new IllegalArgumentException("Button input must be at least one character long.");
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

    @Override
    public String toString() {
        return getName();
    }
}
