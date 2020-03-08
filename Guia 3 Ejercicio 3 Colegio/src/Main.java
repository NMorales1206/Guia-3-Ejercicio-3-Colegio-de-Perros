import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Dog> dogList = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {

        String search;
        boolean exit = false;
        System.out.println("\n#################################");
        System.out.println("Welcome to the EAN Guide 3 Act. 3");
        System.out.println("#################################");
        System.out.println("------------Dog's list-----------\n");
        do {
            if(dogList.size() == 0) {
                System.out.println("The list is empty.");
                System.out.println("Please add a dog to the list.\n");
                dogList.add(init());
                System.out.println();
            } else {
                switch (menu()) {
                    case 1:
                        dogList.add(init());
                        System.out.println("\nNOTICE: The dog has been added to the list.\n");
                        break;
                    case 2:
                        dogFinder();
                        break;
                    case 3:
                        System.out.println("Enter the race you want to look for:");
                        search = input.nextLine().toLowerCase();
                        int count = 0;
                        for (Dog dog : dogList) {
                            if (dog.getDogRace().equals(search)) {
                                count++;
                            }
                        }
                        System.out.println("\nFor the race " + search + " there are " + count + " dogs.\n");
                        break;
                    case 4:
                        System.out.println("Enter the location in which you want to look for: ");
                        search = input.nextLine().toLowerCase();
                        for (Dog dog : dogList) {
                            if (dog.getDogLocation().equals(search)) {
                                System.out.println("Dog's name: " + dog.getDogName());
                            }
                        }
                        break;
                    case 5:
                        dogModify(dogFinder());
                        break;
                    case 0:
                        exit = true;
                        break;
                    default:
                        System.out.println("You shouldn't see this message");
                        break;
                }
            }
        }while(!exit);
        System.out.println("Exiting app.");
        Thread.sleep(2500);
    }

    public static Dog init() {
        Dog newDog = new Dog();
        System.out.println("Dog's name?");
        newDog.setDogName(input.nextLine().toLowerCase());
        System.out.println("Dog's race?");
        newDog.setDogRace(input.nextLine().toLowerCase());
        System.out.println("Dog's location?");
        newDog.setDogLocation(input.nextLine().toLowerCase());
        System.out.println("Owner's ID?");
        newDog.setOwnersID(input.nextLine().toLowerCase());
        System.out.println("Owner's Name?");
        newDog.setOwnersName(input.nextLine().toLowerCase());
        System.out.println("Contact Number?");
        newDog.setContactNumber(input.nextLine().toLowerCase());
        System.out.println("Day of Assistance?");
        newDog.setAssistanceDay(input.nextLine().toLowerCase());
        return newDog;
    }

    private static Dog dogFinder () {
        String name;
        Dog currentDog = null;
        System.out.println("Name of the dog.");
        name = input.nextLine();
        for(Dog dog : dogList) {
            if(dog.getDogName().equalsIgnoreCase(name)) {
                currentDog = dog;
                break;
            }
        }
        if (currentDog == null) {
            System.out.println("\nNOTICE: That dog doesn't exist.\n");
            return null;
        } else {
            System.out.println("\nFound: ");
            System.out.println(currentDog);
            System.out.println("=================================\n");
            return currentDog;
        }
    }

    public static void dogModify(Dog dog) {
        boolean exit = false;
        if(dog == null) {
            System.out.println("Returning to the main menu.\n");
        } else {
            do {
                System.out.println("What value do you want to change?\n");
                System.out.println("1. Name");
                System.out.println("2. Race");
                System.out.println("3. Location");
                System.out.println("4. Owner ID");
                System.out.println("5. Owner Name");
                System.out.println("6. Contact Number");
                System.out.println("7. Day of Assistance");
                System.out.println("0. Exit");
                try {
                    switch (input.nextInt()) {
                        case 1:
                            input.nextLine();
                            System.out.println("Current name is: " + dog.getDogName());
                            System.out.print("Enter new name: ");
                            dog.setDogName(input.nextLine());
                            System.out.println("\nNOTICE: Value changed successfully.\n");
                            break;
                        case 2:
                            input.nextLine();
                            System.out.println("Current race is: " + dog.getDogRace());
                            System.out.print("Enter new name: ");
                            dog.setDogRace(input.nextLine());
                            System.out.println("\nNOTICE: Value changed successfully.\n");
                            break;
                        case 3:
                            input.nextLine();
                            System.out.println("Current location is: " + dog.getDogLocation());
                            System.out.print("Enter new name: ");
                            dog.setDogLocation(input.nextLine());
                            System.out.println("\nNOTICE: Value changed successfully.\n");
                            break;
                        case 4:
                            input.nextLine();
                            System.out.println("Current owner ID is: " + dog.getOwnersID());
                            System.out.print("Enter new name: ");
                            dog.setOwnersID(input.nextLine());
                            System.out.println("\nNOTICE: Value changed successfully/\n");
                            break;
                        case 5:
                            input.nextLine();
                            System.out.println("Current owner name is: " + dog.getOwnersName());
                            System.out.print("Enter new name: ");
                            dog.setOwnersName(input.nextLine());
                            System.out.println("\nNOTICE: Value changed successfully.\n");
                            break;
                        case 6:
                            input.nextLine();
                            System.out.println("Current contact number is: " + dog.getContactNumber());
                            System.out.print("Enter new name: ");
                            dog.setContactNumber(input.nextLine());
                            System.out.println("\nNOTICE: Value changed successfully.\n");
                            break;
                        case 7:
                            input.nextLine();
                            System.out.println("Current day of assistance is: " + dog.getAssistanceDay());
                            System.out.print("Enter new name: ");
                            dog.setAssistanceDay(input.nextLine());
                            System.out.println("\nNOTICE: Value changed successfully.\n");
                            break;
                        case 0:
                            exit = true;
                            System.out.println("\nReturning to the main menu");
                            break;
                        default:
                            System.out.println("\nERROR: Please use a valid number.\n");
                            input.nextLine();
                            dogModify(dog);
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("\nERROR: Please use numbers.\n");
                    input.nextLine();
                    dogModify(dog);
                }
                if(!exit) {
                    do {
                        System.out.println("Do you wish to change another field? Yes/No");
                        String choice = input.nextLine();
                        if (choice.equalsIgnoreCase("no")) {
                            exit = true;
                            break;
                        } else if (choice.equalsIgnoreCase("yes")) {
                            break;
                        } else {
                            System.out.println("ERROR: Invalid option. Please use yes or no.\n");
                        }
                    } while (true);
                }
            } while (!exit);
        }
    }

    public static int menu() throws InterruptedException {
        do {
            System.out.println("What do you want to do?\n");
            System.out.println("1. Add a new dog to the list.");
            System.out.println("2. Find a dog by its name.");
            System.out.println("3. Get the amount of dogs that belong to a specific race.");
            System.out.println("4. Get the name of the dogs based on their location.");
            System.out.println("5. Modify a dog's record.");
            System.out.println("0. To exit the app.\n");
            System.out.println("Please enter the number of what you want to execute:");
            if(input.hasNextInt()) {
                switch (input.nextInt()) {
                    case 1:
                        input.nextLine();
                        return 1;
                    case 2:
                        input.nextLine();
                        return 2;
                    case 3:
                        input.nextLine();
                        return 3;
                    case 4:
                        input.nextLine();
                        return 4;
                    case 5:
                        input.nextLine();
                        return 5;
                    case 0:
                        input.nextLine();
                        return 0;
                    default:
                        System.out.println("ERROR: Please enter a number between 0 and 5.\n");
                }
            } else {
                System.out.println("ERROR: Please enter a number between 0 and 5.\n");
                Thread.sleep(1500);
            }
            input.nextLine();
        } while(true);
    }
}