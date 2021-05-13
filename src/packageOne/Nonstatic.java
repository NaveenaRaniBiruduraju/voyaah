package packageOne;

public class Nonstatic {

	
		public String empNames(String a,String b)
		{
			System.out.println(a);
			return a;
			
		}
	public static void main(String[] args) {
		Nonstatic O=new Nonstatic();
		O.empNames("naveena", "10");

}
}