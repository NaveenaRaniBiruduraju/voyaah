package packageOne;

public class SmallLargEle {

	public static void main(String[] args) {
		int a[]= {1,500,20,36,899};
		int largest=a[0];
		int smallest=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
			largest=a[i];
			}
			else if(a[i]<smallest) {
				smallest=a[i];
			}
			
		}
		System.out.println(largest);
		System.out.println(smallest);
	}

}
