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
}
