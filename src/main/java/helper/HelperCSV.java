package helper;

/************************************************************
 * Purpose :perform basic csv operations on csv file.
 * 		 1.reading 
 * 		 2. writing 
 * @author sanyukta nirmal
 * @Version 1.0
 * @since 30-06-2021
 *
 ************************************************************/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.IndianCensusCSV;
import service.CustomCsvException;

public class HelperCSV<E> {

	/**
	 * csv operaqtion
	 * 
	 * @param csvFilepath
	 * @return contents of CSV file
	 * @throws CustomCsvException
	 */
	public static List<IndianCensusCSV> readIndianCensusCsv(String csvFilepath) throws CustomCsvException {
		List<IndianCensusCSV> returnList = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(csvFilepath))) {
			@SuppressWarnings("unused")
			String headerLine = reader.readLine();
			String line = reader.readLine();
			while (line != null) {
				String[] attributes = line.split(",");
				IndianCensusCSV csvmodel = ObjectBuilder.createObjectOfIndianCensus(attributes);
				returnList.add(csvmodel);
				line = reader.readLine();
			}
		} catch (Exception e) {
			throw new CustomCsvException("File not found");
		} catch (IOException e) {
			throw new CustomCsvException(e.getMessage(), CustomCsvException.ExceptionType.INCORRECT_FILE);
		} catch (RuntimeException e) {
			throw new CustomCsvException(e.getMessage(), CustomCsvException.ExceptionType.IMPROPER_CSV);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return returnList;

	}

}