package ProgrammePra1;
/*
Creating child class
 */

public class Bike2 extends Vehicle{

    //defining the same method as in the parent class
    public void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj=new Bike2();//create obj coz its instance method
        obj.run();//calling method
    }
}
