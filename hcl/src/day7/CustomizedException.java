package day7;
 class negativeException extends Exception{
	public String toString() {
		return "Age can't be negative";
		//return null;
	}
}
public class CustomizedException {
	int getAge() {
		return -10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomizedException obj=new CustomizedException();
		try {
			int age=obj.getAge();
			if(age<0)
				throw new negativeException();
			else
				System.out.println(age);
		}
		catch(negativeException e) {
			System.out.println(e);
		}

	}

}
