package app;

import hero.*;
import visitor.Pick;

public class Application {
    public static void run(){
        Hero invoker = new Builder()
                .name("Invoker")
                .role(2)
                .build();
        invoker.pick(new Pick());

        Hero axe = new Builder()
                .name("Axe")
                .role(3)
                .build();
        axe.pick(new Pick());

        Hero shaman = new Builder()
                .name("Shadow Shaman")
                .role(5)
                .build();
        shaman.pick(new Pick());

        Hero lion = new Builder()
                .name("Lion")
                .role(4)
                .build();
        lion.pick(new Pick());

        Hero Templar = new Builder()
                .name("Templar Assasin")
                .role(1)
                .build();
        Templar.pick(new Pick());
    }
}


//package app;
//
//import hero.*;
//        import visitor.Ban;
//import visitor.BanVisitor;
//import visitor.HeroVisitor;
//import visitor.Pick;
//
//public class Application {
//    public static void run(){
//        Hero sup = new Support();
//        Hero carry = new Carry();
//        Hero mid = new Mid();
//        Hero offlane = new Offlane();
//        Hero hardSupport = new HardSupport();
//
//        HeroVisitor pick = new Pick();
//
//        carry.pickHero(pick);
//        mid.pickHero(pick);
//        offlane.pickHero(pick);
//        sup.pickHero(pick);
//        hardSupport.pickHero(pick);
//
//        BanVisitor ban = new Ban();
//        carry.banHero(ban);
//        mid.banHero(ban);
//        offlane.banHero(ban);
//        sup.banHero(ban);
//        hardSupport.banHero(ban);
//    }
//}