package Messaging;

public class SystemMessage {
	
	
	public static String welcomeMessgae() {
		String message = "Welcome to BibCreator!\n";
		System.out.println(message);
		return message;
	}
	
	
	public static String coundNotOpenFile(String fileName) {

		String message = "Could not open input file " + fileName + " for reading. \n\nPlease check if file exists! "
				+ "Program will terminate after closing any opened files.";

		System.out.println(message);
		return message;
	}
}
