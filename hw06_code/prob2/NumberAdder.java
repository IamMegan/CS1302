package prob2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberAdder {
	
	private static final String IN_FILE_PATH = "src/prob2/";
	// I have supplied test files: t1.txt, t2.txt, ..., t10.txt
	// You will need to verify the expected output by hand to ensure
	// that your code gives the correct value.
	
	static String[] inFileNames = {"t1.txt", "t2.txt", "t3.txt", "t4.txt", "t5.txt",
			"t6.txt", "t7.txt", "t8.txt", "t9.txt", "t10.txt"};
	
	public static void main(String[] args) throws FileNotFoundException {
		// Comment out most of these as you test/debug.
		File file;
		file = new File(IN_FILE_PATH + inFileNames[0]);
		System.out.println("Sum=" + getSum(file));
		file = new File(IN_FILE_PATH + inFileNames[1]);
		System.out.println("Sum=" + getSum(file));
		file = new File(IN_FILE_PATH + inFileNames[2]);
		System.out.println("Sum=" + getSum(file));
		file = new File(IN_FILE_PATH + inFileNames[3]);
		System.out.println("Sum=" + getSum(file));
		file = new File(IN_FILE_PATH + inFileNames[4]);
		System.out.println("Sum=" + getSum(file));
		file = new File(IN_FILE_PATH + inFileNames[5]);
		System.out.println("Sum=" + getSum(file));
		file = new File(IN_FILE_PATH + inFileNames[6]);
		System.out.println("Sum=" + getSum(file));
		file = new File(IN_FILE_PATH + inFileNames[7]);
		System.out.println("Sum=" + getSum(file));
		file = new File(IN_FILE_PATH + inFileNames[8]);
		System.out.println("Sum=" + getSum(file));
		file = new File(IN_FILE_PATH + inFileNames[9]);
		System.out.println("Sum=" + getSum(file));
	}
	/**
	 * YOU WRITE THIS METHOD
	 */
	public static int getSum(File file) {
		return Integer.MAX_VALUE;
	}

	// DO NOT MODIFY THIS CODE. This method is for automated testing
	// that will take place when your assignment is graded. You do
	// not need to use this method.
	public static int getSum(String fileName) {
		File file = new File(fileName);
		return getSum(file);
	}
}
