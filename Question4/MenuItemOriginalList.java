package myAssignment.com.Question4;
import java.util.ArrayList;

public class MenuItemOriginalList {
	
    
	//public void listMenuItemOriginal() throws Exception {
	public static void main(String[] args) {
		ItemMenuFood  itemMenuFood1 = new ItemMenuFood(1004,"18 piece feast",30,"SignatureChicken");
		ItemMenuFood  itemMenuFood2 = new ItemMenuFood(1001,"3 piece feast",12,"SignatureChicken");
		ItemMenuFood  itemMenuFood3 = new ItemMenuFood(1003,"13 piece feast",25,"SignatureChicken");
		ItemMenuFood  itemMenuFood4 = new ItemMenuFood(2000,"Big Mary",13,"Combos");
		ItemMenuFood  itemMenuFood5 = new ItemMenuFood(2001,"Bufallo Chicken Wrap",12,"Combos");
		ItemMenuFood  itemMenuFood6 = new ItemMenuFood(2004,"Chicken Tenders or Original",19,"Combos");
		ItemMenuFood  itemMenuFood7 = new ItemMenuFood(3002,"Mini Mary",9,"Snacks");
		
		ArrayList<ItemMenuFood> itemMenuFoodList = new ArrayList<>();
		itemMenuFoodList.add(itemMenuFood1);
		itemMenuFoodList.add(itemMenuFood2);
		itemMenuFoodList.add(itemMenuFood3);
		itemMenuFoodList.add(itemMenuFood4);
		itemMenuFoodList.add(itemMenuFood5);
		itemMenuFoodList.add(itemMenuFood6);
		itemMenuFoodList.add(itemMenuFood7);
		
		//System.out.println("Unsorted List: "+itemMenuFoodList);
		SortArrayListAscendingDescending sortArrayList = new SortArrayListAscendingDescending(itemMenuFoodList); 
		ArrayList<ItemMenuFood> unsortedArrayList = sortArrayList.getArrayList();
		System.out.println("-----Unsorted Array List---" );
		System.out.println(unsortedArrayList);
		
		System.out.println("-----Sorted Item Menu by Id: Ascending-----");
		ItemMenuFoodSorter itemMenuFoodSorter = new ItemMenuFoodSorter(itemMenuFoodList);
		ArrayList<ItemMenuFood> sortedItemMenu = itemMenuFoodSorter.getSortedItemMenuById();
		for (ItemMenuFood itemMenuFood : sortedItemMenu) {             
			    System.out.println(itemMenuFood);         
		} 
		
	    
	    
	    
		
	}

}
