import java.lang.*;
import java.util.*;
import classes.*;
import interfaces.*;
import fileio.*;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		FoodCourt f=new FoodCourt();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		System.out.println();
		System.out.println("                         OPEN                   ");
		System.out.println("------(^-^)---- Welcome to the food court---(^-^)-------");
		boolean repeat=true;
		while(repeat)
		{
		    System.out.println("What do you want to do?\n");
		    System.out.println("___1.Employee Management ");
			System.out.println("___2. Restaurant Management");
			System.out.println("___3. Restaurant FoodItem Management");
			System.out.println("___4. FoodItem Quality Add-Sell");
			System.out.println("___5. Exit\n");
			System.out.println();
    		
			System.out.println("Enter your choice :");
			  try
		{	  
				int choice=sc.nextInt();
				switch (choice)
				{
					case 1:
					System.out.println("-------(^-^)------");
					System.out.println();
					System.out.println("You have choosen Employee Management");
					System.out.println("choose any option:");
					System.out.println("1.Insert New Employee. \n2.Get an Employee \n3.Removing an Existing Employee \n4.Show All Employees \n  5.Go Back\n");
					System.out.println();
					
					System.out.println("Your choice: ");
					int option1=sc.nextInt();
					switch(option1)
					{
						case 1:
						System.out.println("********START************");
						System.out.println();
						System.out.println("Insert New Employee :");
						
						System.out.println("Enter Employee Id :" );
						String empId1 = sc.next();
						System.out.println("Enter Employee Name: ");
						String name1 = sc.next();
						System.out.println("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							f.insertEmployee(e1);
							
					    System.out.println("*******END***********");
						System.out.println();
						break;
					    
					    case 2:
					    System.out.println("*******START**********");
						System.out.println();
                        System.out.println("Get an employee");
					    System.out.println("Enter Employee Id:");
					    String empId2=sc.next();
					    Employee e2=f.getEmployee(empId2);
					    if(e2!=null)
					    {
						    System.out.println("");
						    System.out.println("Employee Id:"+e2.getNid());
						    System.out.println("Employee Name: "+e2.getName());
						    System.out.println("Employee Salary"+e2.getSalary());
						    System.out.println("");
					    }
					    else {System.out.println("Employee not found!");}
					    
					    System.out.println("********END***********");
						System.out.println();
					    break;
					    
				        case 3:
				        System.out.println("*******START**********");
						System.out.println();
					    System.out.println("Remove an existing Employee");
					    System.out.println("Enter Employee ID:");
					    String empId3 = sc.next();
					    
					    Employee e3 = f.getEmployee(empId3);
					    
					    if(e3!=null)
					    {
						    f.removeEmployee(e3);
					    }
					    else {System.out.println("Already empty");}
					    System.out.println("********END***********");
						System.out.println();
					    break;
						
				        case 4:
				        System.out.println("*******START**********");
						System.out.println();
					    System.out.println("Show All Employees");
					    f.showAllEmployees();
					    System.out.println("********END***********");
						System.out.println();
					    
					    break;
					     
				        case 5:
						
						System.out.println("*******START**********");
						System.out.println();
						System.out.println("Going Back......");
						System.out.println("********END***********");
						System.out.println();
						break;
							
						default:
						System.out.println("*******START**********");
						System.out.println();
						System.out.println("Invalid Option");
						System.out.println("********END***********");
						System.out.println();
						break;
						
				    }
				    System.out.println("-------THANK YOU-------");
					System.out.println();
					System.out.println();
				    break;
				/////////////////////////////////////////////////////
				case 2:
                    System.out.println("-------(^-^)------");
					System.out.println();
					System.out.println("You have choosen Restaurant management");
					System.out.println("Choose an option");
					System.out.println("1.Insert new Restaurant \n 2.Remove an existing Restaurant \n 3.Show all Restaurant \n 4.Search a restaurant \n 5.Go back ");
					System.out.println("Your choice:");
					int option2=sc.nextInt();
					
					switch(option2)
					{   
					    case 1:
					    
						System.out.println("*******START*******");
						System.out.println();
						System.out.println("Insert new Restaurant");
						System.out.println("Enter Restaurant ID: ");
						String rid1=sc.next();
						System.out.println("Enter Restaurant Name: ");
						String name1=sc.next();
						
						Restaurant r1=new Restaurant();
						r1.setRid(rid1);
						r1.setName(name1);
						
						f.insertRestaurant(r1);
						System.out.println("*******END*********");
						System.out.println();
						break;
					    
					    case 2:
						System.out.println("*******START*******");
						System.out.println();
						System.out.println("Remove an Existing Restaurant");
						System.out.println("Enter Restaurant ID ");
						String rid2=sc.next();
						Restaurant r2=f.getRestaurant((rid2));
                        
						if (r2!=null)
						{
							f.removeRestaurant(r2);
						}
						else {System.out.println("already empty");}
						System.out.println("*******END*********");
						System.out.println();
						break;
						
						case 3:
						System.out.println("*******START*******");
						System.out.println();
						System.out.println("Show All retaurant");
						f.showAllRestaurants();
						System.out.println("*******END*********");
						System.out.println();
						break;
						
						case 4:
						System.out.println("*******START*******");
						System.out.println();
						System.out.println("Search a restaurant:");
						System.out.println("Enter Shop ID: ");
						String rid3=sc.next();
						Restaurant r3=f.getRestaurant(rid3);
						
						if(r3!=null)
						{
							System.out.println("");
							System.out.println("Restaurant name :"+r3.getName());
							System.out.println("Restaurant ID :"+r3.getRid());
							r3.showAllFoodItems( ) ;
							System.out.println("");
							
						}
						else {System.out.println("Empty");}
						System.out.println("*******END*********");
						System.out.println();
						break;
						
						case 5:
						
							System.out.println("*******************");
							System.out.println("Going Back......");
							System.out.println("*******************");
							break;
							
						default:
						
							System.out.println("*******************");
							System.out.println("Invalid Option");
							System.out.println("*******************");
							break;
					}
					
					System.out.println("-------THANK YOU-------");
					System.out.println();
					System.out.println();
					break;
					////////////////////////////////////////
				case 3:
				     System.out.println("-------(^-^)------");
					 System.out.println();
					System.out.println("You have choosen FoodItem management");
					System.out.println("Choose an option");
					System.out.println("1.Insert new FoodItem \n 2.Remove an existing FoodItem \n 3.Show all FoodItem \n 4.Search a FoodItem \n 5.Go back ");
					System.out.println("Your choice:");
					int option3=sc.nextInt();
					
					switch(option3)
					{
						case 1:
						System.out.println("*******START*******");
						System.out.println();
						System.out.println("Insert New FoodItem\n");
						FoodItem q=null;
						System.out.println("Which type of Food Item\n");
						System.out.println("1. Imported FoodItem");
						System.out.println("2. Local FoodItem");
						System.out.println("3. Go Back");
					    System.out.print("Enter Type: ");
						int type=sc.nextInt();
						
						if(type==1)
						{
							MainDish m=new MainDish();
							System.out.print("Food item ID: ");
							String fid1=sc.next();
							System.out.print("Food item Name:");
							String fn1 = sc.next();
							System.out.print("Available Quantity: ");
							int aq1 = sc.nextInt();
							System.out.print("Price :");
							int pp1=sc.nextInt();
							System.out.print("Category :");
							String c1=sc.next();
							
							m.setFid(fid1); 
							m.setName(fn1); 
							m.setAvailableQuantity(aq1); 
							m.setPrice(pp1);
							m.setCategory(c1);
							q=m;
						}
						else if(type==2)
						{
							MainDish m2=new MainDish();
							System.out.print("Food item ID: ");
							String fid1=sc.next();
							System.out.print("Food item Name:");
							String fn1 = sc.next();
							System.out.print("Available Quantity: ");
							int aq1 = sc.nextInt();
							System.out.print("Price :");
							int pp1=sc.nextInt();
							System.out.print("Category :");
							String c1=sc.next();
							
							m2.setFid(fid1); 
							m2.setName(fn1); 
							m2.setAvailableQuantity(aq1); 
							m2.setPrice(pp1);
							m2.setCategory(c1);
					        q=m2;
						}
						else if(type==3)
						{
							System.out.println("Going back..... :)");
						}
						else 
						{
							System.out.println("Invalid");
						}
						
						if (q!=null)
						{
							System.out.print("Enter Restaurant ID: ");
							String rid=sc.next();
							
					        f.getRestaurant(rid).insertFoodItem(q);
					    }
						System.out.println("*******END*******");
						System.out.println();
						break;
						
					    case 2:
						System.out.println("*******START*******");
						System.out.println();
						System.out.println("Remove existing Fooditem");
						
						System.out.println("Enter food item ID :");
						String fid2=sc.next();
						System.out.println("Enter Restaurant ID: ");
						String rid2=sc.next();
						f.getRestaurant(rid2).removeFoodItem(f.getRestaurant(rid2).getFoodItem(fid2));
						
						System.out.println("*******END*******");
						System.out.println();
						break;
						
						case 3:
						System.out.println("*******START*******");
						System.out.println();
						System.out.println("Search a food item:");
						
						System.out.print("Enter Food ID: ");
						String fid3 = sc.next();
						System.out.print("Enter Restaurant ID: ");
						String rid3 = sc.next();
						
						
						FoodItem fi=f.getRestaurant(rid3).getFoodItem(fid3);
						
						if(fi !=null)
						{
							fi.showInfo();
						}
						System.out.println("*******END*******");
						System.out.println();
						break;
						
						case 4:
						System.out.println("*******START*******");
						System.out.println();
						System.out.println("Show All FoodItem ");
						System.out.println("Enter Restaurant ID : ");
						String rid4=sc.next();
						
						f.getRestaurant(rid4).showAllFoodItems();
                        
						System.out.println("*******END*******");
						System.out.println();
						break;
						
						case 5:
						System.out.println("*******START*******");
						System.out.println();
						System.out.println("Going back..... :)");
						System.out.println("*******END*******");
						System.out.println();
						break;
						
					default:
					    System.out.println("*******START*******");
						System.out.println();
						System.out.println("Invalid Option");
						System.out.println("*******END*******");
						System.out.println();
						
					break;}
					System.out.println("-------THANK YOU-------");
					System.out.println();
					System.out.println();
					break;
					
					////////////////////////////////////////
				case 4:
				    System.out.println("-------(^-^)------");
					System.out.println();
					System.out.println("Food Quantity Add-Sell");
					System.out.println("What do you want to do?\n");
					
					System.out.println("1.Add Food Item   \n2.Sell Food Item   \n3.Show Add Sell History    \n4.Go Back");
					
					
					System.out.println("Enter your option :");
					int input4=sc.nextInt();
					
					switch(input4)
					{
						case 1:
						System.out.println("*******START*******");
						System.out.println();
						System.out.println("Add Food item \n");
						System.out.println("Enter Food ID :");
						String fid1=sc.next();
						System.out.println("Enter Restaurant ID: ");
						String rid1=sc.next();
						System.out.println("Enter to Add quantity :");
						int amount1=sc.nextInt();
						
					if(amount1>0)
					{
						f.getRestaurant(rid1).getFoodItem(fid1).addQuantity(amount1);
						frwd.writeInFile("Quantity Added: "+ amount1+"  Food item :"+f.getRestaurant(rid1).getFoodItem(fid1).getName()+"  Id :"+ fid1+"  Restaurant: "+f.getRestaurant(rid1).getName());
							}
							else
							{
								System.out.println("INVALID AMOUNT");
							}
							
							System.out.println("");
							break;
							
						case 2:
						
							System.out.println("*******START*******");
							System.out.println();
							System.out.println("Sell Food Item");
							
							System.out.print("Enter Food ID: ");
							String fid20 = sc.next();
							System.out.print("Enter Restaurant ID: ");
							String rid20 = sc.next();
							System.out.print("Enter Sell Quantity: ");
							int amount2 = sc.nextInt();
							
							if(amount2>0 && amount2 <= f.getRestaurant(rid20).getFoodItem(fid20).getAvailableQuantity())
							{
								f.getRestaurant(rid20).getFoodItem(fid20).sellQuantity(amount2);

								frwd.writeInFile("Sold Quantity: "+ amount2+"  Food Item :"+f.getRestaurant(rid20).getFoodItem(fid20).getName()+"  Id :"+ fid20+"   Restaurant : "+f.getRestaurant(rid20).getName());
							}
							else
							{
								System.out.println("INVALID AMOUNT");
							}
							
							System.out.println("*******END*******");
							System.out.println();
							break;

						case 3:
						
							System.out.println("*******START*******");
							System.out.println();
							System.out.println("Show Add Sell History");
							frwd.readFromFile();
							
							System.out.println("*******END*******");
							System.out.println();
							break;
							
						case 4:
						
							System.out.println("*******START*******");
							System.out.println();
							System.out.println("Going Back..");
							System.out.println("*******END*******");
							System.out.println();
							break;
							
						default:
						
							System.out.println("*******START*******");
							System.out.println();
							System.out.println("Invalid Option");
							System.out.println("*******END*******");
							System.out.println();
							break;
					}
					
					System.out.println("------------THANK YOU---------------");
					System.out.println();System.out.println();
					break;
					//////////////
								
				case 5:
				
					System.out.println("*******START*******");
					System.out.println();
					System.out.println("Exit");
					repeat = false;
					System.out.println("********END*******");
					System.out.println();
					
					break;
					
				default:
				
					System.out.println("*******START*******");
					System.out.println();
					System.out.println("Invalid Option");
					System.out.println();
					System.out.println("*******END*******");
					
					
			}
			
}
 catch(InputMismatchException ime)
			{   
			    System.out.println();
				System.out.println("Opps! InputMismatchException occured");
				System.out.println("Please Enter Proper Input");
				System.out.println();
				
				String a = sc.next();
			}
			catch(NullPointerException npe)
			{
				System.out.println();
				System.out.println("Sorry!NullPointerException occured");		
                System.out.println("Your input information does not exist");
				System.out.println();
				
			}
			catch(Exception e)
			{
				System.out.println("Exception occured ");
				e.printStackTrace();
				String a = sc.next();
				
			}
			
		}	
	}
	
}
            
			
			
	
			