package packageOne;

public class PrimitiveTypes {
public static int sum(int a,int b)
		{
			int c=a+b;
			System.out.println(c);
			return c;
		}
public static byte sub(int a,int b)
{
	int c=a-b;
	System.out.println(c);
	return (byte) c;
	
}
public static short mul(int a,int b)
{
	int c=a*b;
	System.out.println(c);
	return (short) c;
	
}
public static long div(int a,int b)
{
	int c=a/b;
	System.out.println(c);
	return c;

}
public static float salary(double d)
{
	System.out.println(d);
	return (float) d;
	
}
public static double salarydouble(double salary)
{
	System.out.println(salary);
	return salary;
	
}
public static boolean demo(boolean a)
{
	System.out.println(true);
	return true;
}
		public static void main(String[] args) {
	
            PrimitiveTypes.sum(10,20);
		    
		    PrimitiveTypes.sub(50, 40);
		    PrimitiveTypes.mul(10, 10);
		    PrimitiveTypes.div(10, 5);	
		    PrimitiveTypes.salary(15000.0);
		    PrimitiveTypes.salarydouble(19500.0);
		    PrimitiveTypes.demo(true);
		    
		    
		    
	}

}
