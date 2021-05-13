package packageOne;

public class SumOfArray {

	public static void main(String[] args) {
		int a[]= {1,20,50,30,60,100,25};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
        System.out.println(sum);
	}

}
