// lab1 and lab2
// lab4 Static Keyword
import java.util.Scanner; 
import java.util.*;  
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;   
import discount.calcDiscount; 

class InvalidException extends Exception //prg 9
{
    InvalidException(String s)
    { super(s);
    }

}

abstract class discount																													
{
	abstract void offer();
}

interface storedetails{           
  void name();
}

public class supermarket extends employee
{  
      List<Double> pricearray = new ArrayList<Double>();
      List<String> list=new ArrayList<String>(); 
      double  price = 0.00;
      protected String CashierName;
      Scanner console = new Scanner(System.in);
      int age;
      
   supermarket(String username){
      CashierName = username;
   }
  public void cashier()
{
     int item, quantity;
        char choice;
        int pl[] = { 50, 29, 15, 10, 100, 45, 260, 200, 80 };
        String n[] = { "Detergent", "Milk", "Biscuits", "Chocolate", "Cookies", "Yoghurt", "Beer", "Moisturizer",
            "Jam" };
        Scanner console = new Scanner(System.in);
        // try{
        do {
          // Get the value from the user.
          try {
            System.out.print("Enter itemno: ");
            item = console.nextInt();
            if(item == 6){
              System.out.print("Enter age: ");  
              age = console.nextInt();
            }
            System.out.println("Enter Quantity: ");
            quantity = console.nextInt();
            double p = pl[item];
            price = price + (quantity * p);
            list.add(n[item]);
            pricearray.add(quantity * p);

          } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index is Out of Bounds");
            System.exit(1);
          } // prg 9 Exception

          System.out.print("Add next item?(Y for yes or N for no): ");
          choice = console.next().charAt(0);

        } while ((choice == 'y') || (choice == 'Y'));
     }

 	private void details(){
	int OutletId = 710365;
	int CashierID = 156543;
	}

void generatebill(){
		System.out.println("Bill Generates");
		System.out.println("Purchased                          Price(Rs)");
      		System.out.println("--------------------------------------------");
     		for (int i = 0 ; i < list.size(); i++) {System.out.println( list.get(i)+"                                "+pricearray.get(i)) ;}
		System.out.println("Total                              "+price);
}

final void offer()                                                                 
  double discountpercentage = 12.0;
  calcDiscount dis =  new calcDiscount();   
  if(price >=350.00){
  Double discountprice = dis.calculate(price, discountpercentage)  	; 
  Double discountamt = price - discountprice;    
  System.out.println("discount availed                   "+discountpercentage+"%");
  System.out.println("Amount to pay                      "+discountamt);
  }
  
}

public void ordervalid(Double pay) throws InvalidException {   //prg 9
        if (pay == 0.0) {
          throw new InvalidException("Not valid !!");
        }
      }

public void agerestriction() throws InvalidException{
        if (age < 21 )
        {
              throw new InvalidException("Age inappropriate. Must be 21 or older !!!");
        }
}

 public void run(){
        try
        {
        for( int i = 0; i<=5 ; i++)
        {
        System.out.println("                                                           Costco's: Delivering Goodness ! ");
        Thread.sleep(10000);
        }
      }
      catch(InterruptedException e)
      {
         System.out.println("my thread interrupted");
      }
      }

public static void main(String[] args)
{    
      supermarket ob = new supermarket(args[0]);
      outlet.Emp s1 = new outlet.Emp();
      employee eobj = new employee(); 
      Scanner sc = new Scanner (System.in);
      StringBuffer custname = new StringBuffer("Customer : ");
      Thread thread = new Thread(ob);
      thread.start();
      eobj.name();
      outlet obj[]= new outlet[1];
      outlet.change();                                     
      s1.show();
      obj[0]= new outlet(args[0], 230761);
      String st = args[0];
      boolean ans = empname.contains(st.toLowerCase());
      if(ans)
      {
      	obj[0].cashier();
	try {                                  // prg9
            obj[0].ordervalid(price);
              } catch (Exception m){
           System.out.println(m);
           System.exit(1);}
           try {                                  // prg9 Exception
            obj[0].agerestriction();
          } catch (Exception m)
          {
            System.out.println(m);
            System.exit(1);
          }
        System.out.println("Customer : ");
        custname.append(sc.nextLine());
        obj[0].display("cash");
        obj[0].generatebill();
	obj[0].offer();
	System.out.println(custname);                 // prg5 printing appended string buffer
     }
     else{System.out.println("No employee");}
       
}

}

class outlet extends supermarket{
static String Outletname = "Costco";                          //Static Variable
static void change(){Outletname= "Costco's Indiranagar";}                 // Static method
static { System.out.println("     Hello     ");}              //Static Block
int password;
outlet(String username, int password){
	super(username);
	this.password = password;
}
outlet(String username, int password, int employeeID)        //constructor overloading
{
	super(username);
	this.password= password;
	int empID= employeeID;
}
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
LocalDateTime now = LocalDateTime.now();

void display(){System.out.println(CashierName); 
System.out.println(dtf.format(now));}

void display(String mode)                                    //function overloading
{
 System.out.println(Outletname+"\n"+ "Cashier: " + CashierName); 
 System.out.println(dtf.format(now));
 System.out.println("Paid by :     "+ mode);
}

static class Emp{                                            //static class
    void show(){
     System.out.println("Welcome to Costco's.\nWe value your service. Have a good day!! ") ;
     System.out.println(" ");
               }
                }
}

class employee implements storedetails        
{
  static List<String> empname= new ArrayList<String>(3);
  public void name(){
  empname.add("henry");
  empname.add("toby");
  empname.add("julia");
     }

}

