package javaproject;


import java.util.Scanner;
public class bank {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		// TODO Auto-generated method stub
		int n;
		int balance=0,tmp=0;
		int user;
		System.out.print("***************Welcome To Bank Management System*********************\n\n");
		String name;
		String address;
		String phn;
		System.out.println("1. Create Account");
		System.out.println("2. Close Account");
		System.out.println("3. Login ");
		System.out.println("4. Account Details ");
		System.out.println("5. Display Account Details");
		System.out.println("6. Display Deductions \n");
		System.out.println("7. Quit");
		System.out.print("Enter Your Choice : ");
		n=myObj.nextInt();
		switch(n) {
		case 1:
			System.out.println("Enter Your Name : ");
			name=myObj.next();
			System.out.print("Enter Your Address : ");
			address=myObj.next();
			System.out.println("Enter you Phone Number : ");
			phn=myObj.next();
		case 2:
			System.out.println("Enter Your Name : ");
		
				
	case 3: // depositetem.out.print("Enter your account Number : ");
		tmp=myObj.nextInt();
		System.out.print("Enter Amount Of Money : ");
		balance=myObj.nextInt();
		System.out.println("\t Successfully Deposited.");
		}
		System.out.println("Wrong Accoount Number.");
		
		
		/*System.out.println("                   Enter Login Password               ");
		String name = myObj.nextLine();
		System.out.print("Password : " + name);*/
		}
	}
	class Account{
		String name,acc_type;
		int Acc_num,Acc_Balance;
		Account(){
		}
		Account(String n,int acc_num,int b,String a_t){
		name=n;
		Acc_num=acc_num;
		Acc_Balance=b;
		acc_type=a_t;
		}
		} // end class
	class create_account extends Account{
		create_account(String n,int acc_num,int b,String a_t){ // pass name and account type
		name=n;
		Acc_num=acc_num;
		Acc_Balance=b;
		acc_type=a_t;
		}
		create_account(){
		super();
		}
		void insert(String n,int acc_num,String a_t){ // input user name, account number and type
		name=n;
		acc_type=a_t;
		Acc_num=acc_num; // generate random number
		Acc_Balance=0;
		}
		void display_details(){
		System.out.println("Depositor Name :" +name);
		System.out.println("Account Number : "+Acc_num);
		System.out.println("Account Balance : "+Acc_Balance);
		System.out.println("Account Type : "+acc_type);
		}
		void deposite(int acc_num,int money){
		Acc_Balance=money;
		}
		int withdraw(int withd){
		Acc_Balance=Acc_Balance-withd;
		return Acc_Balance;
		}
		} // end class


	

