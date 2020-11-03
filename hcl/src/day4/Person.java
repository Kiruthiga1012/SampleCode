package day4;

public class Person {
	Account acc_holder;
	private String name;
	private int age;
	public Account getAcc_holder() {
		return acc_holder;
	}
	public void setAcc_holder(Account acc_holder) {
		this.acc_holder = acc_holder;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void main(String[] args) {
		Account account1=new Account();
		account1.setAccNum(account1.getAccNum());
		account1.setBalance(2000);
		Person person1=new Person();
		person1.setAcc_holder(account1);
		person1.getAcc_holder().getAccNum();
		person1.setName("Smith");
		person1.setAge(30);
		//SavingsAccount s1=new SavingsAccount();
		account1.deposit(2000);
		account1.getBalance();
		
		
		  Account account2=new Account(); 
		  account2.setAccNum(account2.getAccNum());
		  account2.setBalance(3000); 
		  Person person2=new Person();
		  person2.setAcc_holder(account2); 
		  person2.getAcc_holder().getAccNum();
		  person2.setName("Kathy"); 
		  person2.setAge(30); 
		  SavingsAccount s2=new SavingsAccount(); 
		  s2.withdraw(2000);
		  s2.getBalance();
		 
	}

}
