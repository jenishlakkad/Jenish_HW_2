//Que:12. Input any alphabet in uppercase and print it in lowercase

import java.util.*;
public class Alphabet_Case {
    public static void main(String[] args)
    {
         char x,y;
        System.out.println("Enter any Character:-");
        Scanner dis=new Scanner(System.in);
        x=dis.next().charAt(0);
        if (x>='A'&&x<='Z'){
            y=Character.toLowerCase(x) ;
            System.out.println("Lower Case:- "+y);
        }
        else {
            y=Character.toUpperCase(x) ;
            System.out.println("Upper Case:- "+y);
        }
    }
}
//Out Put For Example:-
//Enter any Character:-
//        A
//        Lower Case:- a
