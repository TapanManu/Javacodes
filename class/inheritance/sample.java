class Parent{
	void dispParent(){
		System.out.println("this is parent class");
	}
}
class Child extends Parent{
	void dispChild(){
		System.out.println("this is child class");
	}
}
class Code{
	public static void main(String[] args){
		Parent p = new Parent();
		Child c = new Child();
		c.dispChild();
		p.dispParent();
		c.dispParent();
	}
}
