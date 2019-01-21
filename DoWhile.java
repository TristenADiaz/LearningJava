import java.util.InputMismatchException;
import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int SecretPass = 102415;
		int value = 0;
		int Warning = 0;
		int attempts = 4;
		
		do {
			
			try {
				//main part of the do-while loop.
				System.out.println("Enter the Secret password...");
				System.out.println("You have "+attempts+" of 4 attempts left.");
				value = scanner.nextInt();
			
				//if statements that apply to limit how many times you can attempt to login.
				if(value != SecretPass) {
					if(attempts >= 2) { 
						System.out.println("WRONG! Try again!");
					}else if (attempts == 1) {
						System.out.println("You've Ran out of attempts.");
					}
						//Removes an attempt after you've failed to input correct SecretPass.
						attempts = attempts - 1;
						if(attempts == 0) {
							//Jumps out of the loop
							break;
				
						}
				}
		
			} catch (InputMismatchException ex){
		         System.out.println("Invalid Input. Please provide Numbers only!");
		         break;
				}
			
		}
		while(value != SecretPass);
		//Outside of Loop
		if(value == SecretPass) {
		System.out.println("Access Granted!");
		} else {
		System.out.println("Access Denied!");
		}
		
		/* 
		System.out.println("Enter the Secret password...");
		int SecretPass = scanner.nextInt();
		
		
		while(SecretPass != 102415) {
		System.out.println("Enter the Secret password...");
		SecretPass = scanner.nextInt();
		} */
		
	}

}
