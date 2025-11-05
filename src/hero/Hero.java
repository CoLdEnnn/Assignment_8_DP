package hero;

import visitor.HeroVisitor;

public class Hero {
    private final String name;
    private final int role;

    public Hero(Builder builder) {
        this.name = builder.name;
        this.role = builder.role;
    }

    public String getName() { return name;}
    public int getRole() { return role;}
    public void pick(HeroVisitor visitor) {
        visitor.visit(this);
    }
}

//package hero;
//
//import visitor.BanVisitor;
//import visitor.HeroVisitor;
//
//public interface Hero {
//    void pickHero(HeroVisitor visitor);
//    void banHero(BanVisitor visitor);
//}