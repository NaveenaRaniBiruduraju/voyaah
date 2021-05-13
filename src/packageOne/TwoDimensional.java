package packageOne;

import java.util.Scanner;

public class TwoDimensional {

	public static void main(String[] args) {
		int b[][] = new int[4][3];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Enter a[" + i + "]" + "[" + j + "]");
				Scanner sc = new Scanner(System.in);
				int val = sc.nextInt();
				b[i][j] = val;

			}
		}
		for(int i=0;i<4;i++)
		{
			System.out.println();
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+" ");
			}
		}System.out.println();
	}
}
