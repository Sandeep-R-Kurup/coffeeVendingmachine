
# Coffee Machine Simulator

This is a Java-based REPL (Read, Eval, Print, Loop) console app that simulates a coffee machine. The coffee machine has the following features:

 * It contains infinite amounts of water, milk, and coffee beans.
 * It has a money box to store all the money it collects through selling coffee.
 * It offers three types of coffee: Espresso, Latte, and Cappuccino, each with its own price and amounts of ingredients required.
 * It allows the user to buy a coffee, dispensed only if the machine contains enough ingredients to make that coffee, otherwise it will show an error message.
 * After coffee is dispensed, the money in the money box will be updated as well as the remaining ingredients.
 * It allows the user to add more ingredients to the machine, take the money from the money box, and show the remaining ingredients.
 * It offers an analytics option to display the count of all the coffees it sold, the amount it earned, and the ingredients it consumed.
## How to Run
  *  Make sure you have Java installed on your computer.
  *  Download the CoffeeMachine.java file from this repository.
  *  Open a terminal or command prompt and navigate to the directory where the CoffeeMachine.java file is located.
  *  Run the following command to compile the code: javac CoffeeMachine.java
  *  Run the following command to start the application: java CoffeeMachine
  *  Follow the on-screen instructions to interact with the coffee machine.
## User Guide
   * To buy a coffee, enter "buy" and then enter the type of coffee you want (Espresso, Latte, or Cappuccino).
   * To fill the machine with ingredients, enter "fill" and then enter the amounts of water, milk, and coffee beans you want to add.
   * To take the money from the money box, enter "take".
   * To show the remaining ingredients in the machine, enter "show".
   * To view the analytics of the coffee machine, enter "analytics".
   * To exit the simulation, enter "exit".
