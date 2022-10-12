//Que:10. Input any alphabet from a to f and print their city name accordingly (use Switch) any other
//        alphabet should be invalid entry

import java.util.*;
public class City {
    static char x,y;
    public static void getdata(){
        Scanner dis=new Scanner(System.in);
        System.out.println("Enter any Alphabet form A to F ");
        x=dis.next().charAt(0);
    }
    public static void cal(){
        switch (x)
        {
//            case "a":
//                System.out.println("AHMEDABAD");
//                break;
//            case "b":
//                System.out.println("BHUJ");
//                break;


        }

    }

    public static void main(String[] args) {
        getdata();
        cal();
    }
}
//Out Put For Example:-
