package ExceptionsGenerator;

public class FileInvalidException extends Exception {
	private static final long serialVersionUID = 1L;

	public FileInvalidException() {
		super("Error: Input file cannot be parsed due to missing information (i.e. month={}, title={}, etc.)");
	}

	public FileInvalidException(String s) {
		super(s);
	}

	public String getMessage() {
		return super.getMessage();
	}

}
