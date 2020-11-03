package day3;

public class Conversion {
	Integer i;
	Integer meth1(double d) {
		int num=(int)d;
		i=new Integer(num);
		return i;
	}
	float meth2(Integer i) {
		float j=i.intValue();
		return j;
		
	}

	public static void main(String[] args) {
		Conversion obj=new Conversion();
		Integer i=obj.meth1(9.0);
		float num=obj.meth2(i);
		System.out.println(num);

	}

}
