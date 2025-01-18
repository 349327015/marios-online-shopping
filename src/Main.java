import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wel-a-come to Mario's online shopping!");
        String purchases = "";
        String user = "";
        ArrayList<String> cartList = new ArrayList<>();
        // Loop until the user types "exit"
        while (true) {
            // Loop until the user enters a valid role or 'exit'
            while (!(user.equals("admin") || user.equals("shopper") || user.equals("shopping"))) {
                System.out.println("Are you an admin or a shopper? Type 'exit' to quit.");
                user = sc.nextLine().toLowerCase();

                // Exit if the user types 'exit'
                if (user.equals("exit")) {
                    System.out.println("Exiting the shopping system...");
                    return;
                }

                if (user.equals("admin")) {
                    System.out.println("You are an admin but i dont understand what i am supposed to code here so the code will end");
                } else if (user.equals("shopper") || user.equals("shopping")) {
                    System.out.println("You are a shopper.");
                    // Predefined categories
                    String[] categories = {"Items", "Wears", "Weapons"};

                    // Loop for browsing categories
                        while (true) {

                        System.out.println("Here are the categories you can browse:");
                        for (String category : categories) {
                            System.out.println("- " + category);
                        }
                        System.out.println("Type out one of the categories to select or type 'exit' to exit");

                        String category = sc.nextLine().toLowerCase();

                        // Exit if the user types 'exit'
                        if (category.equals("exit")) {
                            System.out.println("Exiting the shopping system...");
                            return; // Exit the program
                        }

                        // Process items within the "Items" category
                        if (category.equals("items")) {
                            System.out.println("You are in the items category.");
                            System.out.println("Type out one of the items to purchase.");
                            String[] items = {"Mushroom", "Super Mushroom", "1-UP Mushroom", "Syrup Jar", "Super Syrup Jar", "Nut"};
                            for (String item : items) {
                                System.out.println("- " + item);
                            }
                            purchases = sc.nextLine().toLowerCase();

                            // Handle purchase for each item
                            if (purchases.equals("mushroom")) {
                                boolean statement = true;
                                while (statement) {
                                    System.out.println("Do you want to purchase \"Mushroom\"? Y/N");
                                    purchases = sc.nextLine();
                                    if (purchases.equals("Y") || purchases.equals("y")) {
                                        System.out.println("Item added to cart.");
                                        cartList.add("Mushroom");
                                        statement = false;
                                    } else if (purchases.equals("N") || purchases.equals("n")) {
                                        System.out.println("Canceled purchase.");
                                        statement = false;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                                }
                            } else if (purchases.equals("super mushroom")) {
                                boolean statement = true;
                                while (statement) {
                                    System.out.println("Do you want to purchase \"Super Mushroom\"? Y/N");
                                    purchases = sc.nextLine();
                                    if (purchases.equals("Y") || purchases.equals("y")) {
                                        System.out.println("Item added to cart.");
                                        cartList.add("Super Mushroom");
                                        statement = false;
                                    } else if (purchases.equals("N") || purchases.equals("n")) {
                                        System.out.println("Canceled purchase.");
                                        statement = false;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                                }
                            } else if (purchases.equals("1 up mushroom")) {
                                boolean statement = true;
                                while (statement) {
                                    System.out.println("Do you want to purchase \"1-UP Mushroom\"? Y/N");
                                    purchases = sc.nextLine();
                                    if (purchases.equals("Y") || purchases.equals("y")) {
                                        System.out.println("Item added to cart.");
                                        cartList.add("1-UP Mushroom");
                                        statement = false;
                                    } else if (purchases.equals("N") || purchases.equals("n")) {
                                        System.out.println("Canceled purchase.");
                                        statement = false;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                                }
                            } else if (purchases.equals("syrup jar")) {
                                boolean statement = true;
                                while (statement) {
                                    System.out.println("Do you want to purchase \"Syrup Jar\"? Y/N");
                                    purchases = sc.nextLine();
                                    if (purchases.equals("Y") || purchases.equals("y")) {
                                        System.out.println("Item added to cart.");
                                        cartList.add("Syrup Jar");
                                        statement = false;
                                    } else if (purchases.equals("N") || purchases.equals("n")) {
                                        System.out.println("Canceled purchase.");
                                        statement = false;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                                }
                            } else if (purchases.equals("super syrup jar")) {
                                boolean statement = true;
                                while (statement) {
                                    System.out.println("Do you want to purchase \"Super Syrup Jar\"? Y/N");
                                    purchases = sc.nextLine();
                                    if (purchases.equals("Y") || purchases.equals("y")) {
                                        System.out.println("Item added to cart.");
                                        cartList.add("Super Syrup Jar");
                                        statement = false;
                                    } else if (purchases.equals("N") || purchases.equals("n")) {
                                        System.out.println("Canceled purchase.");
                                        statement = false;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                                }
                            } else if (purchases.equals("nut")) {
                                boolean statement = true;
                                while (statement) {
                                    System.out.println("Do you want to purchase \"Nut\"? Y/N");
                                    purchases = sc.nextLine();
                                    if (purchases.equals("Y") || purchases.equals("y")) {
                                        System.out.println("Item added to cart.");
                                        cartList.add("Nut");
                                        statement = false;
                                    } else if (purchases.equals("N") || purchases.equals("n")) {
                                        System.out.println("Canceled purchase.");
                                        statement = false;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                                }
                            } else if (purchases.equals("exit")) {
                                System.out.println("Exiting the shopping system...");
                                return; // Exit the program if 'exit' is typed
                            }
                        } // Process items within the "Wears" category
                        else if (category.equals("wears")) {
                            System.out.println("You are in the wears category.");
                            System.out.println("Type out one of the items to purchase.");
                            String[] wear = {"Thin Wear", "Dirt Cheap Wear", "So So Wear", "Super Wear", "Elite Wear", "Legendary Wear"};
                            for (String wears : wear) {
                                System.out.println("- " + wears);
                            }
                            purchases = sc.nextLine().toLowerCase();


                            // Handle purchase for each item
                            if (purchases.equals("thin wear")) {
                                boolean statement = true;
                                while (statement) {
                                    System.out.println("Do you want to purchase \"Thin Wear\"? Y/N");
                                    purchases = sc.nextLine();
                                    if (purchases.equals("Y") || purchases.equals("y")) {
                                        System.out.println("Item added to cart.");
                                        cartList.add("Thin Wear");
                                        statement = false;
                                    } else if (purchases.equals("N") || purchases.equals("n")) {
                                        System.out.println("Canceled purchase.");
                                        statement = false;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                                }
                            } else if (purchases.equals("dirt cheap wear")) {
                                boolean statement = true;
                                while (statement) {
                                    System.out.println("Do you want to purchase \"Dirt Cheap Wear\"? Y/N");
                                    purchases = sc.nextLine();
                                    if (purchases.equals("Y") || purchases.equals("y")) {
                                        System.out.println("Item added to cart.");
                                        cartList.add("Dirt Cheap Wear");
                                        statement = false;
                                    } else if (purchases.equals("N") || purchases.equals("n")) {
                                        System.out.println("Canceled purchase.");
                                        statement = false;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                                }
                            } else if (purchases.equals("so so wear")) {
                                boolean statement = true;
                                while (statement) {
                                    System.out.println("Do you want to purchase \"So So Wear\"? Y/N");
                                    purchases = sc.nextLine();
                                    if (purchases.equals("Y") || purchases.equals("y")) {
                                        System.out.println("Item added to cart.");
                                        cartList.add("So So Wear");
                                        statement = false;
                                    } else if (purchases.equals("N") || purchases.equals("n")) {
                                        System.out.println("Canceled purchase.");
                                        statement = false;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                                }
                            } else if (purchases.equals("super wear")) {
                                boolean statement = true;
                                while (statement) {
                                    System.out.println("Do you want to purchase \"Super Wear\"? Y/N");
                                    purchases = sc.nextLine();
                                    if (purchases.equals("Y") || purchases.equals("y")) {
                                        System.out.println("Item added to cart.");
                                        cartList.add("Super Wear");
                                        statement = false;
                                    } else if (purchases.equals("N") || purchases.equals("n")) {
                                        System.out.println("Canceled purchase.");
                                        statement = false;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                                }
                            } else if (purchases.equals("elite wear")) {
                                boolean statement = true;
                                while (statement) {
                                    System.out.println("Do you want to purchase \"Elite Wear\"? Y/N");
                                    purchases = sc.nextLine();
                                    if (purchases.equals("Y") || purchases.equals("y")) {
                                        System.out.println("Item added to cart.");
                                        cartList.add("Elite Wear");
                                        statement = false;
                                    } else if (purchases.equals("N") || purchases.equals("n")) {
                                        System.out.println("Canceled purchase.");
                                        statement = false;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                                }
                            } else if (purchases.equals("legendary wear")) {
                                boolean statement = true;
                                while (statement) {
                                    System.out.println("Do you want to purchase \"Legendary Wear\"? Y/N");
                                    purchases = sc.nextLine();
                                    if (purchases.equals("Y") || purchases.equals("y")) {
                                        System.out.println("Item added to cart.");
                                        cartList.add("Legendary Wear");
                                        statement = false;
                                    } else if (purchases.equals("N") || purchases.equals("n")) {
                                        System.out.println("Canceled purchase.");
                                        statement = false;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                                }
                            } else if (purchases.equals("exit")) {
                                System.out.println("Exiting the shopping system...");
                                return; // Exit the program if 'exit' is typed
                            }
                        } // Process items within the "Weapons" category
                        else if (category.equals("weapons")) {
                            System.out.println("You are in the weapons category.");
                            System.out.println("Type out one of the items to purchase.");
                            String[] weapon = {"Rundown Hammer", "Discount Hammer", "So So Hammer", "Super Hammer", "Elite Hammer", "Legendary Hammer"};
                            for (String weapons : weapon) {
                                System.out.println("- " + weapons);
                            }
                            purchases = sc.nextLine().toLowerCase();


                            // Handle purchase for each item
                            if (purchases.equals("rundown hammer")) {
                                boolean statement = true;
                                while (statement) {
                                    System.out.println("Do you want to purchase \"Rundown Hammer\"? Y/N");
                                    purchases = sc.nextLine();
                                    if (purchases.equals("Y") || purchases.equals("y")) {
                                        System.out.println("Item added to cart.");
                                        cartList.add("Rundown Hammer");
                                        statement = false;
                                    } else if (purchases.equals("N") || purchases.equals("n")) {
                                        System.out.println("Canceled purchase.");
                                        statement = false;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                                }
                            } else if (purchases.equals("discount hammer")) {
                                boolean statement = true;
                                while (statement) {
                                    System.out.println("Do you want to purchase \"Discount Hammer\"? Y/N");
                                    purchases = sc.nextLine();
                                    if (purchases.equals("Y") || purchases.equals("y")) {
                                        System.out.println("Item added to cart.");
                                        cartList.add("Discount Hammer");
                                        statement = false;
                                    } else if (purchases.equals("N") || purchases.equals("n")) {
                                        System.out.println("Canceled purchase.");
                                        statement = false;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                                }
                            } else if (purchases.equals("so so hammer")) {
                                boolean statement = true;
                                while (statement) {
                                    System.out.println("Do you want to purchase \"So So Hammer\"? Y/N");
                                    purchases = sc.nextLine();
                                    if (purchases.equals("Y") || purchases.equals("y")) {
                                        System.out.println("Item added to cart.");
                                        cartList.add("So So Hammer");
                                        statement = false;
                                    } else if (purchases.equals("N") || purchases.equals("n")) {
                                        System.out.println("Canceled purchase.");
                                        statement = false;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                                }
                            } else if (purchases.equals("super hammer")) {
                                boolean statement = true;
                                while (statement) {
                                    System.out.println("Do you want to purchase \"Super Hammer\"? Y/N");
                                    purchases = sc.nextLine();
                                    if (purchases.equals("Y") || purchases.equals("y")) {
                                        System.out.println("Item added to cart.");
                                        cartList.add("Super Hammer");
                                        statement = false;
                                    } else if (purchases.equals("N") || purchases.equals("n")) {
                                        System.out.println("Canceled purchase.");
                                        statement = false;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                                }
                            } else if (purchases.equals("elite hammer")) {
                                boolean statement = true;
                                while (statement) {
                                    System.out.println("Do you want to purchase \"Elite Hammer\"? Y/N");
                                    purchases = sc.nextLine();
                                    if (purchases.equals("Y") || purchases.equals("y")) {
                                        System.out.println("Item added to cart.");
                                        cartList.add("Elite Hammer");
                                        statement = false;
                                    } else if (purchases.equals("N") || purchases.equals("n")) {
                                        System.out.println("Canceled purchase.");
                                        statement = false;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                                }
                            } else if (purchases.equals("legendary hammer")) {
                                boolean statement = true;
                                while (statement) {
                                    System.out.println("Do you want to purchase \"Legendary Hammer\"? Y/N");
                                    purchases = sc.nextLine();
                                    if (purchases.equals("Y") || purchases.equals("y")) {
                                        System.out.println("Item added to cart.");
                                        cartList.add("Legendary Hammer");
                                        statement = false;
                                    } else if (purchases.equals("N") || purchases.equals("n")) {
                                        System.out.println("Canceled purchase.");
                                        statement = false;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                                }
                            } else if (purchases.equals("exit")) {
                                System.out.println("Exiting the shopping system...");
                                return; // Exit the program if 'exit' is typed
                            }
                        }

                        // If the category doesn't match, prompt for valid input
                        else {
                            System.out.println("This is not a valid category. Please select a valid category or type 'exit'.");
                        }
                        boolean statement = true;
                        while (statement){
                        // Ask if the user wants to continue shopping or exit
                        System.out.println("Type 'exit' to exit, 'remove' to remove item or press any key to continue shopping.");
                        System.out.println("Your cart: " + cartList);
                        String continueShopping = sc.nextLine().toLowerCase();

                        if (continueShopping.equals("exit")) {
                            int goldCoins = 0;
                            for (String totalItems : cartList){
                                if (totalItems.equals("Mushroom")){
                                    goldCoins += 10;
                                } else if (totalItems.equals("Super Mushroom")){
                                    goldCoins += 15;
                                } else if (totalItems.equals("Syrup Jar")){
                                    goldCoins += 10;
                                } else if (totalItems.equals("Super Syrup Jar")){
                                    goldCoins += 20;
                                } else if (totalItems.equals("Nut")){
                                    goldCoins += 15;
                                } else if (totalItems.equals("1UP Mushroom")){
                                    goldCoins += 20;
                                } else if (totalItems.equals("Thin Wear")){
                                    goldCoins += 30;
                                } else if (totalItems.equals("Dirt Cheap Wear")){
                                    goldCoins += 35;
                                } else if (totalItems.equals("So So Wear")){
                                    goldCoins += 50;
                                } else if (totalItems.equals("Super Wear")){
                                    goldCoins += 75;
                                } else if (totalItems.equals("Elite Wear")){
                                    goldCoins += 80;
                                } else if (totalItems.equals("Legendary Wear")){
                                    goldCoins += 100;
                                } else if (totalItems.equals("Rundown Hammer")){
                                    goldCoins += 30;
                                } else if (totalItems.equals("Discount Hammer")){
                                    goldCoins += 35;
                                } else if (totalItems.equals("So So Hammer")){
                                    goldCoins += 50;
                                } else if (totalItems.equals("Super Hammer")){
                                    goldCoins += 75;
                                } else if (totalItems.equals("Elite Hammer")){
                                    goldCoins += 80;
                                } else if (totalItems.equals("Legendary Hammer")){
                                    goldCoins += 100;
                                } else {
                                    System.out.println("error");
                                }
                            }
                            System.out.println("your total purchase is " + goldCoins + " gold coins. Is this what you wanted? Y/N");

                            boolean exiting = false;
                            while (exiting == false){
                                String answer = sc.nextLine().toLowerCase();
                                    if (answer.equals("y")) {
                                        System.out.println("Thanks you for shopping.");
                                        return;
                                    } else if (answer.equals("n")) {
                                        System.out.println("Returning to selection");
                                        exiting = true;
                                    } else {
                                        System.out.println("Invalid answer.");
                                    }
                            }

                            } else if (continueShopping.equals("remove")) {
                            System.out.println("What would you like to remove? (Please type items with capital first for all words. ex: Legendary Wear, Super Mushroom, etc.)");
                            String removing = sc.nextLine();
                            cartList.remove(removing);
                            System.out.println("Item removed.");
                            } else {
                            statement = true;
                        }
                        }
                    }
                } else {
                    System.out.println("Invalid role. Please type 'admin' or 'shopper'. Type 'exit' to quit.");
                }
            }
        }
    }
}
