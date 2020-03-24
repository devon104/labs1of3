
/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
       Scanner user_input = new Scanner(System.in);
       int sum = 0;
       int product = 1;
       System.out.println("Enter any number: ");

       int num =  user_input.nextInt();

       user_input.close();

       for(int i = 1; i <= num; i++){
           sum = sum + i;
           product = product * i;
       }

       System.out.println("The sum of your input is "+ sum);
       System.out.println("The product of your input is "+ product);









    }
}
