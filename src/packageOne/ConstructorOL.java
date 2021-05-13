
//1. Write a program for constructor overloading with different parameters?



package packageOne;

public class ConstructorOL {
	
	
	public ConstructorOL()
	{
		System.out.println("Naveena");
	}
	public ConstructorOL(int a,double b)
	{
		double c=a+b;
		System.out.println(c);
		
	}
	public  ConstructorOL(int a,String name,char z)
	{
		System.out.println(a+" "+name+" "+z);
	}
public ConstructorOL(double a,double b)
{
	double c=a+b;
	System.out.println("double");
}
	public static void main(String[] args) {
		ConstructorOL obj=new ConstructorOL();
		ConstructorOL obj2=new ConstructorOL(55,66.5);
		 ConstructorOL obj3=new  ConstructorOL(10,"Naveena1",'a');
		
		 ConstructorOL obj1=new  ConstructorOL(10.5,20.2);
			
		
	}

}
