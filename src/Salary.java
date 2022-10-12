//Que:6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
//        HRA = basic salary 10%
//        DA = Basic salary 8%
//        TA = Basic salary 9%
//        PF= Basic salary 20%
//        Gross salary = basic salary + HRA + TA + DA -PF

import java.util.*;
public class Salary {
    static int id;
    static double BS,hra,da,ta,pf,GS;
    static String name;
    public static void getdata(){

        Scanner dis=new Scanner(System.in);
        System.out.println("Enter your name:- ");
        name=dis.nextLine();
        System.out.println("Enter Employee ID:-");
        id=dis.nextInt();
        System.out.println("Enter your Basic Salary:-");
        BS=dis.nextDouble();
    }
    public static void cal(){
        hra=0.1*BS;
        da=0.08*BS;
        ta=0.09*BS;
        pf=0.2*BS;
        GS=BS+hra+ta+da-pf;
    }
    public static void display(){

        System.out.println(name + "\t" + id + "\t" + hra + "\t " + da + "\t  " + ta + "\t" + pf + "\t  " + GS);

    }
    public static void main(String[] args) {
        getdata();
        cal();
        System.out.println("Name\tID\tHRA   \t DA   \t   TA  \t PF  \t Gross Salary");
        display();


    }
}
//Out Put For Example:-
//
//    Enter your name:-
//Jenish
//Enter Employee ID:-
//01
//Enter your Basic Salary:-
//75000
//Name	ID	HRA   	 DA   	   TA  	 PF  	 Gross Salary
//Jenish	1	7500.0	 6000.0	  6750.0	15000.0	  80250.0