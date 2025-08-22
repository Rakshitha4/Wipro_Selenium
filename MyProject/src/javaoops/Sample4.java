package javaoops;

class Employee1{
	int eid;
	String ename;
	String ecompany="Wipro";
	
	Employee1(int eid, String ename){
		this.eid=eid;
		this.ename=ename;
	}
	void getEmpInfo() {
		System.out.println(this.eid+" "+this.ename+" "+ecompany);
	}
}

public class Sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 eobj1=new Employee1(101, "Alex");
		Employee1 eobj2=new Employee1(102, "Bob");
		Employee1 eobj3=new Employee1(103, "Calix");
		Employee1 eobj4=new Employee1(104, "Dod");
		Employee1 eobj5=new Employee1(105, "Emily");
		
		eobj1.getEmpInfo();
		eobj2.getEmpInfo();
		eobj3.getEmpInfo();
		eobj4.getEmpInfo();
		eobj5.getEmpInfo();


	}

}
