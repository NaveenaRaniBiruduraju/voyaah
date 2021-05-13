package packageOne;

public class This {
	static String name;
	String name1;
public  void empnames(String name,String name1)
{
	this.name=name;
	this.name1=name1;
	System.out.println(name+" "+name1);
}
public String details()
{
	this.empnames("naveena","prabhas");
	return name+" "+name1;
	
}
	public static void main(String[] args) {
		This obj=new This();
		obj.empnames("prabhas","naveena");
		obj.details();
	}

}
