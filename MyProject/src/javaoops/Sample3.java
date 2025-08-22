package javaoops;

class Employee{
	int eid;
	String ename;
//	Default constructor
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor executed");
	}
//	Parameterized constructor
	Employee(int eid,String ename){
		this.eid=eid;
		this.ename=ename;
	}
	void getInfo() {
		System.out.println(this.eid+" "+ this.ename);
	}
}

public class Sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee eobj=new Employee(101,"Alex");
		eobj.getInfo();
		
		Employee eobj1=new Employee(102,"Bob");
		eobj1.getInfo();

	}

}
