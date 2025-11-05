package hero;

import visitor.HeroVisitor;

public class Mid implements Hero{
    @Override
    public void pickHero(HeroVisitor visitor) {
        visitor.visitMid(this);
    }
}
