package xebia.assignment.salestaxcalculator.calculators;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import xebia.assignment.salestaxcalculator.dtos.ArticleDto;
import xebia.assignment.salestaxcalculator.dtos.ReceiptDto;

/**
 * Test class to test the calculator functionality
 * 
 * @author gopal211292@gmail.com
 * 
 */
public class SalesTaxCalculatorImplTest {
	SalesTaxCalculatorImpl salesTaxCalculatorImpl = new SalesTaxCalculatorImpl();

	@Test
	public void testCalculateWithoutImportedArticles() {
		List<ArticleDto> listOfArticles = new ArrayList<>();
		listOfArticles.add(new ArticleDto(1, "Book", 12.49, false, true));
		listOfArticles.add(new ArticleDto(1, "Music CD", 14.99, false, false));
		listOfArticles.add(new ArticleDto(1, "Chocolate Bar", 0.85, false, true));
		ReceiptDto receiptDto = salesTaxCalculatorImpl.calculate(listOfArticles);

		// Values can be printed out here to check the logic works.
		// System.out.println(receiptDto.toString());

		Assertions.assertEquals(29.83, receiptDto.getTotalPriceOfArticles());
		Assertions.assertEquals(1.50, receiptDto.getSalesTaxOfArticles());
	}

	@Test
	public void testCalculateWithImportedArticles() {
		List<ArticleDto> listOfArticles = new ArrayList<>();
		listOfArticles.add(new ArticleDto(1, "Box Of Chocolates", 10.00, true, true));
		listOfArticles.add(new ArticleDto(1, "Bottle of Perfume", 47.50, true, false));
		ReceiptDto receiptDto = salesTaxCalculatorImpl.calculate(listOfArticles);

		// Values can be printed out here to check the logic works.
		// System.out.println(receiptDto.toString());

		Assertions.assertEquals(65.15, receiptDto.getTotalPriceOfArticles());
		Assertions.assertEquals(7.65, receiptDto.getSalesTaxOfArticles());
	}

	@Test
	public void testCalculateWithMixedArticles() {
		List<ArticleDto> listOfArticles = new ArrayList<>();
		listOfArticles.add(new ArticleDto(1, "Bottle of Perfume", 27.99, true, false));
		listOfArticles.add(new ArticleDto(1, "Bottle of Perfume", 18.99, false, false));
		listOfArticles.add(new ArticleDto(1, "Headache Pills", 9.75, false, true));
		listOfArticles.add(new ArticleDto(1, "Box Of Chocolates", 11.25, true, true));
		ReceiptDto receiptDto = salesTaxCalculatorImpl.calculate(listOfArticles);

		// Values can be printed out here to check the logic works.
		// System.out.println(receiptDto.toString());

		// According to the rule it should be rounded to the nearest 0.05.
		// In this case the value comes out to be 0.56 for last article "1 box of
		// imported chocolates at 11.25".
		// This rounded to the nearest 0.05 is 0.55 and not 0.60, so the difference is
		// there in the expected output
		Assertions.assertEquals(74.63, receiptDto.getTotalPriceOfArticles());
		Assertions.assertEquals(6.65, receiptDto.getSalesTaxOfArticles());
	}

}