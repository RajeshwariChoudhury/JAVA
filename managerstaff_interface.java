//-Define an interface with three methods – earnings(), deductions()
//and bonus() and define a Java class ‘Manager’ which uses this interface without
//implementing bonus() method. Also define another Java class ‘Substaff’ which extends
//from ‘Manager’ class and implements bonus() method. Write the complete program to
//find out earnings, deduction and bonus of a sbstaff with basic salary amount entered by
//the user as per the following guidelines –
//earnings basic + DA (80% of basic) + HRA (15% of basic)
//deduction PF 12% of basic
//bonus 50% of basic
//Input -Basic salary - 50000
//Output -Earnings - 97500
//Deduction -6000
//Bonus - 25000


interface staff_interface {
    void earnings();
    void deductions();
    void bonus();
}
class manager implements staff_interface{
    int earning,basic=50000,deduct,bonus,hra,da;
    public void earnings(){
     deduct=(12*basic)/100;
     bonus=(50*basic)/100;
     hra=(15*basic)/100;
     da=(80*basic)/100;
     earning=basic+da+hra;
    }
    public void deductions(){
        deduct=(12*basic)/100;
    }
    public void bonus(){
        bonus=(50*basic)/100;
    }
    void display(){
        System.out.println(earning);
        System.out.println(deduct);
        System.out.println(bonus);
    }
}
class managerstaff_interface{
    public static void main(String[] args) {
         manager m1=new manager();
         m1.earnings();
         m1.deductions();
         m1.bonus();
         m1.display();
}
}
