package app;

import hero.*;
import visitor.Ban;
import visitor.BanVisitor;
import visitor.HeroVisitor;
import visitor.Pick;

public class Application {
    public static void run(){
        Hero sup = new Support();
        Hero carry = new Carry();
        Hero mid = new Mid();
        Hero offlane = new Offlane();
        Hero hardSupport = new HardSupport();

        HeroVisitor pick = new Pick();

        carry.pickHero(pick);
        mid.pickHero(pick);
        offlane.pickHero(pick);
        sup.pickHero(pick);
        hardSupport.pickHero(pick);

        BanVisitor ban = new Ban();
        carry.banHero(ban);
        mid.banHero(ban);
        offlane.banHero(ban);
        sup.banHero(ban);
        hardSupport.banHero(ban);
    }
}
