package classes;
import java.lang.*;
import interfaces.*;

public class Appertizers extends FoodItem
{
	private String size;
	public void setSize(String size) {this.size=size;}
	public String getSize(){return size;}
	
	public void showInfo()
	
	{
		System.out.println(" Food ID: "+fid);
		System.out.println(" Food name: "+name);
		System.out.println(" Available Quantity: "+availableQuantity);
		System.out.println("size :"+size);
	}
}