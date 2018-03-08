import java.util.Scanner;


public class reviewing2 {
public static void main(String args[]) {
	Scanner keyboard=new Scanner(System.in);
	
		
	// create a math thin with two inputs 
int user1, user2, sum;

System.out.print("Please enter a number you wish to multiply  ");
user1=keyboard.nextInt();
System.out.print("Please enter another number you wish to multiply  ");
user2=keyboard.nextInt();
sum=user1*user2;

System.out.print("You entered "+user1+ " with "+user2+" which is "+ sum);

   }
}

