package Array;

import java.util.ArrayList;

public class Grocerylist {

	   private ArrayList<String> mygroceryList= new ArrayList<String>();
	   
	   public void additem(String item){
		   mygroceryList.add(item);
		   
	   }
	   
	   public void printCart(){
		   System.out.println(mygroceryList);
	   }
	   
	   
	   public void removeitem(String item){
		   mygroceryList.remove(item);
	   }
	    
	
		 

	}
