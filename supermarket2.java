// lab1 and lab2
import java.util.Scanner; 
import java.util.*;  
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;   

public class supermarket2
{     List<Double> pricearray = new ArrayList<Double>();
      List<String> list=new ArrayList<String>(); 
      double  price = 0.00;
      protected String CashierName = "Henry";
  public void cashier()
{
      int  item, quantity;    
      char choice;     
      int pl[]= {50,29,15,10,100,45,150,200,80};
      String n[]= {"Detergent","Milk","Biscuits","Chocolate","Cookies","Yoghurt","Body Wash","Moisturizer","Jam"};
      Scanner console = new Scanner(System.in);

      do
      {
         // Get the value from the user.
         System.out.print("Enter itemno: ");
         item = console.nextInt();
	 System.out.println("Enter Quantity: ");
	 quantity = console.nextInt();
         for(int i=0; i<9; i++)
	 {
	   if(item == i){
	    double p = pl[item];
	    price = price + (quantity * p);
	    list.add(n[item]);
	    pricearray.add(quantity*p);
			}
	    //else{ System.out.println("Item does not exist!");
		  //System.exit(0);}
	 }	
	
         System.out.print("Add next item?(Y for yes or N for no): ");
         choice = console.next().charAt(0);
       }
      while ((choice == 'y') || (choice == 'Y'));
     
      
      System.out.println("Bill Generated");
      System.out.println("--------------------------------------------");
     
}

 	private void details(){
	int OutletId = 710365;
	int CashierID = 156543;
	}

void generatebill(){
		System.out.println("Purchased                          Price(Rs)");
      		System.out.println("--------------------------------------------");
     		for (int i = 0 ; i < list.size(); i++) {System.out.println( list.get(i)+"                                "+pricearray.get(i)) ;}
		System.out.println("Total                              "+price);
}


public static void main(String[] args)
{
      outlet obj[]= new outlet[1];
      obj[0]= new outlet();
      obj[0].cashier();
      obj[0].display();
      obj[0].generatebill();
}

}

class outlet extends supermarket2{
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
LocalDateTime now = LocalDateTime.now();
void display(){System.out.println(CashierName); 
System.out.println(dtf.format(now));}

}


