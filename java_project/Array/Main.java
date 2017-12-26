package Array;

public class Main {
    public static void main(String[] args) {
		Grocerylist mygrocery = new Grocerylist();
		System.out.println(mygrocery+"-------------");
		mygrocery.additem("shirts");
		mygrocery.additem("tomatoes");
		mygrocery.additem("potatoes");
		mygrocery.printCart();
		
		System.out.println(mygrocery.toString());
	}

}
