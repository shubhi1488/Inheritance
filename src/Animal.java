//class babydog inherits class dog which inherits the super class animal
public class Animal {
    void eat(){
        System.out.println("eating....");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}
class babydog extends dog{
    void weep(){
        System.out.println("weeping....");
    }

}
class TestInheritance2{
    public static void main(String[] args) {
        babydog b=new babydog();
        b.eat();
        b.bark();
        b.weep();
    }
}
