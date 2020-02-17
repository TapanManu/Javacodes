class Member{
	String Name;
	int salary;
	void dispSalary(){
		System.out.println("Salary:"+salary);
	}
}
class Employee extends Member{
		Employee(String Name,int salary){
			this.Name = Name;
			this.salary = salary;
		}
		void disp(){
			System.out.println("name:"+Name);
			this.dispSalary();
	}
}
class Code{
	public static void main(String[] args){
		Employee e =new Employee("Tapan",25_00_000);
		e.disp();
	}
}
