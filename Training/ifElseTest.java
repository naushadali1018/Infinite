package Training;

import java.util.Scanner;

public class ifElseTest {
    public static void main(String[] args){
       int number;
       System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        if(number%2==0){
            System.out.println("This is a even number");
        }else{
            System.out.println("This is a not even number");
        }
        sc.close();
    }
}
