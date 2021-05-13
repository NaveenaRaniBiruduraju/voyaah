package packageOne;

public class PrimeNumber {

	public static void main(String[] args) {
		int count=0;
		int x=13;
		for(int i=1;i<=13;i++)
		{
			if(x%i==0)
				count=count+1;
		}
		if(count==2)
			System.out.println(x + " is a prime number");
		else
			System.out.println(x + " not a prime number");
		
	}
}