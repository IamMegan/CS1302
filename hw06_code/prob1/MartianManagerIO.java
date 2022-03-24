package prob1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import prob2.*;

public class MartianManagerIO {

	/**
	 *  DO NOT ALTER THIS METHOD.
	 */
	public static void writeMartians(String fileName, MartianManager mm) {
		File file = new File(fileName);
        try {
			writeMartiansFile(file, mm);
		}
        catch (FileNotFoundException e) {
			System.out.println("Error writing file");
			e.printStackTrace();
		}
	}
	
	/**
	 *  YOU  WRITE THIS METHOD.
	 *  
	 *  Write the martians in the MartianManager to the file. The format is exactly the same
	 *  as specified in the homework document for reading valid data: G I V or R I V T.
	 */
	private static void writeMartiansFile(File file, MartianManager mm) throws FileNotFoundException {
	}

	/**
	 *  DO NOT ALTER THIS METHOD.
	 */
	public static ReadReport readMartians(String fileName) {
		File file = new File(fileName);
		ReadReport report = null;
        try {
			report = readMartiansFile(file);
		}
        catch (FileNotFoundException e) {
			System.out.println("Error reading file");
			e.printStackTrace();
		}
		return report;
	}
	
	/**
	 * YOU WRITE THIS METHOD.
	 * 
	 * Reads a text file that contains Martian data and returns a ReadReport object. Details
	 * are in the homework document. 
	 * 
	 * @param file
	 * @return
	 * @throws RuntimeException
	 * @throws FileNotFoundException
	 */
	private static ReadReport readMartiansFile(File file) throws RuntimeException, FileNotFoundException {
		return null;
	}

}
