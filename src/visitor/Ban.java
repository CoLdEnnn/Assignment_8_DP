package visitor;

import hero.*;

public class Ban implements BanVisitor {
    @Override
    public void banCarry(Carry carry) {
        System.out.println("Choosing hero to ban...");
        System.out.println("Morpling banned");
    }
    @Override
    public void banMid(Mid mid) {
        System.out.println("Choosing hero to ban...");
        System.out.println("Tinker banned");
    }
    @Override
    public void banOfflane(Offlane offlane) {
        System.out.println("Choosing hero to ban...");
        System.out.println("Morpling banned");
    }
    @Override
    public void banSupport(Support support) {
        System.out.println("Choosing hero to ban...");
        System.out.println("Morpling banned");
    }

    @Override
    public void banHardSupport(HardSupport hardSup) {
        System.out.println("Choosing hero to ban...");
        System.out.println("Morpling banned");
    }
}
