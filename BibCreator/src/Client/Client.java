package Client;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import BibFileProperty.BibAttributes;
import BibFileProperty.CheckBibFilesValidity;
import FileManagement.GenerateOutputFiles;
import FileManagement.ManageOutputFiles;
import Messaging.SystemMessage;

public class Client {
	private static int noOfInvalidFile = 1;

	public static void main(String[] args) {

		SystemMessage.welcomeMessgae();

		ManageOutputFiles.deleteFilesFromDirectory(new File(GenerateOutputFiles.outputPath));
		GenerateOutputFiles.generateAllTypesOfJournalFiles();

		processFilesForValidation();

	}

	private static void processFilesForValidation() {
		Scanner[] opennedBibScanner = GenerateOutputFiles.bibScanner;

		for (int i = 0; i < opennedBibScanner.length; i++) {
			
			List<BibAttributes> atricles = CheckBibFilesValidity.checkValidity(opennedBibScanner[i], i + 1);
			
			if (atricles != null) {
				System.out.println(i + 1);
			} else {
				noOfInvalidFile++;
			}
		}
		
		System.out.print("total Invalid file: " + noOfInvalidFile);

	}

}
