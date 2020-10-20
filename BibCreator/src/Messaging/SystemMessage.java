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

	public static String invalidFileMessage(String fileName, String attrName) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Error: Detected Empty Field!\n");
		sb.append("=============================");
		sb.append("\n\n");
		sb.append("Problem dectected with input file: " + "Latex" + fileName + ".bib");
		sb.append("\nFile is Invalid: Field \"" + attrName + "\" is empty. Processing stop at this point! "
				+ "Other empty fields may be present as well!");
		sb.append("\n\n");
		System.out.println(sb.toString());
		return sb.toString();
	}
	
	public static String countInvalidFileMessage(int noOfInvalid) {

		String message = "A total of  " + noOfInvalid + " were invalid, and could not be processed."
				+ " All other " + (10 - noOfInvalid) + " \"Valid\" files have been created.";

		System.out.println(message);
		return message;
	}
}
