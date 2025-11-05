package visitor;

import hero.*;

public interface HeroVisitor {
    void visitSupport(Support sup);
    void visitMid(Mid mid);
    void visitCarry(Carry carry);
    void visitOfflane(Offlane offlane);
    void visitHardSupport(HardSupport hardsup);
}
