package items;

public class items {
	protected String itemName;
	protected int itemSize;
	protected int itemCost;
	protected int itemValue;
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemSize() {
		return itemSize;
	}

	public void setItemSize(int itemSize) {
		this.itemSize = itemSize;
	}

	public int getItemCost() {
		return itemCost;
	}

	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}

	public int getItemValue() {
		return itemValue;
	}

	public void setItemValue(int itemValue) {
		this.itemValue = itemValue;
	}

	
	
	
	
	public items() {
	}
	
	public items(String _itemName, int _itemSize, int _itemCost, int _itemValue) {
		setItemName(_itemName);
		setItemSize(_itemSize);
		setItemCost(_itemCost);
		setItemValue(_itemValue);
	}
	
	@Override
	public String toString(){
		String state = "\n" + getItemName() + "\nSize: " + getItemSize() + " blocks " + "\tCost: " 
				+ getItemCost() + " gold" + "\tValue: " + getItemValue() + " gold";
		return state;
	}
	
	

	
	
	
	
	
	
	
	
}
