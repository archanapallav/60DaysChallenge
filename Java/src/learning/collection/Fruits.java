package learning.collection;

public class Fruits {
	private String fruitName;
	private String fruitColor;
	private int fruitQty;
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitColor() {
		return fruitColor;
	}
	public void setFruitColor(String fruitColor) {
		this.fruitColor = fruitColor;
	}
	public int getFruitQty() {
		return fruitQty;
	}
	public void setFruitQty(int fruitQty) {
		this.fruitQty = fruitQty;
	}
	@Override
	public String toString() {
		return "Fruits [fruitName=" + fruitName + ", fruitColor=" + fruitColor + ", fruitQty=" + fruitQty + "]";
	}
	
	
	

}
