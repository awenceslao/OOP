package items;

import java.util.ArrayList;

public class pack extends items{
	private int Capacity;
	private int SpaceRemaining;
	private ArrayList<items> itemPack = new ArrayList<items>();
	
	public int getCapacity() {
		return Capacity;
	}

	public void setCapacity(int capacity) {
		Capacity = capacity;
	}

	public int getSpaceRemaining() {
		return SpaceRemaining;
	}

	public void setSpaceRemaining(int spaceRemaining) {
		SpaceRemaining = spaceRemaining;
	}

	
	public pack() {
	}
	
	/**
	 * Required because a pack is its own item 
	 * with its own name, size, value, and costs
	 */
	public pack(String _itemName, int _itemSize, int _itemCost, int _itemValue, int _Capacity, items _item){
		super(_itemName, _itemSize, _itemCost, _itemValue);
		setCapacity(_Capacity);
	}
	
	
	public boolean addItem(items toAdd){//make the actual item in the menu
		boolean add = false;
		if(Capacity > toAdd.itemSize ){
			itemPack.add(toAdd);
			System.out.println("Item added");
			Capacity -= toAdd.itemSize;
			System.out.println("Remaining space: " + Capacity);			
			add =  true;
		}
		else{
			System.out.println("Item not added");
			add = false;
		}
		
		return add;
	}

	
	
	
	
	public boolean transferItems(ArrayList<items> newPack){//Only when transferring items between packs
		boolean wasAdded = false;
		if(newPack.size() >= itemPack.size()){
			newPack.addAll(0, itemPack);
			wasAdded = true;
		}
		return wasAdded;
		
	}
	
	
	
	
	
	
	/**
	 * Remove item via index number
	 */
	public items removeItem(int _index){
		if(_index < 0 || _index > (itemPack.size() - 1) ){
			return null;
		}
		else {
		Capacity += itemPack.get(_index).itemSize;
		itemPack.remove(_index);
		System.out.println("Remove Succesful");
		return itemPack.get(_index);
		}
	}
	
	/**
	 * Remove a specified item
	 */
	public items removeItem(items it){
		if(itemPack.contains(it) == false){
			return null;
		}
		Capacity += it.itemSize;
		itemPack.remove(it);
		return it;
	}
	
	

	
	
	
	
	
	
	public ArrayList<items> empty(ArrayList<items> toDump){
		toDump.clear();
		return itemPack;
	}
	
	
	@Override
	public String toString(){
		String state = "\n" + getItemName() + "\nSize: " + getItemSize() + "\tCapacity: " + getCapacity() + 
				"\nCost: " + getItemCost() + " gold" + "\tValue: " + getItemValue() + " gold" + "\n\n" 
						+ "\tItems in pack:";
		for (items in : itemPack) {
			state += "\n" + in;
		}
		return state;
	}

	
	
	
	
	
	
	
	
	
	
	

	
}
