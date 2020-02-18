
public class BankAccount {

	public static int numAcc = 0;
	
	private String name = "Vikram";
	private double balance = 20.0;
	private int pinNum = 7355608;
	private boolean isLocked = false;
	
	public BankAccount(){
		numAcc++;
	}
	public BankAccount(String name, double balance, int pinNum, boolean isLocked){
		name = this.name;
		balance = this.balance;
		pinNum = this.pinNum;
		numAcc++;
	}
	public String transferAccount(String name){
		String oldName = name;
		this.name = name;
		return oldName;
	}
	public void deposit(double x){
		if(x>0.0){
			balance+=x;
		}
		if(isLocked==true && balance >= 0.0){
				isLocked = false;
		}
	}
	public void withdraw(double x){
		if(isLocked == true){
			System.out.println("Broke ass yo account locked pls deposit");
		}
		else{
			if(x>0.0){
				balance-=x;
			}	
			if(balance<0.0){
				balance-=30;
				isLocked = true;
			}	
		}	
	}
	public double getBalance(){
		return this.balance;
	}
	
	
	
}
