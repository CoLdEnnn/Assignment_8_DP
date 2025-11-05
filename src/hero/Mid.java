package hero;

import visitor.BanVisitor;
import visitor.HeroVisitor;

public class Mid implements Hero{
    @Override
    public void pickHero(HeroVisitor visitor) {
        visitor.visitMid(this);
    }
    @Override
    public void banHero(BanVisitor visitor) {
        visitor.banMid(this);
    }
}
