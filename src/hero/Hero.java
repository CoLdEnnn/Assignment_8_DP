package hero;

import visitor.HeroVisitor;

public interface Hero {
    void pickHero(HeroVisitor visitor);
}
