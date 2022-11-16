package ru.ifmo.se.moves;
import ru.ifmo.se.moves.*;
import ru.ifmo.se.pokemon.*;

public class PowerGem extends SpecialMove {
    public PowerGem() {
        super(Type.ROCK, 80, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        pokemon.setMod(Stat.HP, (int) v);
    }
    @Override
    protected String describe() {
        return "использует Charm";
    }
}
