package hero;

import visitor.HeroVisitor;

public class Support implements Hero{
    @Override
    public void pickHero(HeroVisitor visitor) {
        visitor.visitSupport(this);
    }
}
