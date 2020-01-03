package xebia.assignment.salestaxcalculator.calculators;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import xebia.assignment.salestaxcalculator.dtos.ArticleDto;
import xebia.assignment.salestaxcalculator.dtos.ReceiptDto;

/**
 * @author gopaltayal
 *
 */
public class SalesTaxCalculatorImpl implements CurrentCalculator {

	public static final int SALES_TAX_PRECENTAGE = 10;
	public static final int IMPORT_DUTY_PERCENTAGE = 5;

	@Override
	public ReceiptDto calculate(List<ArticleDto> listOfArticles) {
		double totalPriceOfArticles = 0;
		double salesTaxOfArticles = 0;
		for (ArticleDto articleDto : listOfArticles) {
			double price = articleDto.getPrice();
			int quantity = articleDto.getQuantity();
			if (articleDto.isExemptedFromSalesTax()) {
				if (articleDto.isImported()) {
					double taxAmountFinal = calculateTaxAmount(price, IMPORT_DUTY_PERCENTAGE);
					salesTaxOfArticles += taxAmountFinal;
					articleDto.setPrice(round(price + taxAmountFinal));
					totalPriceOfArticles += articleDto.getPrice() * quantity;
				} else {
					totalPriceOfArticles += price * quantity;
				}
			} else {
				if (articleDto.isImported()) {
					double taxAmountFinal = calculateTaxAmount(price, SALES_TAX_PRECENTAGE + IMPORT_DUTY_PERCENTAGE);
					salesTaxOfArticles += taxAmountFinal;
					articleDto.setPrice(round(price + taxAmountFinal));
					totalPriceOfArticles += articleDto.getPrice() * quantity;
				} else {
					double taxAmountFinal = calculateTaxAmount(price, SALES_TAX_PRECENTAGE);
					salesTaxOfArticles += taxAmountFinal;
					articleDto.setPrice(round(price + taxAmountFinal));
					totalPriceOfArticles += articleDto.getPrice() * quantity;
				}
			}
		}
		return new ReceiptDto(listOfArticles, round(totalPriceOfArticles), round(salesTaxOfArticles));
	}

	private double calculateTaxAmount(double price, int totalTaxPercentage) {
		double taxAmount = (price * totalTaxPercentage) / 100;
		double taxAmountFinal = round(Math.round(taxAmount * 20.0) / 20.0);
		return taxAmountFinal;
	}

	private double round(double value) {
		return new BigDecimal(value).setScale(2, RoundingMode.HALF_UP).doubleValue();
	}
}
