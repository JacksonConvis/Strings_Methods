import java.util.Scanner;

public class StringLab {

	public static void main(String[] args) {
		/* Objective : Test various string methods by creating public static void
		 * methods and calling them into the main method to run the code 
		 * Creator: @jacksonconvis
		 * 
		 * 
		 */
		// TODO Auto-generated method stub
		capitalize();
		wheresWaldo();
		firstThingsFirst();
		reverse();
		soLong();
		afterMath();
		letterize();

	}
	//capitalizes the first letter of a string with the following letters lowercase 
	public static void capitalize() {
		String word = "jeFFeRsoN";
		String result = word.substring(0, 1).toUpperCase() + word.substring(1, 9).toLowerCase();
		System.out.println(result);
		return;
	}
	//displays where the word "Waldo" falls in a string numerically
	public static void wheresWaldo() {
		String phrase = "I Found Waldo!";
		System.out.println(phrase.indexOf("Waldo"));
		return;
	}
	//prints out the string which alphabetically comes first
	public static void firstThingsFirst() {
		String str1 = "Bilbo";
		String str2 = "Aragorn";
		System.out.println(str1.compareToIgnoreCase(str2));
		return;
	}
	//reverses the character order of a specified string
	public static void reverse() {
		String s = "Amazon";
		String r = new StringBuilder(s).reverse().toString();
		System.out.println(r);
		return;
	}
	//checks two strings and prints out the one that is greater in length
	public static void soLong() {
		String a = "Gandalf";
		String b = "Radagast";
		String longest = (a.length() > b.length()) ? a : b;
		System.out.println(longest);
		return;
	}
	//checks for the word "math" in a string
	 public static void afterMath() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("enter a phrase that does (or doesn't) contain the word math");
		 String phrase = scan.next();
		 if(phrase.contains("math")) 
		 {System.out.println(phrase.lastIndexOf("math"));}
		 else
		 {System.out.println("dud");}
		 	return;
	 }
	 //prints the characters of specified string on separate lines
	 public static void letterize() {
		 String word = "Rodgers";
		for(int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	 }

	

}
