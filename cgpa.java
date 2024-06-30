import java.util.Scanner;

class abc{
    int roll;
    float cgp;
    String name;
    void display(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(cgp);
    }
}
public class cgpa {
    public static void main(String[] args) {
        abc a1=new abc();
        abc a2=new abc();
        abc a3=new abc();
        Scanner s1 =new Scanner(System.in);
        Scanner s2 =new Scanner(System.in);
        System.out.println("Enter the roll:");
        a1.roll=s1.nextInt();
        System.out.println("Enter the name:");
        a1.name=s2.nextLine();
        System.out.println("Enter the cgpa:");
        a1.cgp=s1.nextFloat();
        System.out.println("Enter the roll:");
        a2.roll=s1.nextInt();
        System.out.println("Enter the name:");
        a2.name=s2.nextLine();
        System.out.println("Enter the cgpa:");
        a2.cgp=s1.nextFloat();
        System.out.println("Enter the roll:");
        a3.roll=s1.nextInt();
        System.out.println("Enter the name:");
        a3.name=s2.nextLine();
        System.out.println("Enter the cgpa:");
        a3.cgp=s1.nextFloat();
        System.out.println("The name is:"+a1.name);
        System.out.println("The name is:"+a1.roll);
        System.out.println("The name is:"+a1.cgpa);
        System.out.println("The name is:"+a2.name);
        System.out.println("The name is:"+a2.roll);
        System.out.println("The name is:"+a2.cgpa);
        System.out.println("The name is:"+a3.name);
        System.out.println("The name is:"+a3.roll);
        System.out.println("The name is:"+a3.cgpa);
        if((a1.cgp>a3.cgp) && (a2.cgp>a3.cgp)){
            System.out.println("The cgpa of " +a3.name+" is lesser.");
        }
        else if((a1.cgp>a2.cgp) && (a3.cgp>a2.cgp)){
            System.out.println("The cgpa of " +a2.name+" is lesser.");
        }
        else{
            System.out.println("The cgpa of " +a1.name+" is lesser.");
        }

    }
}