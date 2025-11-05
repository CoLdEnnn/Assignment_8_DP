package hero;

import visitor.BanVisitor;
import visitor.HeroVisitor;

public interface Hero {
    void pickHero(HeroVisitor visitor);
    void banHero(BanVisitor visitor);
}
