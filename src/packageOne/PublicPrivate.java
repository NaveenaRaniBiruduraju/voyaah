package packageOne;
class PublicPrivate1 extends PublicPrivate
{
	
	int b=10;
	
}

public class PublicPrivate {

	public static void main(String[] args) {
		int a=10;
		System.out.println(a);
		PublicPrivate1 obj=new PublicPrivate1();
		System.out.println(obj.b);
		
		
	}

}
