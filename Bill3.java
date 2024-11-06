// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
	    String name2 = args[1];
		String name3 = args[2];
		int bill = Integer.parseInt(args[3]);

		double split = Math.ceil(((double) bill) / 3);

		System.out.println("hey " + name1 + ", " + name2 + ", "+ name3 + ", " + split + " is how much you each have to pay.");
	}
}

// for some reason my jdk bin path isnt showing up so this is a temporary fix for the session below:
// $env:PATH = "C:\Program Files\Java\jdk-23\bin;" + $env:PATH 
