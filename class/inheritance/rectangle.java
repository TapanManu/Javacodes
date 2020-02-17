class Rectangle{
	int length;
	int breadth;
	Rectangle(int l,int b){
		length=l;
		breadth=b;
	}
	void area(){
		int area=length*breadth;
		System.out.println("Area:"+area);
	}
	void perimeter(){
		int perimeter = 2*(length+breadth);
		System.out.println("perimeter"+ perimeter);
	}
}
class Square extends Rectangle{
		Square(int side){
			super(side,side);
		}
}
class Code{
	public static void main(String[] args){
		Rectangle r =new Rectangle(5,4);
		Square s=new Square(4);
		r.area();
		r.perimeter();
		s.area();
		s.perimeter();
	}
}
