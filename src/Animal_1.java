//hierarchial inheritance
public class Animal_1 {
    void eat(){
        System.out.println("eating......");
    }
}
class Dog extends Animal_1{
    void bark(){
        System.out.println("barking....");
    }
}
class Cat extends Animal_1{
    void meow(){
        System.out.println("meowing...");
    }
}
class Test{
    public static void main(String[] args) {
        Cat c=new Cat();
        Dog d=new Dog();
        c.eat();
        c.meow();
        d.eat();
        d.bark();
    }

}
