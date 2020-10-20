package RefferenceFormatGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import BibFileProperty.BibAttributes;
import FileManagement.GenerateOutputFiles;

public class RefferenceFormatFactory {
	private static String fileName;

	public static void IEEEFormat(List<BibAttributes> atricles, int fileIndex) {

		fileName = GenerateOutputFiles.outputPath + "IEEE" + fileIndex + ".json";
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(new FileOutputStream(fileName));
			String formatedStr = OrganizeRefferencesInString.organizeInIEEFormat(atricles);
			putGereneratedRefferenceOnOutputFile(pw, formatedStr);
		} catch (IOException e) {
			System.out.println("Error: An error has occurred while reading from the " + fileName + " file. ");
		}

	}

	public static void ACMFormat(List<BibAttributes> atricles, int fileIndex) {

		fileName = GenerateOutputFiles.outputPath + "ACM" + fileIndex + ".json";
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(new FileOutputStream(fileName));
			String formatedStr = OrganizeRefferencesInString.organizeInACMFormat(atricles);
			putGereneratedRefferenceOnOutputFile(pw, formatedStr);
		} catch (IOException e) {
			System.out.println("Error: An error has occurred while reading from the " + fileName + " file. ");
		}

	}

	public static void NJFormat(List<BibAttributes> atricles, int fileIndex) {

		fileName = GenerateOutputFiles.outputPath + "NJ" + fileIndex + ".json";
		PrintWriter pw = null;

		try {
			pw = new PrintWriter(new FileOutputStream(fileName));
			String formatedStr = OrganizeRefferencesInString.organizeInNJFormat(atricles);
			putGereneratedRefferenceOnOutputFile(pw, formatedStr);
		} catch (IOException e) {
			System.out.println("Error: An error has occurred while reading from the " + fileName + " file. ");
		}

	}

	private static void putGereneratedRefferenceOnOutputFile(PrintWriter printer, String allFormatedReffences)
			throws IOException {

		printer.println(allFormatedReffences);
		printer.close();
	}

}
