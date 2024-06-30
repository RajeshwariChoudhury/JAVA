import java.util.Scanner;

 class Account {
    int acc_no;
    double balance;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number: ");
        acc_no = scanner.nextInt();
        System.out.println("Enter balance: ");
        balance = scanner.nextDouble();
    }

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar_no;

    public Person() {
        // No-argument constructor for Person
    }

    public void input() {
        super.input(); // Call parent class input method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = scanner.nextLine();
        System.out.println("Enter aadhar number: ");
        aadhar_no = scanner.nextLong();
    }

    
    public void disp() {
        super.disp(); // Call parent class disp method
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

 class Bank {

    public static void main(String[] args) {
        Person[] persons = new Person[3]; // Array to store 3 Person objects

        for (int i = 0; i < 3; i++) {
            persons[i] = new Person();
            System.out.println("Enter details of person " + (i + 1) + ": ");
            persons[i].input();
        }

        System.out.println("\nDetails of Persons:");
        for (Person person : persons) {
            person.disp();
            System.out.println(); // Extra newline for better formatting
        }
    }
}
