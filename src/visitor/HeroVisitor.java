package visitor;

import hero.Carry;
import hero.Mid;
import hero.Support;

public interface HeroVisitor {
    void visitSupport(Support sup);
    void visitMid(Mid mid);
    void visitCarry(Carry carry);
}
