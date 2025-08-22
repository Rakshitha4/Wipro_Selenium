package javaoops;

class Student{
	int sid;
	String sname;
//	Default construtor
	Student(){
		sid=101;
		sname="Alex";
		System.out.println("Default consutor gets executed");
	}
	void getInfo() {
		System.out.println(sid + " " + sname);
	}
}

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student sobj=new Student();
		sobj.getInfo();

	}

}
