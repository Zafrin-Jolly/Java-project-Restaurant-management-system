package classes;
import java.lang.*;
import interfaces.*;

public class FoodCourt implements EmployeeOperations,RestaurantOperations
{
	private Restaurant restaurants[]=new Restaurant[100];
	private Employee employees[]=new Employee[100];
	
	
	public void  insertRestaurant(Restaurant r) 
	{
		int flag=0;
		for(int i=0;i<restaurants.length;i++)
		{
			if(restaurants[i]==null)
			{
				restaurants[i]=r;
				flag=1;
				break;
			}
		}
		if (flag==1) {System.out.println("Food inserted");}
		else {System.out.println("Food can't be inseted");}
	}
	
	public void  removeRestaurant(Restaurant r) 
	{
		int flag=0;
		for(int i=0;i<restaurants.length;i++)
		{
			if(restaurants[i]==r)
			{
				restaurants[i]=null;
				flag=1;
				break;
			}
			
		}
		if(flag==1){System.out.println("Food item removed");}
		else {System.out.println("Shop can not be removed");}
	}
	public Restaurant getRestaurant(String rid) 
	{
		Restaurant r = null;
		for(int i=0;i<restaurants.length;i++)
		{
			if(restaurants[i]!=null)
			{
				r=restaurants[i];
				break;
			}
		} return r;
	}
	
	public void showAllRestaurants() 
	{
		for(Restaurant r:restaurants)
		{
			if(r!=null)
			{
			
			System.out.println("Restaurant Name: "+r.getName());
			System.out.println("Restaurant id: "+r.getRid());
			
				r.showAllFoodItems();
				System.out.println();
			}
		}
	}
	
public void insertEmployee(Employee e)
	{
		int flag = 0;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Employee Inserted");}
		else{System.out.println("Employee can Not be Inserted");}
	}
	
	public void removeEmployee(Employee e)
	{
		int flag = 0;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Employee Removed");}
		else{System.out.println("Employee can Not be Removed");}
	}
	public void showAllEmployees()
	{
		
		for(Employee e : employees)
		{
			if(e!= null)
			{
				System.out.println("Employee Name: "+ e.getName());
				System.out.println("Employee Id: "+ e.getNid());
				System.out.println("Salary: "+ e.getSalary());
				System.out.println();
			}
		}
		
	}
	
	public Employee getEmployee(String empId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getNid().equals(empId))
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	
	
}	
			
			
			
				
				
				
				
				
				