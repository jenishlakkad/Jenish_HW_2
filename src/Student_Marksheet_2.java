//Que: 4. same as below but pass or fails on the basis of..student needs to pass all the subjects
//WAP to input student name, roll no, 3 subjects marks..and find out total, percentage and result if
//        he is pass or fail on basis of percentage (pass>=35) and also give them grade
//        >= 80 A+
//        >= 60 A
//        >= 50 B
//        >= 35 C

import java.util.Scanner;

public class Student_Marksheet_2
{
    static int total, per, result, m1, m2, m3;
    static String grade, name;

    public static void getdata()
    {
        Scanner dis = new Scanner(System.in);
        System.out.println("Enter your name:- ");
        name = dis.nextLine();
        System.out.println("Enter marks of 3 subjects:-");
        m1 = dis.nextInt();
        m2 = dis.nextInt();
        m3 = dis.nextInt();

    }

    public static void cal()
    {
        total = m1 + m2 + m3;
        per = total * 100 / 400;
        if (m1 >= 35 && m2 >= 35 && m3 >= 35 && per<100)
        {
            grade = "Pass";
        } else if (m1 < 35 || m2 < 35 || m3 < 35)
        {
            grade = "Fail";
        } else
        {
            System.out.println("You have entered wrong data ");
        }
    }

    public static void display()
    {
        System.out.println(name + "\t" + m1 + "\t" + m2 + "\t" + m3 + "\t" + total + "\t   " + per + "\t" + grade);
    }

    public static void main(String[] args)
    {
        getdata();
        cal();
        System.out.println("name\tm1\tm2\tm3\ttotal\tper\tresult");
        display();

    }
}
//
//Out Put For Example:-
//        Enter your name:-
//        Jenish
//        Enter marks of 3 subjects:-
//        34
//        35
//        35
//        name	m1	m2	m3	total	per	result
//        Jenish	34	35	35	104	   26	Fail
