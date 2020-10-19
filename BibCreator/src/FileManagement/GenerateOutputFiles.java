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

	public static void generateAllTypesOfJournalFiles(Scanner scanner) {
		for (int i = 1; i <= 10; i++) {

			String fileName = "Latex" + i + ".bib";

			try {
				scanner = new Scanner(new FileInputStream(inputPath + fileName));
				fileCreations(scanner, i);

			} catch (FileNotFoundException e) {
				SystemMessage.coundNotOpenFile(fileName);
				System.exit(0);

			} finally {
				ManageOutputFiles.deleteFilesFromDirectory(new File(GenerateOutputFiles.outputPath));
				scanner.close();
			}

		}
	}

	public static void fileCreations(Scanner scanner, int fileIndex) throws FileNotFoundException {

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
