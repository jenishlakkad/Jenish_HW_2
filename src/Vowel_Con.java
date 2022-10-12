//Que:16. Write a Java program that takes the user to provide a single character from the
//        alphabet. Print Vowel or Consonant, depending on the user input.
//        For eg:
//        Input an alphabet: p
//        Expected Output :
//        Input letter is Consonant
import java.util.*;

public class Vowel_Con {public static void main(String[] args) {
    Scanner dis=new Scanner(System.in);
    System.out.println("Enter Alphabet");

    char S1=dis.next().charAt(0);


        if (S1 =='a' || S1 =='e' || S1 =='i' || S1 =='o'
                || S1 =='u')
        {
            System.out.println(S1+" Is a Vowel  ");
        }
        else
            System.out.println( S1+" Is a Consonant ");
}
}
//Out Put For Example:-
//Enter Alphabet
//w
//        w Is a Consonant
