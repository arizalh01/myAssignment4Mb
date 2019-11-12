package myAssignment.com.Question4;

import java.util.Comparator;

public class ItemMenuFood {
	public static Comparator idComparator;
	private int Id ;
	private String itemName ;    
	private float price;   
	private String category;  
	
	public ItemMenuFood(int id, String itemName, float price, String category) {
		Id = id;
		this.itemName = itemName;
		this.price = price;
		this.category = category;
	}
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public static Comparator<ItemMenuFood> idComp = new Comparator<ItemMenuFood>() {         
	    @Override         
	    public int compare(ItemMenuFood jc1, ItemMenuFood jc2) {             
	      return (jc2.getId() < jc1.getId() ? -1 :                     
	              (jc2.getId() == jc1.getId() ? 0 : 1));           
	    }     
	  };   
	
	public int compareTo(ItemMenuFood itemMenuFood) {          
	    return (this.getId() < itemMenuFood.getId() ? -1 : 
	            (this.getId() == itemMenuFood.getId() ? 0 : 1));     
	  }     
	
	@Override
	public String toString() {
		return  Id + "," + itemName + "," + price + "," + category  +"\n";
	}

	

	
	
	

}
