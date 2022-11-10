package test5;
public class Account {
	//declaring private data member
       private int acid;
       private String name;
       private int bal;
       //using getter and setter
	public int getAcid() {
		return acid;
	}
	public void setAcid(int acid) {
		this.acid = acid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	} 
	//declare method foe withdraw
	public void withdraw(int n)
	{
		int cam;
		if(n>bal)//for comapred balance is less than withdraw amount
		{
			System.out.println("Please enter Small Amount");
		}
		else
		{
			cam=bal-n;
			System.out.println("Your current balance is:-"+cam);
		}
	}
	//declare method for deposite
	public void deposit(int d)
	{
		int amt;
		amt=bal+d;//add amount in current balance
		System.out.println("Your current balance is:-"+amt);
	}
	public Account()
	{
		super();
	}
}
