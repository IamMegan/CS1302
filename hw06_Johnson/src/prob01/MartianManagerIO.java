package prob01;

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
		PrintWriter writ = new PrintWriter(file);
		for(int i = 0; i <= mm.getNumMartians(); i++) {
			if(mm.getMartianAt(i) instanceof GreenMartian) {
				writ.println('G' + " " + mm.getMartianAt(i).getId() +  " " + mm.getMartianAt(i).getId());
			}
			else if(mm.getMartianAt(i) instanceof RedMartian){
				writ.println('R' + " " + mm.getMartianAt(i).getId() + " " + mm.getMartianAt(i).getVolume() + " "+((RedMartian)mm.getMartianAt(i)).getTenacity());
			}
			
		}
		writ.close();
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
		Scanner scan = new Scanner(file);
		MartianManager mm = new MartianManager();
			int numLinesRead = 0;
			int numSuccessfullyAdded = 0;
			int numAlreadyExist = 0;
			int numIllFormed = 0;
			while(scan.hasNext()) {
				try {
				if(scan.next().equals("G")) {
					String GreenMartian = scan.nextLine();
					String[] GrnMarVals = GreenMartian.split(" ");
					String type = GrnMarVals[0];
					int id = Integer.parseInt(GrnMarVals[1]);
					int volume = Integer.parseInt(GrnMarVals[2]);
					GreenMartian g = new GreenMartian(id, volume);
					if(mm.contains(g.getId())){
						numAlreadyExist++;
					}
					else {
						mm.addMartian(g);
						numSuccessfullyAdded++;
					}
					

				}
				else if(scan.next().equals("R")) {
					String RedMartian = scan.nextLine();
					String[] RedMarVals = RedMartian.split(" ");
					String type = RedMarVals[0];
					int id = Integer.parseInt(RedMarVals[1]);
					int volume = Integer.parseInt(RedMarVals[2]);
					int tenacity = Integer.parseInt(RedMarVals[3]);
					RedMartian r = new RedMartian(id, volume, tenacity);
					if(mm.contains(r.getId())){
						numAlreadyExist++;
					}
					else {
						mm.addMartian(r);
						numSuccessfullyAdded++;
						
					}
					
					
				}
				else {
					numIllFormed++;
				}
				}
				catch(Exception e){
					numIllFormed++;
					
				}
				
			}
			numLinesRead = numSuccessfullyAdded + numAlreadyExist + numIllFormed;
			scan.close();
			ReadReport report = new ReadReport(mm, file.getName(), numLinesRead, numSuccessfullyAdded, numAlreadyExist, numIllFormed);
			return report;

			
	}

}
