package packageOne;

public class Myntra {

	public static void main(String[] args) {
		Web driver=new ChromeDri();
		Web driver2=new ChromeDri();
		
		driver.login();
		driver.logout();
		driver2.amazonlogin();
		driver2.amazonlogout();
	}

}
