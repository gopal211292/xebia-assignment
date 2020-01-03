package xebia.assignment.salestaxcalculator.writers;

import xebia.assignment.salestaxcalculator.dtos.ReceiptDto;

/**
 * This interface provides a structure for all kinds of Writers. The input is a
 * ReceiptDto which can then be printed out in any format desirable.
 * 
 * @author gopal211292@gmail.com
 */
public interface ReceiptWriter {

	/**
	 * Receives the receipt DTO from calculators and prints to given file path.
	 * 
	 * @param ReceiptDto
	 * @param filePath
	 */
	public void printReceiptToFile(ReceiptDto ReceiptDto, String filePath);

}
