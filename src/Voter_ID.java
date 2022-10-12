//Que:11. Write Java program to allow the user to input his/her age. Then the program will show if the
//        person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years
//        old.

import java.util.*;

public class Voter_ID
{
    static int age;
    public static void getdata()
    {
        Scanner dis = new Scanner(System.in);
        System.out.println("Enter your age:- ");
        age = dis.nextInt();
    }

    public static void cal()
    {
        if (age < 18)
        {
            System.out.println("You are not eligible for voter ID. As you are under 16");
        } else
        {
            System.out.println("You are eligible for voter ID.");
        }
    }

    public static void main(String[] args)
    {
        getdata();
        cal();
    }
}

//Out Put For Example:-
//Enter your age:-
//        18
//        You are eligible for voter ID.