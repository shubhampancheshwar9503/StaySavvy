// 380(383)+ Lines Of Code
import java.util.Scanner;

class HotelApplication 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double totalBill = 0;
        char continueOrder = 'Y'; // Initialize with a default value

        System.out.println();
        System.out.println("***** Shubham's Mansion *****");
        System.out.println();
        System.out.println("********** WELCOME **********");

        while (continueOrder == 'Y' || continueOrder == 'y') 
        {
            System.out.println();
            System.out.println("Please Select A Category : ");
            System.out.println();
            System.out.println("1. Vegetarian");
            System.out.println("2. Non Vegetarian");
            System.out.println("3. Desserts");
            System.out.println("4. Beverages");
            System.out.println();
            System.out.println("Enter Your Choice : ");
            int menu = sc.nextInt();

            switch (menu) 
            {
                case 1 : 
                { // Vegetarian Menu
                    System.out.println("\n********** VEG DISHES **********");
                    System.out.println();
                    System.out.println("Dishes                      Prices");
                    System.out.println();
                    System.out.println("1. Makhni Paneer Biryani    300.00");
                    System.out.println("2. Dum Paneer Kali Mirch    250.00");
                    System.out.println("3. Satrangi Biryani         200.00");
                    System.out.println("4. Dal Makhani              150.00");
                    System.out.println("5. Veg Soya Keema           100.00");
                    System.out.println();
                    System.out.println("Please Choose Dish : ");
                    int vegDish = sc.nextInt();

                    int vegPrice = 0;
                    String vegDishName = "";

                    switch (vegDish) 
                    {
                        case 1 : 
                        {
                            vegDishName = "Makhni Paneer Biryani";
                            vegPrice = 300;
                        }break;
                        
                        case 2 : 
                        {
                            vegDishName = "Dum Paneer Kali Mirch";
                            vegPrice = 250;
                        }break;
                        
                        case 3 : 
                        {
                            vegDishName = "Satrangi Biryani";
                            vegPrice = 200;
                        }break;
                        
                        case 4 : 
                        {
                            vegDishName = "Dal Makhani";
                            vegPrice = 150;
                        }break;
                        
                        case 5 : 
                        {
                            vegDishName = "Veg Soya Keema";
                            vegPrice = 100;
                        }break;
                        
                        default : 
                        {
                            System.out.println("Invalid Input");
                            continue;
                        }
                    }
                    
                    System.out.println();
                    System.out.println("You Have Selected " + vegDishName);
                    System.out.println();
                    System.out.println("Enter The Quantity Of Dish : ");
                    int vegQuantity = sc.nextInt();
                    double vegTotalAmount = vegQuantity * vegPrice;
                    totalBill += vegTotalAmount;
                    System.out.println();
                    System.out.println("The Amount To Be Paid : RS." + vegTotalAmount);
                }break;

                case 2: 
                { // Non-Vegetarian Menu
                    System.out.println("\n********** NON VEG DISHES **********");
                    System.out.println();
                    System.out.println("Dishes                      Prices");
                    System.out.println();
                    System.out.println("1. Nihari                   350.00");
                    System.out.println("2. Marag                    300.00");
                    System.out.println("3. Karahi                   250.00");
                    System.out.println("4. Vindaloo                 200.00");
                    System.out.println("5. Rogan Josh               150.00");
                    System.out.println();
                    System.out.println("Please Choose Dish : ");
                    int nonVegDish = sc.nextInt();

                    int nonVegPrice = 0;
                    String nonVegDishName = "";

                    switch (nonVegDish) 
                    {
                        case 1 : 
                        {
                            nonVegDishName = "Nihari";
                            nonVegPrice = 350;
                        }break;
                        
                        case 2 : 
                        {
                            nonVegDishName = "Marag";
                            nonVegPrice = 300;
                        }break;
                        
                        case 3 : 
                        {
                            nonVegDishName = "Karahi";
                            nonVegPrice = 250;
                        }break;
                        
                        case 4 : 
                        {
                            nonVegDishName = "Vindaloo";
                            nonVegPrice = 200;
                        }break;
                        
                        case 5 : 
                        {
                            nonVegDishName = "Rogan Josh";
                            nonVegPrice = 150;
                        }break;
                        
                        default : 
                        {
                            System.out.println("Invalid Input");
                            continue;
                        }
                    }
                    
                    System.out.println();
                    System.out.println("You Have Selected " + nonVegDishName);
                    System.out.println();
                    System.out.println("Enter The Quantity Of Dish : ");
                    int nonVegQuantity = sc.nextInt();
                    double nonVegTotalAmount = nonVegQuantity * nonVegPrice;
                    totalBill += nonVegTotalAmount;
                    System.out.println();
                    System.out.println("The Amount To Be Paid : RS." + nonVegTotalAmount);
                }break;

                case 3 : 
                { // Desserts Menu
                    System.out.println("\n********** DESSERTS **********");
                    System.out.println();
                    System.out.println("Dishes                      Prices");
                    System.out.println();
                    System.out.println("1. Gulab Jamun              50.00");
                    System.out.println("2. Rasmalai                 60.00");
                    System.out.println("3. Ice Cream                80.00");
                    System.out.println("4. Chocolate Cake           90.00");
                    System.out.println("5. Fruit Salad              70.00");
                    System.out.println();
                    System.out.println("Please Choose Dish : ");
                    int dessertDish = sc.nextInt();

                    int dessertPrice = 0;
                    String dessertDishName = "";

                    switch (dessertDish) 
                    {
                        case 1 : 
                        {
                            dessertDishName = "Gulab Jamun";
                            dessertPrice = 50;
                        }break;
                        
                        case 2 : 
                        {
                            dessertDishName = "Rasmalai";
                            dessertPrice = 60;
                        }break;
                        
                        case 3 : 
                        {
                            dessertDishName = "Ice Cream";
                            dessertPrice = 80;
                        }break;
                        
                        case 4 : 
                        {
                            dessertDishName = "Chocolate Cake";
                            dessertPrice = 90;
                        }break;
                        
                        case 5 : 
                        {
                            dessertDishName = "Fruit Salad";
                            dessertPrice = 70;
                        }break;
                        
                        default : 
                        {
                            System.out.println("Invalid Input");
                            continue;
                        }
                    }
                    
                    System.out.println();
                    System.out.println("You Have Selected " + dessertDishName);
                    System.out.println();
                    System.out.println("Enter The Quantity Of Dish : ");
                    int dessertQuantity = sc.nextInt();
                    double dessertTotalAmount = dessertQuantity * dessertPrice;
                    totalBill += dessertTotalAmount;
                    System.out.println();
                    System.out.println("The Amount To Be Paid : RS." + dessertTotalAmount);
                }break;

                case 4 : 
                { // Beverages Menu
                    System.out.println("\n********** BEVERAGES **********");
                    System.out.println();
                    System.out.println("Dishes                      Prices");
                    System.out.println();
                    System.out.println("1. Tea                      20.00");
                    System.out.println("2. Coffee                   30.00");
                    System.out.println("3. Juice                    50.00");
                    System.out.println("4. Soda                     40.00");
                    System.out.println("5. Water                    10.00");
                    System.out.println();
                    System.out.println("Please Choose Dish : ");
                    int beverageDish = sc.nextInt();

                    int beveragePrice = 0;
                    String beverageDishName = "";

                    switch (beverageDish) 
                    {
                        case 1 : 
                        {
                            beverageDishName = "Tea";
                            beveragePrice = 20;
                        }break;
                        
                        case 2 : 
                        {
                            beverageDishName = "Coffee";
                            beveragePrice = 30;
                        }break;
                        
                        case 3 : 
                        {
                            beverageDishName = "Juice";
                            beveragePrice = 50;
                        }break;
                        
                        case 4 : 
                        {
                            beverageDishName = "Soda";
                            beveragePrice = 40;
                        }break;
                        
                        case 5 : 
                        {
                            beverageDishName = "Water";
                            beveragePrice = 10;
                        }break;
                        
                        default : 
                        {
                            System.out.println("Invalid Input");
                            continue;
                        }
                    }
                    
                    System.out.println();
                    System.out.println("You Have Selected " + beverageDishName);
                    System.out.println();
                    System.out.println("Enter The Quantity Of Dish : ");
                    int beverageQuantity = sc.nextInt();
                    double beverageTotalAmount = beverageQuantity * beveragePrice;
                    totalBill += beverageTotalAmount;
                    System.out.println();
                    System.out.println("The Amount To Be Paid : RS." + beverageTotalAmount);
                }break;

                default : 
                {
                    System.out.println("Invalid Input");
                }break;
            }

            System.out.print("\nWould You Like to Order More Items? (Y/N) : ");
            continueOrder = sc.next().charAt(0);
        }

        System.out.printf("\nYour Total Bill is : RS. %.2f", totalBill);
        System.out.println();
        
        // Payment Method
        System.out.println("Please Select Payment Method :");
		System.out.println();
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.println("3. Digital Wallet");
		System.out.println();
        System.out.println("Enter Your Choice : ");
        int paymentMethod = sc.nextInt();
        
        switch (paymentMethod) 
        {
            case 1 :
			{
				System.out.println();
                System.out.println("You have chosen to pay with Cash.");
				System.out.println();
                System.out.println("Amount to be paid: RS. " + totalBill);
			}break;

            case 2 :
			{
				System.out.println();
                System.out.println("You have chosen to pay with Card.");
				System.out.println();
                System.out.println("Enter Card Number (only digits) : ");
                String cardNumber = sc.next();
				System.out.println();
                System.out.println("Enter Card Expiry Date (MM/YY) : ");
                String expiryDate = sc.next();
				System.out.println();
                System.out.println("Enter CVV : ");
                String cvv = sc.next();
                // Basic validation (you can expand this as needed)
                if (cardNumber.matches("\\d{16}") && expiryDate.matches("\\d{2}/\\d{2}") && cvv.matches("\\d{3}")) 
				{
					System.out.println();
                    System.out.println("Card Payment Successful. Amount to be paid : RS. " + totalBill);
                } 
				else 
				{
					System.out.println();
                    System.out.println("Invalid Card Details.");
                }
			}break;

            case 3 :
			{
				System.out.println();
                System.out.println("You have chosen to pay with Digital Wallet.");
				System.out.println();
                System.out.print("Enter Wallet ID : ");
                String walletId = sc.next();
				System.out.println();
                System.out.println("Digital Wallet Payment Successful. Amount to be paid: RS. " + totalBill);
			}break;

            default :
			{
				System.out.println();
                System.out.println("Invalid Payment Method");
			}break;
        }
		System.out.println();
        System.out.println("Thank You For Visiting Shubham's Mansion!");
    }
}
