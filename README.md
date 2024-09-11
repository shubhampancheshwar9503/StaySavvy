## Hotel Application

### Overview

This Java-based console application simulates a restaurant ordering and payment system. It allows users to browse and select dishes from various categories, place orders, and make payments using different methods. The application provides a basic interface for users to interact with, and it includes functionality for managing both vegetarian and non-vegetarian dishes, as well as desserts and beverages.

### Features

- **Menu Categories**: 
  - Vegetarian Dishes
  - Non-Vegetarian Dishes
  - Desserts
  - Beverages

- **Order Management**: 
  - Select items from the menu.
  - Specify quantity for each dish.
  - Calculate total bill based on selected items.

- **Payment Methods**:
  - Cash
  - Card (with basic validation for card number, expiry date, and CVV)
  - Digital Wallet

### How It Works

1. **Menu Selection**: Users choose a category from the menu and then select specific dishes.
2. **Quantity Input**: For each selected dish, users enter the quantity.
3. **Total Calculation**: The application calculates the total amount based on the selected items and their quantities.
4. **Payment Processing**: Users can choose their preferred payment method. The application handles cash payments directly, performs basic validation for card payments, and processes digital wallet payments.

### Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/HotelApplication.git
   ```
2. Navigate to the project directory:
   ```bash
   cd HotelApplication
   ```
3. Compile and run the application:
   ```bash
   javac HotelApplication.java
   java HotelApplication
   ```

### Code Structure

- **HotelApplication.java**: Main class containing the logic for displaying the menu, taking orders, and processing payments.

### Contributions

Contributions are welcome! If you have suggestions or improvements, please open an issue or submit a pull request.
