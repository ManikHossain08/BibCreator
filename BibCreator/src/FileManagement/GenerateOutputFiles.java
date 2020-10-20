package FileManagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import Messaging.SystemMessage;

public class GenerateOutputFiles {

	public static final String inputPath = "BibInputFiles/";
	public static final String outputPath = "OuputFiles/";
	public static final Scanner[] bibScanner = new Scanner[10];

	public static void generateAllTypesOfJournalFiles() {
		
		for (int fileIndex = 0; fileIndex < 10; fileIndex++) {
			String fileName = "Latex" + (fileIndex + 1) + ".bib";

			try {
				bibScanner[fileIndex] = new Scanner(new FileInputStream(inputPath + fileName));
				fileCreations(fileIndex + 1);

			} catch (FileNotFoundException e) {
				SystemMessage.coundNotOpenFile(fileName);
				ManageOutputFiles.deleteFilesFromDirectory(new File(GenerateOutputFiles.outputPath));
				ScannerManagement.closeAllScanner();
				System.exit(0);
			}

		}
	}

	public static void fileCreations(int fileIndex) throws FileNotFoundException {

		try {
			File ieee = new File(outputPath + "IEEE" + fileIndex + ".json");
			File acm = new File(outputPath + "ACM" + fileIndex + ".json");
			File nj = new File(outputPath + "NJ" + fileIndex + ".json");
			ieee.createNewFile();
			acm.createNewFile();
			nj.createNewFile();

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}
}
