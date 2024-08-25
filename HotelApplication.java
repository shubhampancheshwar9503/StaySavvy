import java.util.Scanner;

class HotelApplication
{
	public static void main(String[]args)
	{
		System.out.println("Shubham's Mansion");
		Scanner sc = new Scanner(System.in);
		System.out.println("**********WELCOME**********");
		System.out.println("Please Select An Option From Menu");
		System.out.println("Option 1 : Vegetarian");
		System.out.println("Option 2 : Non Vegeterian");
		int Menu = sc.nextInt();
		
		switch(Menu)
		{
			case 1:
			{
				System.out.println("**********VEG DISHES**********");
				System.out.println("Dishes                      Prices");
				System.out.println("1. Makhni Paneer Biryani    300.00");
				System.out.println("2. Dum Panner Kali Mirch    250.00");
				System.out.println("3. Satrangi Biryani         200.00");
				System.out.println("4. Dal Makhani              150.00");
				System.out.println("5. Veg Soya Keema           100.00");
				
				System.out.println("Please Choose Options:");
				int Dish = sc.nextInt();
				switch(Dish)
				{
					case 1 : 
					{
					System.out.println("You Have Selected Makhani Paneer Biryani");
					System.out.println("Enter The Quantity Of Dish");
					int Quantity = sc.nextInt();
					int Price = 300;
					int TotalAmount = Quantity*Price;
					System.out.println("The Amount To Be Paid : "+" "+TotalAmount);
					
					}break;
					
					case 2 :
					{					
					System.out.println("You Have Selected Dum Panner Kali Mirch");
					System.out.println("Enter The Quantity Of Dish");
					int Quantity = sc.nextInt();
					int Price = 250;
					int TotalAmount = Quantity*Price;
					System.out.println("The Amount To Be Paid : "+" "+TotalAmount);
					}break;
					
					case 3 : 
					{
					System.out.println("You Have Selected Satrangi Biryani");
					System.out.println("Enter The Quantity Of Dish");
					int Quantity = sc.nextInt();
					int Price = 200;
					int TotalAmount = Quantity*Price;
					System.out.println("The Amount To Be Paid : "+" "+TotalAmount);
					}break;
					
					case 4 : 
					{
					System.out.println("You Have Selected Dal Makhani");
					System.out.println("Enter The Quantity Of Dish");
					int Quantity = sc.nextInt();
					int Price = 150;
					int TotalAmount = Quantity*Price;
					System.out.println("The Amount To Be Paid : "+" "+TotalAmount);
					}break;
					
					case 5 : 
					{
					System.out.println("You Have Selected Veg Soya Keema");
					System.out.println("Enter The Quantity Of Dish");
					int Quantity = sc.nextInt();
					int Price = 100;
					int TotalAmount = Quantity*Price;
					System.out.println("The Amount To Be Paid : "+" "+TotalAmount);
					}break;
					
					default :
					{
						System.out.println("Invalid Input");
					}
				}break;
			}
			
			case 2:
			{
				System.out.println("**********NON VEG DISHES**********");
				System.out.println("Dishes                      Prices");
				System.out.println("1. Nihari                   350.00");
				System.out.println("2. Marag                    300.00");
				System.out.println("3. Karahi                   250.00");
				System.out.println("4. Vindaloo                 200.00");
				System.out.println("5. Rogan Josh               150.00");
				
				System.out.println("Please Choose Options:");
				int Dish = sc.nextInt();
				switch(Dish)
				{ 
					case 1 : 
					{
					System.out.println("You Have Selected Nihari");
					System.out.println("Enter The Quantity Of Dish");
					int Quantity = sc.nextInt();
					int Price = 350;
					int TotalAmount = Quantity*Price;
					System.out.println("The Amount To Be Paid : "+" "+TotalAmount);
					}break;
					
					case 2 :
					{					
					System.out.println("You Have Selected Marag");
					System.out.println("Enter The Quantity Of Dish");
					int Quantity = sc.nextInt();
					int Price = 300;
					int TotalAmount = Quantity*Price;
					System.out.println("The Amount To Be Paid : "+" "+TotalAmount);
					}break;
					
					case 3 : 
					{
					System.out.println("You Have Selected Karahi");
					System.out.println("Enter The Quantity Of Dish");
					int Quantity = sc.nextInt();
					int Price = 250;
					int TotalAmount = Quantity*Price;
					System.out.println("The Amount To Be Paid : "+" "+TotalAmount);
					}break;
					
					case 4 : 
					{
					System.out.println("You Have Selected Vindaloo");
					System.out.println("Enter The Quantity Of Dish");
					int Quantity = sc.nextInt();
					int Price = 200;
					int TotalAmount = Quantity*Price;
					System.out.println("The Amount To Be Paid : "+" "+TotalAmount);
					}break;
					
					case 5 : 
					{
					System.out.println("You Have Selected Rogan Josh");
					System.out.println("Enter The Quantity Of Dish");
					int Quantity = sc.nextInt();
					int Price = 150;
					int TotalAmount = Quantity*Price;
					System.out.println("The Amount To Be Paid : "+" "+TotalAmount);
					}break;

					default :
					{
						System.out.println("Invalid Input");
					}
				}break;
			}
			default :
			{
				System.out.println("Invalid Input");
			}
		}
	}
}