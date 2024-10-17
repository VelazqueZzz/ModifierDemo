package modifierdemo;

public class ClassesIsSamePackages {

}
class ClassA extends ModifierDemo{
    public void printMessages(){
        System.out.println(publicNum);
        System.out.println(protectedNum);
        System.out.println(packagePrivateNum);
       // System.out.println(privateNum);
    }

}
class ClassB{
    public void printMessages(){
        ModifierDemo p = new ModifierDemo();
        System.out.println(p.publicNum);
        System.out.println(p.protectedNum);
        System.out.println(p.packagePrivateNum);
        //System.out.println(p.privateNum);
    }
}
