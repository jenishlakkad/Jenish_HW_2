//Que:-7. WAP input any five number and then find average of five numbers

import java.util.*;

public class Average {
    static double avg,a,b,c,d,e;
    public static void getdata(){
        Scanner dis=new Scanner(System.in);
        System.out.println("Enter Five number:- ");
        a=dis.nextDouble();
        b=dis.nextDouble();
        c=dis.nextDouble();
        d=dis.nextDouble();
        e=dis.nextDouble();
    }
    public static void cal(){
        avg=(a+b+c+d+e)/5;
    }
    public static void display(){
        System.out.println("Average of the numbers is:- "+avg);
    }
    public static void main(String[] args) {
        getdata();
        cal();
        display();
    }

}

//Out Put For Example:-
//Enter Five number:-
//        35.2
//        25
//        46
//        54
//        45
//        Average of the numbers is:- 41.04