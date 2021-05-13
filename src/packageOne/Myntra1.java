package packageOne;

public class Myntra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Web driver=new ChromeDri();
		Web driver2=new ChromeDri();
		
		driver.login();
		driver.logout();
		driver2.login();
		driver2.logout();

	}

}
