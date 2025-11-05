package app;

import hero.Carry;
import hero.Hero;
import hero.Mid;
import hero.Support;
import visitor.HeroVisitor;
import visitor.Pick;

public class Application {
    public static void run(){
        Hero sup = new Support();
        Hero carry = new Carry();
        Hero mid = new Mid();

        HeroVisitor pick = new Pick();

        sup.pickHero(pick);
        carry.pickHero(pick);
        mid.pickHero(pick);
    }
}
