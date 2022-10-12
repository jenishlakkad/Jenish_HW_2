//Que:14 Enter any value and the find out if it is number (0-9) or an alphabet or symbol

import java.util.*;
public class Keybord {
    public static void main(String[] args) {

        Scanner dis=new Scanner(System.in);
        System.out.println("Enter any character:-");
        char x=dis.next().charAt(0);
        System.out.println(x>='a'&&x<='z'?"Alphabet"
                :x>='A'&&x<='z'?"Alphabet"
                :x>='0'&&x<='9'?"Digit"
                :"Symbol");

    }
}
//Out Put For Example:-
//
//    Enter any character:-
//@
//        Symbol