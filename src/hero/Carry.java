package hero;

import visitor.BanVisitor;
import visitor.HeroVisitor;

public class Carry implements Hero {
    @Override
    public void pickHero(HeroVisitor visitor) {
        visitor.visitCarry(this);
    }

    @Override
    public void banHero(BanVisitor visitor) {
        visitor.banCarry(this);
    }
}
