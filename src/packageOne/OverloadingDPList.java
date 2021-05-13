package packageOne;

public class OverloadingDPList {
	public static int emp(int eid,String ename)
	{
		System.out.println(eid+" "+ename);
		return eid;
		
	}
	
	public int emp(int eid,String ename,int esal)
	{
		System.out.println(eid+" "+ename+" "+esal);
		return 21049;
		
	}
	public String emp(int eid,String ename,int esal,String edept)
	{
		System.out.println(eid+" "+ename+" "+esal+" "+edept);
		return edept;
		
	}
	public static void main(String[] args) {
		OverloadingDPList obj=new OverloadingDPList();
		String a=obj.emp(21049, "naveena", 10000, "testing");
		System.out.println(a);
		
		
	}

}
