package day9;

public class Emp {
	private int empId;
	String name;

	Emp(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	public int hashCode() {
		return 12;
	}

	public boolean equals(Object ob) {
		boolean flag = false;
		Emp e = (Emp) ob;
		if ((this.empId == e.empId) && ((this.name).equals(e.name))) {
			flag = true;
		}
		return flag;
	}
}
