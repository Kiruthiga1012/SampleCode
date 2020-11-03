package day1;

public class Employee {
    int eno; 
	String ename;
    /* Employee(){
    	 eno=1;
    	 ename="Kiruthiga"; 
     }*/
     void accept(int eno,String ename){
    	 this.eno= eno;
    	 this.ename=ename;
     }
     void display() {
    	 System.out.println("Employee no: " +eno+ " Employee Name :" +ename);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		//Employee emp2=new Employee(2,"Nila");
		emp1.accept(Integer.parseInt(args[0]),args[1]);
		emp1.display();

	}

}
