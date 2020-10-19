package Client;

import java.io.File;
import java.util.Scanner;

import FileManagement.GenerateOutputFiles;
import FileManagement.ManageOutputFiles;
import Messaging.SystemMessage;

public class Client {

	private static Scanner scanner = null;

	public static void main(String[] args) {
		// PrintWriter pw = null;
		
		
		SystemMessage.welcomeMessgae();
		ManageOutputFiles.deleteFilesFromDirectory(new File(GenerateOutputFiles.outputPath));
		GenerateOutputFiles.generateAllTypesOfJournalFiles(scanner);
		
		//ManageOutputFiles.deleteSpecificFilesFromDirectory(new File(GenerateOutputFiles.outputPath + "IEEE1.json"));

	}

}
