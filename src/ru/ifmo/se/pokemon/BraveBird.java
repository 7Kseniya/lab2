package ru.ifmo.se.moves;
import ru.ifmo.se.pokemon.*;

public class BraveBird extends PhysicalMove{
    public BraveBird(){
        super(Type.FLYING, 120, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double v) {
        v = v/3;
        p.setMod(Stat.HP, (int) v);
    }
    @Override
    protected String describe() {
        return "использует BraveBird";
    }
}
