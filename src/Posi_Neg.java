//Que:8. WAP to input any number and fid our if it is positive , negative or zero
import java.util.*;
public class Posi_Neg {
    static double x;
    public static void getdata(){
        Scanner dis=new Scanner(System.in);
        System.out.println("Enter any Digit:- ");
        x=dis.nextDouble();
    }
    public static void cal(){
        if(x<0){
            System.out.println(x+" Is Negative");
        } else if (x>0) {
            System.out.println(x+" Is Positive");
        }
        else {
            System.out.println(x+" Is Zero");
        }
    }

    public static void main(String[] args) {
        getdata();
        cal();
    }
}
//Out Put For Example:-
//Enter any Digit:-
//        -1
//        -1.0 Is Negative

