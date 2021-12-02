//Class programmer inherits the parent class Employee
public class Employee//super class {
    float salary = 50000;

}
class programmer extends Employee{//sub class extends the parent class
    int bonous=10000;

    public static void main(String[] args) {
        programmer p=new programmer();
        System.out.println("salary of programmer is:"+p.salary);
        System.out.println("bonous of programmer is:"+p.bonous);
    }
}
