package pattern;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		for (int row = 1; row <= 4; row++) {

			for (int colspaces = 4 - row; colspaces >= 1; colspaces--) {

				System.out.print(" ");
			}

			for (int colStar = 1; colStar <= row; colStar++) {

				System.out.print("*"+" ");

			}

			System.out.println("\n");

		}
	}

}
	
	
	
	
	
	
	
	
	
	

