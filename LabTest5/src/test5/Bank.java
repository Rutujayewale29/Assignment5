package test5;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Account ac=new Account();//creating object
    ac.setAcid(9);//set values
    ac.setName("Rutuja");
    ac.setBal(5000);
    //getting values
    System.out.println("Customer ID:-"+ac.getAcid());
    System.out.println("Customer name:-"+ac.getName());
    System.out.println("Account Balance:-"+ac.getBal());
    System.out.println("Enter Amount for Withdraw Cash");
    Scanner sc=new Scanner(System.in);//user input
    int w=sc.nextInt();
    ac.withdraw(w);
    System.out.println("Enter Amount for Deposite Cash");
    int de=sc.nextInt();
    ac.deposit(de);
    sc.close();
	}

}
