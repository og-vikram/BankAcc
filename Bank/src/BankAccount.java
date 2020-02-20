
public class BankAccount {

	public static int numAcc = 0;
	
	private String name = "";
	private double balance = 0.0;
	private int pinNum = 0;
	private boolean isLocked = false;
	
	public BankAccount(){
		numAcc++;
	}
	public BankAccount(String name, double balance, int pinNum){
		this.name = name;
		this.balance = balance;
		this.pinNum = pinNum;
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
	
	
	public void setPin(int pinNum){
		this.pinNum = pinNum;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
}
