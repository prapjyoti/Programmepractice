package ProgrammePra1;
/*
Example of Constructor Overloading
//Java program to overload constructors
111 Karan 0
222 Aryan 25
 */

public class Student5 {
    int id; //instance variable//local variable
    String name;
    int age;
    //creating two arg constructor
    Student5(int i,String n){ //constructor name and class name must be same
        id = i;// //initiolize the variable //assign the value of variable
        name = n;

        }
        //creating 3 arg constructor or 3 parameter cons
        Student5(int i,String n,int a){
        id = i;
        name = n;
        age = a;
        }
        //create 1 instance method
    public void display(){
        System.out.println(id + " "+name+ " "+age );
    }
     //main method
    public static void main(String[] args) {
        Student5 s1=new Student5(111, "Karan");//create obj to call method
        Student5 s2=new Student5(222, "Aryan",25);
        s1.display();
        s2.display();


    }
    }


