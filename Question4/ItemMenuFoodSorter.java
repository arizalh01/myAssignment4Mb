package myAssignment.com.Question4;

import java.util.ArrayList;
import java.util.Collections;


public class ItemMenuFoodSorter {
	
	ArrayList<ItemMenuFood> itemMenuFood = new ArrayList<>(); 

	public ItemMenuFoodSorter(ArrayList<ItemMenuFood> itemMenuFood) {
		this.itemMenuFood= itemMenuFood;
	}

	
	public  ArrayList<ItemMenuFood> getSortedItemMenuById() {
		Collections.sort(itemMenuFood,ItemMenuFood.idComp);
		return itemMenuFood;
	}	
	
	

}
