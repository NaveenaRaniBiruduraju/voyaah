package packageOne;

public class CountChar {

	public static void main(String[] args) {
		String a="MangoMango";
		char b='o';
		int count=0;
		char[] c=a.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==b)
			{
				count=count+1;
			}
			}
		System.out.println("Count of "+b+" characters is :"+count);
		}
	}


