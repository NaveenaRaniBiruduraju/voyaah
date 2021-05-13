package packageOne;
class Emp2 extends   EmpSingleIn
{
	static String name2="samantha";
}

class Emp1 extends EmpSingleIn{
static String name1="rushika";


}
public class EmpSingleIn {
	static String name="naveena";
	static int id=21049;
	
	

	public static void main(String[] args) {
		System.out.println(Emp1.name1);
		System.out.println(Emp1.name);
		System.out.println(Emp1.id);
		System.out.println(Emp2.name2);
		
	}

}
