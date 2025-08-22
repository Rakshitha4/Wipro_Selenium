package javacollections;

class Employee{
	String emp_name;
	int emp_id;
	
//	parameterized constructor
	public Employee(String emp_name, int emp_id) {
		super();
		this.emp_name=emp_name;
		this.emp_id=emp_id;		
	}
//	equals method will return name by comapring object
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		
		if(obj==null || obj.getClass()!=this.getClass())
			return false;
//		reference of current class employee
		Employee employee = (Employee)obj;
		return (employee.emp_name==this.emp_name && employee.emp_id==this.emp_id);
	}
//return hashcode for class
	@Override
	public int hashCode(){
		return this.emp_id;
	}
}

public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("Alex", 101);
		Employee emp2=new Employee("Alen", 102);
		
		if(emp1.hashCode()==emp2.hashCode()) {
			if(emp1.equals(emp2)) {
				System.out.println("Both Objects are Equal");
			}else {
				System.out.println("Both Objects are Not Equal");
			}
		}else {
			System.out.println("Both Objects are Not Equal");
		}

	}

}
