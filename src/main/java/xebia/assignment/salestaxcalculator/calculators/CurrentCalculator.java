package xebia.assignment.salestaxcalculator.calculators;

import java.util.List;

import xebia.assignment.salestaxcalculator.dtos.ArticleDto;
import xebia.assignment.salestaxcalculator.dtos.ReceiptDto;

/**
 * This interface provides a structure for all kinds of Calculators.
 * 
 * @author gopal211292@gmail.com
 *
 */
public interface CurrentCalculator {
	/**
	 * Calculate for current Scenario
	 * 
	 * @param listOfArticles
	 * @return ReceiptDto
	 */
	public ReceiptDto calculate(List<ArticleDto> listOfArticles);
}
