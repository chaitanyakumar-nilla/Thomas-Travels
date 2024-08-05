# Thomas-Travels

Thomas Travels wants to collect and automate their customer travel service process. This project involves creating a system to manage drivers and their travel details.

## Project Structure

- **Driver Class**: Represents a driver with attributes such as driver ID, name, category, and total distance traveled.
- **Travel Class**: Contains methods to perform various operations on Driver objects.
- **TestDriver Class**: A tester class to test the functionality of the Driver and Travel classes.

## Classes and Methods

### Driver Class

This class has the following attributes:
1. `id` (int): The ID of the driver.
2. `name` (String): The name of the driver.
3. `category` (String): The category of the driver (Auto/Car/Lorry).
4. `totalDistance` (int): The total distance the driver has traveled.

### Travel Class

Contains the following methods:

- **isCarDriver(Driver driver)**: 
  - Checks if the given Driver object belongs to the category "Car".
  - Returns `true` if the driver is of category "Car", else returns `false`.

- **retrieveByDriverId(ArrayList<Driver> drivers, int driverID)**:
  - Searches for the given driver ID in the ArrayList and returns a String in the format: 
    ```
    Driver name is <driverName> belonging to the category <category> traveled <totalDistance> KM so far.
    ```

- **retrieveCountOfDriver(ArrayList<Driver> drivers, String category)**:
  - Takes a category and an ArrayList of drivers as input and returns the count of drivers in that category.

- **retrieveDriver(ArrayList<Driver> drivers, String category)**:
  - Takes a category and an ArrayList of drivers as input and returns a list of drivers belonging to that category.

- **retrieveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers)**:
  - Returns the driver who has traveled the maximum distance.

### TestDriver Class

A tester class with a `main` method to test the functionality of the above methods using Driver objects.
