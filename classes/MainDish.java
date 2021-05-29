package classes;
import java.lang.*;
import interfaces.*;

public class MainDish extends FoodItem
{
	private String category;
	
	public void setCategory(String category){this.category=category;}
	public String getCategory(){return category;}
	
	public void showInfo()
	{
    System.out.println(" Food ID: "+fid);
	System.out.println(" Food name: "+name);
	System.out.println(" Available Quality: "+availableQuantity);
	System.out.println("Price :"+price  );
	 System.out.println(" Food Category: "+category);
	}
}