package visitor;

import hero.*;

public interface BanVisitor {
    void banCarry(Carry carry);
    void banMid(Mid mid);
    void banOfflane(Offlane offlane);
    void banSupport(Support support);
    void banHardSupport(HardSupport hardsup);
}
