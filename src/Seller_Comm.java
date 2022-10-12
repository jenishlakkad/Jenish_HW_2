//Que:9. WAP input sales id, seller's name, sales amount, salary basic and then find this sales
//        commission
//        sales amount >= 50,000 35%
//        sales amount >= 30,000 20%
//        >= 20,000 10%
//        >= 10,000 5%
//        < 10,000 2%

import java.util.*;
public class Seller_Comm {
    static String sname;
    static int id;
    static double sa,sb,sc; //samount=sales amount, sb=salary basic,sc=sales commission
    public static void getdata(){
        Scanner dis=new Scanner(System.in);
        System.out.println("Enter your Name:- ");
        sname=dis.nextLine();
        System.out.println("Enter your ID:-");
        id=dis.nextInt();
        System.out.println("Enter your Sales Amount:-");
        sa=dis.nextDouble();
        System.out.println("Enter your Salary Basic");
        sb=dis.nextDouble();
    }

}
//Out Put For Example:-
