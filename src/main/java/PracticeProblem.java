import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
	}
 	public static void q1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number of rows you want for your pyramid: ");
		int rows = scanner.nextInt();
		 
		String result = pyramid(rows); 
		System.out.println(result); 
 	}

	public static String pyramid(int rows) {
		StringBuilder result = new StringBuilder();

		for (int i = 1; i <= rows; i++) {


			 for (int j = 1; j <= rows - i; j++) {
                result.append(" "); // One space per missing star to make it centered
            }

            //stars with spaces in between
            for (int k = 1; k <= i; k++) {
                result.append("* ");
            }

            //next line per row
            result.append("\n");
        }

        return result.toString();
	}


 	public static void q2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size you want for your square: ");
		int rows = scanner.nextInt();
		 
		String result = square(rows); 
		System.out.println(result); 
 	}

	public static String square(int size) {
		StringBuilder result = new StringBuilder();
		for (int row = 1; row <= size; row++){ //loop for row
			for (int col = 1; col <= size; col++) { //loop for column 
				 if (row == 1 || row == size || col == 1 || col == size) {
					result.append("*");
				} else {
					result.append(" "); 
				}
			}
			result.append("\n"); //next line
		 }

    	return result.toString(); //completed square
	}


	public static void q3() { 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String word = scanner.nextLine();

		boolean result = hasLowercase(word);
		System.out.println(result);
		
 	}

	public static boolean hasLowercase(String word) {
		for (int i = 0; i < word.length(); i++){  //checks each character
			char ch = word.charAt(i); //grabs char at index i
			if(Character.isLowerCase(ch)){ //checks whether it's lowercase
				return true;
			}
		}
		return false;
	}

}
