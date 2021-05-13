package packageOne;

public class FibonnaciSeries {

	public static void main(String[] args) {
		int count=15,a=0,b=1;
		System.out.println(a+" "+b);
		for(int i=2;i<=count;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c+" ");
			
			}
		}
	}


