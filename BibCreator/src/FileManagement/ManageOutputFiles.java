package FileManagement;

import java.io.File;

public class ManageOutputFiles {

	public static boolean deleteFilesFromDirectory(File directoryToBeDeleted) {
		
		File[] allContents = directoryToBeDeleted.listFiles();
		if (allContents != null) {
			for (File file : allContents) {
				deleteSpecificFilesFromDirectory (file);
			}
		}
		return true;
	}

	public static boolean deleteSpecificFilesFromDirectory(File file) {

		file.delete();

		return true;
	}
	
	public static boolean deleteInvalidOutputFiles(int fileIndex) {

		File ieee = new File(GenerateOutputFiles.outputPath + "IEEE" + fileIndex + ".json");
		File acm = new File(GenerateOutputFiles.outputPath + "ACM" + fileIndex + ".json");
		File nj = new File(GenerateOutputFiles.outputPath + "NJ" + fileIndex + ".json");
		ieee.delete();
		acm.delete();
		nj.delete();
	
		return true;
	}
	
	
}
