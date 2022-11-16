package ru.ifmo.se.moves;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove{
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double v) {
        if (p.getCondition().equals(Status.PARALYZE) || p.getCondition().equals(Status.BURN) || p.getCondition().equals(Status.POISON)){
            v = v*2;
        }
        p.setMod(Stat.HP, (int) v);
    }


    @Override
    protected String describe() {
        return "использует Facade";
    }
}
