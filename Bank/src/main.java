import java.util.Scanner;

public class main {
	static Scanner bot = new Scanner(System.in);
	static BankAccount[] bAccount = new BankAccount[5];

	public void mainMenu(){
		char quit = 'n';
		String temp;
		while (quit != 'y'){
			System.out.println("Welcome to Vikram's Bank! Please choose an option from the list below.");
			System.out.println("\t1. Create account\n\t2. Login to your account\n\t3. Show list of accounts\n\t4. Quit");
			int menuChoice =  bot.nextInt();
			switch(menuChoice){
			case 1:
				break;	
			case 2:
				break;
			case 3:
				break;
			}
			System.out.println("Would you like to quit?");
			temp = bot.nextLine();
			quit = temp.charAt(0);
		}
	}
		
	
	
	
	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		main atm = new main();
		atm.mainMenu();
		
			

		

	}

}
