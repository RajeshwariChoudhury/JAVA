class Plate {
    int length;
    int width;

    public Plate(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor called with length: " + length + ", width: " + width);
    }
}

class Box extends Plate {
    int height;

    public Box(int length, int width, int height) {
        super(length, width); // Call Plate constructor first
        this.height = height;
        System.out.println("Box constructor called with height: " + height);
    }
}

class WoodBox extends Box {
    int thickness;

    public WoodBox(int length, int width, int height, int thickness) {
        super(length, width, height); // Call Box constructor first
        this.thickness = thickness;
        System.out.println("WoodBox constructor called with thickness: " + thickness);
    }
}

 class woodbox {

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);

        System.out.println("Enter length, width, height, and thickness (separated by spaces): ");
        int length = scan.nextInt();
        int width = scan.nextInt();
        int height = scan.nextInt();
        int thickness = scan.nextInt();

        WoodBox woodBox = new WoodBox(length, width, height, thickness);
    }
}
