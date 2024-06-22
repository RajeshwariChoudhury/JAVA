//Implement a Java class called Book representing a book. The class should have attributes like title, author, isbn, and price. Create overloaded constructors //for this class to handle different scenarios, such as initializing a book with just title and author, or with all attributes.

class Book
{
String title;
String author;
int isbn;
double price;

Book(String t,String a,int i,double p)
{
title=t;
author=a;
isbn=i;
price=p;
}
Book(String tt,String ar,int ib)
{
title=tt;
author=ar;
isbn=ib;
}
Book(String ti,String au)
{
title=ti;
author=au;
}
void display1()
{
System.out.println("Title:"+title);
System.out.println("Author:"+author);
System.out.println("ISBN:"+isbn);
System.out.println("Price:"+price);
}
void display2()
{
System.out.println("Title:"+title);
System.out.println("Author:"+author);
System.out.println("ISBN:"+isbn);
}
void display3()
{
System.out.println("Title:"+title);
System.out.println("Author:"+author);
}
}
class bookconstructor
{
public static void main(String args[])
{
Book b1=new Book("MY_FAULT","Q",1245,500.0);
Book b2=new Book("YOUR_FAULT","P",1285);
Book b3=new Book("OUR_FAULT","T");
b1.display1();
b2.display2();
b3.display3();
}
}


