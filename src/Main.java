import java.util.Scanner;

public class Main  {
    private static int water = 0;
    private static int milk = 0;
    private static int beans = 0;
    private static int money = 0;

    private static final int ESPRESSO_PRICE = 4;
    private static final int LATTE_PRICE = 7;
    private static final int CAPPUCCINO_PRICE = 6;

    private static final int ESPRESSO_WATER = 250;
    private static final int ESPRESSO_MILK = 0;
    private static final int ESPRESSO_BEANS = 16;

    private static final int LATTE_WATER = 350;
    private static final int LATTE_MILK = 75;
    private static final int LATTE_BEANS = 20;

    private static final int CAPPUCCINO_WATER = 200;
    private static final int CAPPUCCINO_MILK = 100;
    private static final int CAPPUCCINO_BEANS = 12;

    private static int espressoCount = 0;
    private static int latteCount = 0;
    private static int cappuccinoCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect an option:\n" +
                    "1. Buy\n" +
                    "2. Fill\n" +
                    "3. Take\n" +
                    "4. Show\n" +
                    "5. Analytics\n" +
                    "6. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    buyCoffee(scanner);
                    break;
                case 2:
                    fillIngredients(scanner);
                    break;
                case 3:
                    takeMoney();
                    break;
                case 4:
                    showIngredients();
                    break;
                case 5:
                    showAnalytics();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    private static void buyCoffee(Scanner scanner) {
        System.out.println("\nSelect a coffee type:\n" +
                "1. Espresso\n" +
                "2. Latte\n" +
                "3. Cappuccino\n");

        int coffeeType = scanner.nextInt();

        switch (coffeeType) {
            case 1:
                makeCoffee(ESPRESSO_PRICE, ESPRESSO_WATER, ESPRESSO_MILK, ESPRESSO_BEANS);
                espressoCount++;
                break;
            case 2:
                makeCoffee(LATTE_PRICE, LATTE_WATER, LATTE_MILK, LATTE_BEANS);
                latteCount++;
                break;
            case 3:
                makeCoffee(CAPPUCCINO_PRICE, CAPPUCCINO_WATER, CAPPUCCINO_MILK, CAPPUCCINO_BEANS);
                cappuccinoCount++;
                break;
            default:
                System.out.println("Invalid option!");
        }
    }

    private static void makeCoffee(int price, int waterNeeded, int milkNeeded, int beansNeeded) {
        if (water < waterNeeded) {
            System.out.println("Sorry, not enough water!");
            return;
        }
        if (milk < milkNeeded) {
            System.out.println("Sorry, not enough milk!");
            return;
        }
        if (beans < beansNeeded) {
            System.out.println("Sorry, not enough coffee beans!");
            return;
        }

        System.out.println("Dispensing coffee...");
        water -= waterNeeded;
        milk -= milkNeeded;
        beans -= beansNeeded;
        money += price;

        System.out.println("Coffee dispensed. Thank you for your purchase!");
    }

    private static void fillIngredients(Scanner scanner) {
        System.out.println("\nSpecify amount of water to fill:");
        water += scanner.nextInt();

        System.out.println("Specify amount of milk to fill:");
        milk += scanner.nextInt();

        System.out.println("Specify amount of beans to fill:");
        beans += scanner.nextInt();

        System.out.println("Ingredients added successfully!");
    }

    private static void takeMoney() {
        System.out.println("Money collected: $" + money);
        money = 0;
    }

    private static void showIngredients() {
        System.out.println("Water: " + water + " ml");
        System.out.println("Milk: " + milk + " ml");
        System.out.println("Coffee beans: " + beans + " g");
        System.out.println("Money collected: $" + money);
    }

    private static void showAnalytics() {
        int totalCoffees = espressoCount + latteCount + cappuccinoCount;
        int totalMoney = ESPRESSO_PRICE * espressoCount + LATTE_PRICE * latteCount + CAPPUCCINO_PRICE * cappuccinoCount;

        System.out.println("Total coffees sold: " + totalCoffees);
        System.out.println("Total money earned: $" + totalMoney);
        System.out.println("Total water consumed: " + (ESPRESSO_WATER * espressoCount + LATTE_WATER * latteCount + CAPPUCCINO_WATER * cappuccinoCount) + " ml");
        System.out.println("Total milk consumed: " + (ESPRESSO_MILK * espressoCount + LATTE_MILK * latteCount + CAPPUCCINO_MILK * cappuccinoCount) + " ml");
        System.out.println("Total coffee beans consumed: " + (ESPRESSO_BEANS * espressoCount + LATTE_BEANS * latteCount + CAPPUCCINO_BEANS * cappuccinoCount) + " g");
    }
}
