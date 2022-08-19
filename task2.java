import java.util.Random;
import java.util.Scanner;
public class task2
{
    public static void main(String args[])
    {
        int chance=0,ans=1;
        Random r=new Random();
        Scanner sc=new Scanner(System.in);
        do{
       
        int n,x=r.nextInt(99)+1;
        chance=0;
        do{
         chance++;
        System.out.println("Enter your value"); 
        n=sc.nextInt();  
            if(n==x)
            {
                System.out.println("Congrats!!!\nYou guessed correctly in "+chance+" chances");
                // score++;
            }
            else if(n<x) System.out.println("Guess higher");
            else System.out.println("Guess lower");
        }while(n!=x && chance<10);
        if(chance==10) System.out.println("Your chances are over and the correct ans was "+x);
        System.out.println("\nEnter 1 for next round and 0 to exit");
        ans=sc.nextInt();
    }while(ans==1);
    sc.close();
    }
}