package hg222ii_assign1;

public class PrintRecursive {

	public static void main(String[] args) {
		String str = "Hello Everyone!";

		print(str, 0);
		System.out.println(); // Line break
	    printReverse(str, 0);		}

	

	public static void print(String str, int pos) {

		try {
			System.out.print(str.charAt(pos));              
			print(str.substring(0, str.length()), pos + 1);  //The method calling itself to make itself recursive
		} catch (Exception e) {
			if (pos < 0 || pos > str.length() || str.length() <= 1) {
				System.out.println("Wrong! Check your string or startposition!" + " "+e);
			}
			if (pos == str.length()) { // Handling the java.lang.StringIndexOutOfBoundsException and StringLatin1
				; // Do nothing
			}
		}
	}

	public static void printReverse(String str, int pos) {
		try {
			System.out.print(str.charAt(str.length()-1-pos));
			printReverse(str.substring(0,str.length()-1) ,pos); //The method calling itself to make itself recursive
		} catch (Exception e) {
			if (pos < 0 || pos > str.length() || str.length() < 0) {
				System.out.println(" Wrong! Check your string or startposition!" + " "+e);
			}
			if (pos == str.length()) { // Handling the java.lang.StringIndexOutOfBoundsException and StringLatin1
				; // Do nothing
			}
		}	
	}
}
