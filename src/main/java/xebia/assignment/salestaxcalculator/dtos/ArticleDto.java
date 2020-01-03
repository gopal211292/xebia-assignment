package xebia.assignment.salestaxcalculator.dtos;

/**
 * ArticleDto : Model for getting the item details
 * 
 * @author gopal211292@gmail.com
 *
 */
public class ArticleDto {
	private int quantity;
	private String articleName;
	private double price;
	private boolean isImported;
	private boolean isExemptedFromSalesTax;

	/**
	 * ArticleDto()
	 * 
	 * @param quantity
	 * @param articleName
	 * @param price
	 * @param isImported
	 * @param isExemptedFromSalesTax
	 */
	public ArticleDto(int quantity, String articleName, double price, boolean isImported,
			boolean isExemptedFromSalesTax) {
		super();
		this.quantity = quantity;
		this.articleName = articleName;
		this.price = price;
		this.isImported = isImported;
		this.isExemptedFromSalesTax = isExemptedFromSalesTax;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isImported() {
		return isImported;
	}

	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}

	public boolean isExemptedFromSalesTax() {
		return isExemptedFromSalesTax;
	}

	public void setExemptedFromSalesTax(boolean isExemptedFromSalesTax) {
		this.isExemptedFromSalesTax = isExemptedFromSalesTax;
	}

	@Override
	public String toString() {
		return "ArticleDto [quantity=" + quantity + ", articleName=" + articleName + ", price=" + price
				+ ", isImported=" + isImported + ", isExemptedFromSalesTax=" + isExemptedFromSalesTax + "]";
	}

}
