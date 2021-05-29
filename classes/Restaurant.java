package classes;
import java.lang.*;
import interfaces.*;
public class Restaurant implements FoodItemOperations
{
	private String rid;
	private String name;
    private FoodItem fooditems[]=new FoodItem[100];
    public void setName(String name){this.name=name;}
    public void setRid(String rid){this.rid=rid;}
	public String getName(){return name;}
    public String getRid(){return rid;}	
	public void insertFoodItem(FoodItem f)
	{
	 	int flag = 0;
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] == null)
			{
				fooditems[i] = f;
				flag = 1;
				break;
			}
		}
		if(flag == 1)
		{
			System.out.println("Food name Inserted");
		}
		else
		{
			System.out.println("Can Not Insert");
		}
	}
	
    public void removeFoodItem(FoodItem f)
	{
		int flag = 0;
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] == f)
			{
				fooditems[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("food item Removed");}
		else{System.out.println("Can Not Remove");}
	}
	
	
    public FoodItem getFoodItem(String rid)
	{
		FoodItem f = null;
		
		for(int i=0; i<fooditems.length; i++)
		{
			if(fooditems[i] != null)
			{
				if(fooditems[i].getFid().equals(rid))
				{
					f=fooditems[i];
					break;
				}
			}
		}
		return f;
	}
	
	
    public void showAllFoodItems( )
	{
		for(FoodItem f : fooditems)
		{
			if(f != null)
			{
				f.showInfo();
			}
		}
	}

}