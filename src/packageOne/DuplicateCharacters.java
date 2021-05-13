package packageOne;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String a="king of fruits is mango";
		char c[]=a.toCharArray();
		System.out.println("Duplicate characters in a string is");
	
		for (int i = 0; i < c.length; i++) {
			int count = 1;
			for (int j = i+1; j < c.length; j++) {
				if (c[i] == c[j] && c[i] != ' ') {
					count++;
					c[j]='0';
				}	
			}
			if (count > 1 && c[i] != '0') {
				System.out.println(c[i]);
			}
		}
	
	}

}
