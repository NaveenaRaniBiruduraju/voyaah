
//2. Create abstract class with static, abstract, non-abstract and final method and implement 
//abstract method in another class?
package packageOne;

public abstract class Abstract {
	public static void stu(int sid,String sname)
	{
		System.out.println(sid+" "+sname);
	}
	public abstract int noOfWheels();
	public int wheels(int no)
	{
		return 1;
		
	}
	Abstract()
	{
		System.out.println("ojas");
	}
	public final void display() 
	{
		System.out.println("displaying..");
	}

	public static void main(String[] args) {
		
	}

}
