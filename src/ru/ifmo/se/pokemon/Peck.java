package ru.ifmo.se.moves;
import ru.ifmo.se.pokemon.*;

public class Peck extends PhysicalMove{
    public Peck(){
        super(Type.FLYING, 35, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double v) {
        p.setMod(Stat.HP, (int) v);
    }
    @Override
    protected String describe() {
        return "использует Peck";
    }
}
