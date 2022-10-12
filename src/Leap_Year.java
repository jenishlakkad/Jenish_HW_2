//Que:2. WAP to input any year like 1989 and find out if it is leap year

import java.util.*;

public class Leap_Year
{
    public static void main(String[] args)
    {
        Scanner dis = new Scanner(System.in);
        System.out.println("Enter Year:- ");
        int x = dis.nextInt();
        if (x % 400 == 0 || x % 4 == 0 && x % 100 != 0)
        {
            System.out.println(x + " is a Leap Year");
        } else
        {
            System.out.println(x + " is a not Leap Year");
        }
    }
}
//Out Put For Example:-
//        Enter Year:-
//        354
//        354 is a not Leap Year