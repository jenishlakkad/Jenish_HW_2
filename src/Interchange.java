//Que:5. WAP to input any two numbers and then print their interchanged value

import java.util.*;
public class Interchange {
    static int x,y,a ;
    public static void main(String[] args) {
        Scanner dis=new Scanner(System.in);
        System.out.println("Enter the value of X and Y");
        x=dis.nextInt();
        y=dis.nextInt();
        System.out.println("before swapping numbers: "+x +"  "+ y);
        a=x;
        x=y;
        y=a;
        System.out.println("After Swapping numbers: "+x+" "+y);
    }
}

//Out Put For Example:-
//Enter the value of X and Y
//        1
//        2
//        before swapping numbers: 1  2
//        After Swapping numbers: 2 1