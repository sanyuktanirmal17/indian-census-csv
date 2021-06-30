package service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IndianCensusTest {
	IndianCensus census = null;

	@Before
	public void setUp() {
		census = new IndianCensus();
	}

	@Test
	public void given_IndianCensusCSVFile_ReturnsNumberOfRecords() throws CustomCsvException {
		int result = census.getSizeOfCsv("IndiaStateCensusData.csv");
		Assert.assertEquals(29, result);
	}

}
