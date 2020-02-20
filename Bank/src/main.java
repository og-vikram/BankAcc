import java.util.Scanner;

public class main {
	static Scanner bot = new Scanner(System.in);
	static BankAccount[] bAccount = new BankAccount[5];

	public void mainMenu(){
		char quit = 'n';
		String temp;
		//while (quit != 'y'){
			System.out.println("Welcome to Vikram's Bank! Please choose an option from the list below.");
			System.out.println("\t1. Create account\n\t2. Login to your account\n\t3. Show list of accounts\n\t4. Quit");
			int menuChoice =  bot.nextInt();
			switch(menuChoice){
			case 1:
				create();
				break;	
			case 2:
				break;
			case 3:
				break;
			case 4:
				
				break;
				
			//}
			/*System.out.println("Would you like to quit?");
			temp = bot.nextLine();
			quit = temp.charAt(0);*/
		}
	}
	
	public void create(){
		
		if(BankAccount.numAcc<=4){
			bAccount[BankAccount.numAcc] = new BankAccount();
			bot.nextLine();
			System.out.println("Enter your name:");
			String name = bot.nextLine();
			bAccount[BankAccount.numAcc].setName(name);
			
			System.out.println("Enter your PIN:");
			int pin = bot.nextInt();
			bAccount[BankAccount.numAcc].setPin(pin);
			
			System.out.println("Enter your deposit amount");
			double dep = bot.nextDouble();
			bAccount[BankAccount.numAcc].deposit(dep);

		}
	}	
	
		
	
	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		main atm = new main();
		atm.mainMenu();
	}

}
