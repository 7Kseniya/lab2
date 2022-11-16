package ru.ifmo.se.moves;
import ru.ifmo.se.pokemon.*;
public class FeintAttack extends PhysicalMove{
    public FeintAttack(){
        super(Type.DARK, 60, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected String describe() {
        return "использует FeintAttack";
    }
}
