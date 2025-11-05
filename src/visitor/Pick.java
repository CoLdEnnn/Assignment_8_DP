package visitor;

import hero.*;

public class Pick implements HeroVisitor{
    @Override
    public void visit(Hero hero) {
        System.out.println("\nPicking hero... \n" + hero.getName() + " \nRole: " +  hero.getRole());
    }

//    @Override
//    public void visitSupport(Support sup){
//        System.out.println("Picking support...");
//        System.out.println("Shadow Shaman");
//    }
//
//    @Override
//    public void visitMid(Mid mid){
//        System.out.println("\nPicking mid...");
//        System.out.println("Invoker");
//    }
//    @Override
//    public void visitCarry(Carry carry){
//        System.out.println("\nPicking carry...");
//        System.out.println("Ogre Magi");
//    }
//
//    @Override
//    public void visitOfflane(Offlane offlane) {
//        System.out.println("\nPicking offlane...");
//        System.out.println("Legion Commander");
//    }
//
//    @Override
//    public void visitHardSupport(HardSupport hardsup) {
//        System.out.println("\nPicking hard support...");
//        System.out.println("Lion");
//    }
}
