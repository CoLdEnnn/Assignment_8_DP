package visitor;

import hero.Carry;
import hero.Mid;
import hero.Support;

public class Pick implements HeroVisitor{
    @Override
    public void visitSupport(Support sup){
        System.out.println("Picking support...");
        System.out.println("Shadow Shaman");
    }

    @Override
    public void visitMid(Mid mid){
        System.out.println("\nPicking mid...");
        System.out.println("Invoker");
    }
    @Override
    public void visitCarry(Carry carry){
        System.out.println("\nPicking carry...");
        System.out.println("Ogre Magi");
    }
}
