package ru.ifmo.pokemon;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main{
    public static void main(String[] args) {
        Battle b = new Battle();
        Farfetch p1 = new Farfetch("Farfetch", 1);
        Meowth p2 = new Meowth("Meowth", 1);
        Persian p3 = new Persian("Persian", 1);
        Ralts p4 = new Ralts("Ralts", 1);
        Kirlia p5 = new Kirlia("Kirlia", 1);
        Gardevoir p6 = new Gardevoir("Gardevoir", 1);
        b.addFoe();
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}