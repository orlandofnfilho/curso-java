package cap200;

import java.io.File;
import java.util.Scanner;

public class FolderFile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		File[] folders = path.listFiles(File::isDirectory);

		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}

		File[] files = path.listFiles(File::isFile);

		System.out.println();
		System.out.println("FILES: ");
		for (File file : files) {
			System.out.println(file);
		}

		System.out.println();
		System.out.print("Create a new folder?: (s/n)");
		char op = sc.next().charAt(0);
		if (op == 's') {
			boolean success = new File(strPath + "\\NewFolder").mkdir();
			System.out.println("New folder was created sucessfully: " + success);
		}
		
		
		System.out.println("Name: "+path.getName());
		System.out.println("Folder: "+path.getParent());
		System.out.println("Path: "+path.getPath());
		System.out.println("Space: "+path.getTotalSpace());

	}

}
