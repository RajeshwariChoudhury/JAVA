//5.Write a program which will overload the area () method and display the area of a circle, triangle and square as per user choice and user entered dimensions. 
//Input:Mention dimensions like radius, base, height, side
//Output:Display area of circle
//Display area of triangle
//Display area of square

import java.util.*;
class abc{
double ar,r,b,h,s;

void area(double r)
{
ar=3.14*r*r;
}
void area(double b,double h)
{
ar=0.5*b*h;
}
void area()
{
Scanner s3=new Scanner(System.in);
System.out.println("enter side length:");
s=s3.nextDouble();
ar=s*s;
}
void display()
{
System.out.println("Area="+ar);
}
}
class area_cal{
public static void main(String args[])
{
abc a1=new abc();
abc a2=new abc();
abc a3=new abc();
System.out.println("enter side(0,3,4):");
Scanner s1=new Scanner(System.in);
int side=s1.nextInt();
if(side==0)
{
Scanner s2=new Scanner(System.in);
System.out.println("enter radius:");
double rad=s2.nextDouble();
a1.area(rad);
a1.display();
}
else if(side==3)
{
Scanner s2=new Scanner(System.in);
System.out.println("enter base:");
double base=s2.nextDouble();
System.out.println("enter height:");
double height=s2.nextDouble();
a2.area(base,height);
a2.display();
}
else if(side==4)
{
a3.area();
a3.display();
}
}
}



