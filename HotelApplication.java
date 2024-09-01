import java.util.Scanner;
class HotelApplication
{
	public static void main(String[]args)
	{
		System.out.println("*****Shubham's Mansion*****");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.println("**********WELCOME**********");
		System.out.println();
		System.out.println("Please Select An Option From Menu");
		System.out.println("Option 1 : Vegetarian");
		System.out.println("Option 2 : Non Vegeterian");
		int menu = sc.nextInt();
		
		switch(menu)
		{
			case 1:
			{
				System.out.println();
				System.out.println("**********VEG DISHES**********");
				System.out.println();
				System.out.println("Dishes                      Prices");
				System.out.println();
				System.out.println("1. Makhni Paneer Biryani    300.00");
				System.out.println("2. Dum Panner Kali Mirch    250.00");
				System.out.println("3. Satrangi Biryani         200.00");
				System.out.println("4. Dal Makhani              150.00");
				System.out.println("5. Veg Soya Keema           100.00");
				
				System.out.println();
				System.out.print("Please Choose Options : ");
				int dish = sc.nextInt();
				switch(dish)
				{
					case 1 : 
					{
					System.out.println("You Have Selected Makhani Paneer Biryani");
					System.out.println();
					System.out.print("Enter The Quantity Of Dish : ");
					int quantity = sc.nextInt();
					int price = 300;
					int totalAmount = quantity*price;
					System.out.println();
					System.out.println("The Amount To Be Paid : "+" "+totalAmount);
					}
					break;
					
					case 2 :
					{					
					System.out.println("You Have Selected Dum Panner Kali Mirch");
					System.out.println();
					System.out.print("Enter The Quantity Of Dish : ");
					int quantity = sc.nextInt();
					int price = 250;
					int totalAmount = quantity*price;
					System.out.println();
					System.out.println("The Amount To Be Paid : "+" "+totalAmount);
					}
					break;
					
					case 3 : 
					{
					System.out.println("You Have Selected Satrangi Biryani");
					System.out.println();
					System.out.print("Enter The Quantity Of Dish : ");
					int quantity = sc.nextInt();
					int price = 200;
					int totalAmount = quantity*price;
					System.out.println();
					System.out.println("The Amount To Be Paid : "+" "+totalAmount);
					}
					break;
					
					case 4 : 
					{
					System.out.println("You Have Selected Dal Makhani");
					System.out.println();
					System.out.print("Enter The Quantity Of Dish : ");
					int quantity = sc.nextInt();
					int price = 150;
					int totalAmount = quantity*price;
					System.out.println();
					System.out.println("The Amount To Be Paid : "+" "+totalAmount);
					}
					break;
					
					case 5 : 
					{
					System.out.println("You Have Selected Veg Soya Keema");
					System.out.println();
					System.out.print("Enter The Quantity Of Dish : ");
					int quantity = sc.nextInt();
					int price = 100;
					int totalAmount = quantity*price;
					System.out.println();
					System.out.println("The Amount To Be Paid : "+" "+totalAmount);
					}
					break;
					
					default :
					{
						System.out.println("Invalid Input");
					}
				}
				break;
			}
			
			case 2:
			{
				System.out.println();
				System.out.println("*********NON VEG DISHES*********");
				System.out.println();
				System.out.println("Dishes                      Prices");
				System.out.println();
				System.out.println("1. Nihari                   350.00");
				System.out.println("2. Marag                    300.00");
				System.out.println("3. Karahi                   250.00");
				System.out.println("4. Vindaloo                 200.00");
				System.out.println("5. Rogan Josh               150.00");
				
				System.out.println();
				System.out.print("Please Choose Options : ");
				int dish = sc.nextInt();
				switch(dish)
				{ 
					case 1 : 
					{
						
					System.out.println("You Have Selected Nihari");
					System.out.println();
					System.out.print("Enter The Quantity Of Dish : ");
					int quantity = sc.nextInt();
					int price = 350;
					int totalAmount = quantity*price;
					System.out.println();
					System.out.println("The Amount To Be Paid : "+" "+totalAmount);
					}
					break;
					
					case 2 :
					{					
					System.out.println("You Have Selected Marag");
					System.out.println();
					System.out.print("Enter The Quantity Of Dish : ");
					int quantity = sc.nextInt();
					int price = 300;
					int totalAmount = quantity*price;
					System.out.println();
					System.out.println("The Amount To Be Paid : "+" "+totalAmount);
					}
					break;
					
					case 3 : 
					{
					System.out.println("You Have Selected Karahi");
					System.out.println();
					System.out.print("Enter The Quantity Of Dish : ");
					int quantity = sc.nextInt();
					int price = 250;
					int totalAmount = quantity*price;
					System.out.println();
					System.out.println("The Amount To Be Paid : "+" "+totalAmount);
					}
					break;
					
					case 4 : 
					{
					System.out.println("You Have Selected Vindaloo");
					System.out.println();
					System.out.print("Enter The Quantity Of Dish : ");
					int quantity = sc.nextInt();
					int price = 200;
					int totalAmount = quantity*price;
					System.out.println();
					System.out.println("The Amount To Be Paid : "+" "+totalAmount);
					}
					break;
					
					case 5 : 
					{
					System.out.println("You Have Selected Rogan Josh");
					System.out.println();
					System.out.print("Enter The Quantity Of Dish : ");
					int quantity = sc.nextInt();
					int price = 150;
					int totalAmount = quantity*price;
					System.out.println();
					System.out.println("The Amount To Be Paid : "+" "+totalAmount);
					}
					break;

					default :
					{
						System.out.println("Invalid Input");
					}
				}
				break;
			}
			default :
			{
				System.out.println("Invalid Input");
			}
		}
	}
}