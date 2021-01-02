
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
/**
 * The application is too take real shopping data, and create training data for when we want to classify the output
 * @author Jordan G
 *
 */
public class TTOO_CSV {

	public static void main(String[] args) throws FileNotFoundException, IOException, CsvException {
		List<Entry> CSV = new ArrayList<Entry>();
		List<Entry> trainData = new ArrayList<Entry>();
		CSV = Load();
		PrintList(CSV);
		//outputCSV(CSV);
	}
	
	/**
	 * Creating an Entry object and loading them into a list
	 * @return List
	 * @throws IOException
	 * @throws CsvException
	 */
	private static List<Entry> Load() throws IOException, CsvException {
		//File names to load in
		CSVReader file1 = new CSVReader(new FileReader("File1.csv"));
		CSVReader file2 = new CSVReader(new FileReader("File2.csv"));
		List<Entry> CSV = new ArrayList<Entry>();
		List<String[]> rec = new ArrayList<String[]>();
		rec.addAll(file1.readAll());
		rec.addAll(file2.readAll());
		for(String[] r : rec) {
			Entry e = new Entry();
			e.setDate(r[0]);
			e.setPrice(r[1]);
			e.setReference(r[2]);
			e.setLocation(r[3]);
			e.setClass("");
			CSV.add(e);
		}
		return CSV;
	}

	/**
	 * Takes the List and creates a csv file called "outputCSV".csv 
	 * @param CSV 
	 * @throws IOException
	 */
	private static void outputCSV(List<Entry> CSV) throws IOException {
		try {
			 FileWriter output = new FileWriter(new File("outputCSV.csv"));
			 CSVWriter write = new CSVWriter(output);		
			for(Entry a : CSV) {
				String[] line = {a.getDate(),a.getPrice(),a.getLocation(),a.getClassed()};
				write.writeNext(line);
			}
		write.close();
		output.close();
	 } catch(FileNotFoundException e) {
	 e.printStackTrace();
	 }
	}
    

public static void PrintList(List<Entry> t) {
	for(Entry a : t) {
		System.out.println(a.getEntry());
	}
}
}