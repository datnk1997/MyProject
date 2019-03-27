package Model;

public class CartDetail {
	private int CDid;
	private Product product;
	private int total;
	private int quantity;

	public CartDetail() {

	}

	public CartDetail(Product product, int total, int quantity) {
		this.product = product;
		this.total = total;
		this.quantity = quantity;
	}

	public int getCDid() {
		return CDid;
	}

	public void setCDid(int cDid) {
		CDid = cDid;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CartDetail [CDid=" + CDid + ", product=" + product + ", total=" + total + ", quantity=" + quantity
				+ "]";
	}
	
}
