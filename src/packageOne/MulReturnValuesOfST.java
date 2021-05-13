package packageOne;

public class MulReturnValuesOfST {

	
		static int[] getMethods(int a , int b)
		{
			int[] a1=new int[5];
			a1[0]=a+b;
			a1[1]=a-b;
			a1[2]=a*b;
			a1[3]=a/b;
			a1[4]=a%b;
			return a1;
			
		}
		public static void main(String[] args) {
			
		int[] a1=getMethods(10 , 5);
		System.out.println("sum :"+a1[0]);
		System.out.println("sub :"+a1[1]);
		System.out.println("mul:"+a1[2]);
		System.out.println("div :"+a1[3]);
		System.out.println("mod:"+a1[4]);
		
		
		
		
		
		}
	}

