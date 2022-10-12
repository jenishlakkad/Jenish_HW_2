//Que:1. Input any two number and find out its odd or even use turnery operator (? :)

import java.util.*;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner dis=new Scanner(System.in);
        System.out.println("Enter any number:- ");
        int x= dis.nextInt();
        String msg=(x %2==0)?"The number "+x+" is Even " : "The number "+x+" is Odd ";
        System.out.println(msg);
    }
}

//Out Put For Example:-
//        Enter any number:-
//        345
//        The number 345 is Odd