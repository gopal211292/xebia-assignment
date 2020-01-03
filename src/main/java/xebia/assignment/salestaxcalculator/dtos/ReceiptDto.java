package xebia.assignment.salestaxcalculator.dtos;

import java.util.List;

/**
 * 
 * ReceiptDto : Model for printing the receipt
 * 
 * @author gopal211292@gmail.com
 *
 */
public class ReceiptDto {

	private List<ArticleDto> listOfArticles;
	private double totalPriceOfArticles;
	private double salesTaxOfArticles;

	/**
	 * @param listOfArticles
	 * @param totalPriceOfArticles
	 * @param salesTaxOfArticles
	 */
	public ReceiptDto(List<ArticleDto> listOfArticles, double totalPriceOfArticles, double salesTaxOfArticles) {
		super();
		this.listOfArticles = listOfArticles;
		this.totalPriceOfArticles = totalPriceOfArticles;
		this.salesTaxOfArticles = salesTaxOfArticles;
	}

	public List<ArticleDto> getListOfArticles() {
		return listOfArticles;
	}

	public void setListOfArticles(List<ArticleDto> listOfArticles) {
		this.listOfArticles = listOfArticles;
	}

	public double getTotalPriceOfArticles() {
		return totalPriceOfArticles;
	}

	public void setTotalPriceOfArticles(double totalPriceOfArticles) {
		this.totalPriceOfArticles = totalPriceOfArticles;
	}

	public double getSalesTaxOfArticles() {
		return salesTaxOfArticles;
	}

	public void setSalesTaxOfArticles(double salesTaxOfArticles) {
		this.salesTaxOfArticles = salesTaxOfArticles;
	}

	@Override
	public String toString() {
		return "ReceiptDto [listOfArticles=" + listOfArticles + ", totalPriceOfArticles=" + totalPriceOfArticles
				+ ", salesTaxOfArticles=" + salesTaxOfArticles + "]";
	}

}
