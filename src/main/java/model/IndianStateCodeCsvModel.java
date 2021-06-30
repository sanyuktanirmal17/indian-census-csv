/************************************************************************
 * Purpose : Pojo model for State code csv file 
 * state code csv entries is object of the same class
 * @author Sanyukta Nirmal
 * @Since 30-06-2021
 * @Version 1.1
 *********************************************************************/
package model;
public class IndianStateCodeCsvModel {

	int serialNumber;
	String stateName;
	int tin;
	String stateCode;

	public IndianStateCodeCsvModel(int serialNumber, String stateName, int tin, String stateCode) {
		this.serialNumber = serialNumber;
		this.stateName = stateName;
		this.tin = tin;
		this.stateCode = stateCode;
	}



}