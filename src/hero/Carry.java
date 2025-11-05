package hero;

import visitor.HeroVisitor;

public class Carry implements Hero {
    @Override
    public void pickHero(HeroVisitor visitor) {
        visitor.visitCarry(this);
    }
}
