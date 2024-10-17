package anotherpackage;
import modifierdemo.ModifierDemo;
public class ClassInAnotherPackage {

}
class MyClassC extends ModifierDemo {
    public void printMessages(){
        System.out.println(publicNum);
        System.out.println(protectedNum);
        //System.out.println(packagePrivateNum);
        //System.out.println(privateNum);
    }
}
class MyClassD  {
    public void printMessages(){
        ModifierDemo p = new ModifierDemo();
        System.out.println(p.publicNum);
//        System.out.println(p.protectedNum);
//        System.out.println(p.packagePrivateNum);
//        System.out.println(p.privateNum);
    }
}
