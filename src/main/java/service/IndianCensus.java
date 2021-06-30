package service;

/************************************************************
 * Purpose : To perform census operations on csv data
 * @author Sanyukta Nirmal
 * @Version 1.0
 * @since 30-06-2021
 *
 ************************************************************/
import java.util.List;
import helper.HelperCSV;
import model.IndianCensusCSV;

public class IndianCensus {

	private List<IndianCensusCSV> censuslist;

	/**
	 * @param csvFilePath
	 * @return number of entries in csv file.
	 * @throws CustomCsvException
	 */
	public int getSizeOfCsv(String csvFilePath) throws CustomCsvException {
		censuslist = HelperCSV.readIndianCensusCsv(csvFilePath);
		return censuslist.size();
	}

	/**
	 * @param csvFileParth
	 * @param stateCodeList
	 * @return number of entries in State code csv file
	 * @throws CustomCsvException
	 */
	public int getSizeOfIndianStateCodeCsv(String csvFileParth, Object stateCodeList) throws CustomCsvException {
		stateCodeList = HelperCSV.readIndianStateCodeCsv(csvFileParth);
		return stateCodeList.size();
	}
}
