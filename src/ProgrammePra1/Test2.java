package ProgrammePra1;
/*
On this main method to call all methods via create a obj

Output:
SBI Rate of Interest: 8
ICICI Rate of Interest: 7
AXIS Rate of Interest: 9
 */

public class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i=new ICICI();
        Axis a =new Axis();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("Axis Rate of Interest: "+a.getRateOfInterest());
    }
}
