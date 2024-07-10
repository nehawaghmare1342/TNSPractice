package daynine;

public class SavingAccount extends Customer implements Bank{
	
	private int accNo;
	private float balance;
	
	//Constructor
	public SavingAccount(String name, String city, int accNo, float balance) {
		super(name, city);
		this.accNo = accNo;
		this.balance = balance;
	}
	
	//Getter setter
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public void deposite(float amount) {
		// TODO Auto-generated method stub
		
		if(amount< 0 || amount> Deposite_Limit)
		{
			System.out.println("Please Deposite Vlaid Amount");
		}
		else {
			{
				balance+=amount;
				System.out.println("RS: "+amount+"is deposited successfully");
			}
		}
	}
	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		
		if(amount<=balance - MINBAL)
		{
			balance-=amount;
			System.out.println("RS: "+amount+"is withdraw successfully");
		}
		else {
			{
				System.out.println("Insufficent  balance");
			}
			
		}
	}

	@Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", balance=" + balance + ", getAccNo()=" + getAccNo()
				+ ", getBalance()=" + getBalance() + ", getName()=" + getName() + ", getCity()=" + getCity()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
