package mphasis.condition.project;

public class PrintPattern {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int k = 1; k <= 100 - i; k++) 
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println("");
		}
		
		for (int i = 6; i >=1 ; i--) {
			for (int k = 1; k <= 100 - i; k++) 
				System.out.print(" ");
			for (int j = i; j >= 1; j--)
				System.out.print("* ");
			System.out.println("");
		}
	}
}
