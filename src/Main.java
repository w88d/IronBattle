
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void writeTolog(String msg) {
        LocalDate today = LocalDate.now();
        String formattedDate = today.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        String filename = "logger_" + formattedDate + ".txt";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
            LocalDateTime currentdateTime = LocalDateTime.now();
            String format = currentdateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
            writer.append(format + " :");
            writer.append(msg + "\n");
            writer.close();
        } catch (IOException var7) {
            var7.printStackTrace();
            System.out.println("Exeption writing logs " + var7.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner selectedMenu = new Scanner(System.in);
        Random rand = new Random();
        writeTolog("Started");
        Warrior firstWarrior = null;
        Wizard firstWizard = null;
        Warrior secondWarrior = null;
        Wizard secondWizard = null;
        String name = "";
        int healthPoint = 0;
        int stamina = 0;
        int strength = 0;
        int mana = 0;
        int intelligence = 0;

        // CREATE CHARACTERS RANDOMLY
/*
        String[] charactersType = {"Warrior", "Wizard"};
        String firstCharacter = charactersType[rand.nextInt(charactersType.length)];
        String secondCharacter = charactersType[rand.nextInt(charactersType.length)];
        if(firstCharacter == "Warrior"){
            System.out.println("Enter name: ");
            name = selectedMenu.next();
            // Check if input of name is String
            while (!name.matches("[A-Za-z\\s]+")) {
                System.out.println("Please enter valid name");
                System.out.println("Enter name: ");
                name = selectedMenu.next();
            }
            healthPoint = rand.nextInt(101) + 100;
//            healthPoint = selectedMenu.nextInt();
            System.out.println("Health point: " +healthPoint);
            stamina = rand.nextInt(41) + 10;
//            stamina = selectedMenu.nextInt();
            System.out.println("Stamina: "+ stamina);
            strength = rand.nextInt(10) + 1;
//            strength = selectedMenu.nextInt();
            System.out.println("Strength: " + strength);
            firstWarrior = new Warrior(name, healthPoint, stamina, strength);
        }else{
            System.out.println("Enter name: ");
            name = selectedMenu.next();
            while (!name.matches("[A-Za-z\\s]+")) {
                System.out.println("Please enter valid name");
                System.out.println("Enter name: ");
                name = selectedMenu.next();
            }
            healthPoint = rand.nextInt(51) + 50;
//            healthPoint = selectedMenu.nextInt();
            System.out.println("Health point: "+healthPoint);
            mana = rand.nextInt(41) + 10;
//            mana = selectedMenu.nextInt();
            System.out.println("Mana: "+ mana);
            intelligence = rand.nextInt(50) + 1;
//            intelligence = selectedMenu.nextInt();
            System.out.println("Intelligence: "+ intelligence);
            firstWizard = new Wizard(name, healthPoint, mana, intelligence);
        }

        if(secondCharacter == "Warrior"){
            System.out.println("Enter name: ");
            name = selectedMenu.next();
            // Check if input of name is String
            while (!name.matches("[A-Za-z\\s]+")) {
                System.out.println("Please enter valid name");
                System.out.println("Enter name: ");
                name = selectedMenu.next();
            }
            healthPoint = rand.nextInt(101) + 100;
//            healthPoint = selectedMenu.nextInt();
            System.out.println("Health point: " +healthPoint);
            stamina = rand.nextInt(41) + 10;
//            stamina = selectedMenu.nextInt();
            System.out.println("Stamina: "+ stamina);
            strength = rand.nextInt(10) + 1;
//            strength = selectedMenu.nextInt();
            System.out.println("Strength: " + strength);
            secondWarrior = new Warrior(name, healthPoint, stamina, strength);
        }else{
            System.out.println("Enter name: ");
            name = selectedMenu.next();
            while (!name.matches("[A-Za-z\\s]+")) {
                System.out.println("Please enter valid name");
                System.out.println("Enter name: ");
                name = selectedMenu.next();
            }
            healthPoint = rand.nextInt(51) + 50;
//            healthPoint = selectedMenu.nextInt();
            System.out.println("Health point: "+healthPoint);
            mana = rand.nextInt(41) + 10;
//            mana = selectedMenu.nextInt();
            System.out.println("Mana: "+ mana);
            intelligence = rand.nextInt(50) + 1;
//            intelligence = selectedMenu.nextInt();
            System.out.println("Intelligence: "+ intelligence);
            secondWizard = new Wizard(name, healthPoint, mana, intelligence);
        }*/

        // Display menu to the user and read the selection choice for first character
        System.out.println("Select first character: ");
        System.out.println("Please select the character: \n" +
                "1: Warrior.\n 2: Wizard.");


        //Check if the user selected warrior character or wizard then initializing the object
        int choice = selectedMenu.nextInt();
        if (choice == 1) {
            System.out.println("Enter name: ");
            name = selectedMenu.next();
            // Check if input of name is String
            while (!name.matches("[A-Za-z\\s]+")) {
                System.out.println("Please enter valid name");
                System.out.println("Enter name: ");
                name = selectedMenu.next();
            }
            healthPoint = rand.nextInt(101) + 100;
//            healthPoint = selectedMenu.nextInt();
            System.out.println("Health point: " +healthPoint);
            stamina = rand.nextInt(41) + 10;
//            stamina = selectedMenu.nextInt();
            System.out.println("Stamina: "+ stamina);
            strength = rand.nextInt(10) + 1;
//            strength = selectedMenu.nextInt();
            System.out.println("Strength: " + strength);
            firstWarrior = new Warrior(name, healthPoint, stamina, strength);
        } else if (choice == 2) {
            System.out.println("Enter name: ");
            name = selectedMenu.next();
            while (!name.matches("[A-Za-z\\s]+")) {
                System.out.println("Please enter valid name");
                System.out.println("Enter name: ");
                name = selectedMenu.next();
            }
            healthPoint = rand.nextInt(51) + 50;
//            healthPoint = selectedMenu.nextInt();
            System.out.println("Health point: "+healthPoint);
            mana = rand.nextInt(41) + 10;
//            mana = selectedMenu.nextInt();
            System.out.println("Mana: "+ mana);
            intelligence = rand.nextInt(50) + 1;
//            intelligence = selectedMenu.nextInt();
            System.out.println("Intelligence: "+ intelligence);
            firstWizard = new Wizard(name, healthPoint, mana, intelligence);
        } else {
            throw new IllegalArgumentException("Invalid input.");
        }


        // Display menu to the user and read the selection choice for first character
        System.out.println("\nSelect second character: ");
        System.out.println("Please select the character: \n" +
                "1: Warrior.\n 2: Wizard.");

        //Check if the user selected warrior character or wizard then initializing the object
        choice = selectedMenu.nextInt();
        if (choice == 1) {
            System.out.println("Enter name: ");
            name = selectedMenu.next();
            // Check if input of name is String
            while (!name.matches("[A-Za-z\\s]+")) {
                System.out.println("Please enter valid name");
                System.out.println("Enter name: ");
                name = selectedMenu.next();
            }
            healthPoint = rand.nextInt(101) + 100;
//            healthPoint = selectedMenu.nextInt();
            System.out.println("Health point: " +healthPoint);
            stamina = rand.nextInt(41) + 10;
//            stamina = selectedMenu.nextInt();
            System.out.println("Stamina: "+ stamina);
            strength = rand.nextInt(10) + 1;
//            strength = selectedMenu.nextInt();
            System.out.println("Strength: " + strength);
            secondWarrior = new Warrior(name, healthPoint, stamina, strength);
        } else if (choice == 2) {
            System.out.println("Enter name: ");
            name = selectedMenu.next();
            while (!name.matches("[A-Za-z\\s]+")) {
                System.out.println("Please enter valid name");
                System.out.println("Enter name: ");
                name = selectedMenu.next();
            }
            healthPoint = rand.nextInt(51) + 50;
//            healthPoint = selectedMenu.nextInt();
            System.out.println("Health point: "+healthPoint);
            mana = rand.nextInt(41) + 10;
//            mana = selectedMenu.nextInt();
            System.out.println("Mana: "+ mana);
            intelligence = rand.nextInt(50) + 1;
//            intelligence = selectedMenu.nextInt();
            System.out.println("Intelligence: "+ intelligence);
            secondWizard = new Wizard(name, healthPoint, mana, intelligence);
        } else {
            throw new IllegalArgumentException("Invalid input.");
        }

        // Create random type of both characters
        String[] warriorAttack = {"Heavy", "Weak"};
        String firstWarriorAttackType = warriorAttack[rand.nextInt(warriorAttack.length)];
        String secondWarriorAttackType = warriorAttack[rand.nextInt(warriorAttack.length)];

        String[] wizardAttack = {"FireBall", "Staff hit"};
        String firstWizardAttackType = wizardAttack[rand.nextInt(wizardAttack.length)];
        String secondWizardAttackType = wizardAttack[rand.nextInt(wizardAttack.length)];


        //Check to know which character is selected then start battle
        if (firstWarrior != null) {
            if (secondWarrior != null) {
                while (firstWarrior.isAlive() && secondWarrior.isAlive()) {
                    firstWarrior.attack(secondWarrior,firstWarriorAttackType);
                    secondWarrior.attack(firstWarrior, secondWarriorAttackType);
                }
            } else {
                while (firstWarrior.isAlive() && secondWizard.isAlive()) {
                    firstWarrior.attack(secondWizard, firstWarriorAttackType);
                    secondWizard.attack(firstWarrior, secondWizardAttackType);
                }
            }
        } else {
            if (secondWarrior != null) {
                while (firstWizard.isAlive() && secondWarrior.isAlive()) {
                    firstWizard.attack(secondWarrior, firstWizardAttackType);
                    secondWarrior.attack(firstWizard, secondWarriorAttackType);
                }
            } else {
                while (firstWizard.isAlive() && secondWizard.isAlive()) {
                    firstWizard.attack(secondWizard, firstWizardAttackType);
                    secondWizard.attack(firstWizard, secondWizardAttackType);
                }
            }
        }
        writeTolog("Program ended");
    }


}