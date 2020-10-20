package Client;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import BibFileProperty.BibAttributes;
import BibFileProperty.CheckBibFilesValidity;
import FileManagement.GenerateOutputFiles;
import FileManagement.ManageOutputFiles;
import FileManagement.ScannerManagement;
import Messaging.SystemMessage;
import RefferenceFormatGenerator.RefferenceFormatFactory;

public class Client {

	private static int noOfInvalidFile = 0;

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
				RefferenceFormatFactory.IEEEFormat(atricles, i + 1);
				RefferenceFormatFactory.ACMFormat(atricles, i + 1);
				RefferenceFormatFactory.NJFormat(atricles, i + 1);

			} else {
				noOfInvalidFile++;
			}
		}

		ScannerManagement.closeAllScanner();
		SystemMessage.countInvalidFileMessage(noOfInvalidFile);

	}

}
