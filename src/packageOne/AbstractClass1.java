package packageOne;

public class AbstractClass1 extends Abstract {


	public static void main(String[] args) {
		AbstractClass1 obj=new AbstractClass1();
		obj.display();
		Abstract.stu(21049, "Navi");
		obj.noOfWheels();
		
		
	}

	@Override
	public int noOfWheels() {
		int wheels=4;
		System.out.println(wheels);
		return wheels;
	}

}
