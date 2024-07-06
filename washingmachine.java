interface Motor {
    int capacity = 0; 

    void run();
    void consume(); 
}


class WashingMachine implements Motor {
    private int machineCapacity; 

    WashingMachine(int capacity) {
        this.machineCapacity = capacity;
    }

    public void run() {
        System.out.println("Washing machine is running.");
    }

    public void consume() {
        System.out.println("Washing machine is consuming power.");
    }

    void displayCapacity() {
        System.out.println("Motor interface capacity: " + capacity);
        System.out.println("Washing machine capacity: " + machineCapacity);
    }
}


public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine(5); 
        washingMachine.run();
        washingMachine.consume();
        washingMachine.displayCapacity();
    }
}