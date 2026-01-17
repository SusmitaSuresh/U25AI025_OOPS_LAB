import java.util.Scanner;
class Invoice
{
    String p_num, p_des;
    int quantity;
    double price;
    //set method helps set values of variables (as they are usually private they can be changed using methods)
    void setPartNumber(String p_num)
    {
        this.p_num = p_num;
    }
    void setPartDescription(String p_des)
    {
        this.p_des = p_des;
    }
    void setQuantity(int quantity)
    {
        if(quantity<0)
            quantity=0;
        this.quantity = quantity;
    }
    void setPrice(double price)
    {
        if(price<0)
            price=0.0; 
        this.price = price;
    }
    //get method returns the value of variables (As they are usually private and not accessible directly)
    String getPartNumber()       
    {
        return p_num;
    }
    String getPartDescription()
    {
        return p_des;
    }
    int getQuantity()
    {
        return quantity;
    }
    double getPrice()
    {
        return price;
    }
    double getInvoiceAmount()
    {
        return (price*quantity);
    }
}
public class lab2_pr2 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String []args)
    {
        String p_num, p_des;
        int quantity;
        double price;
        Scanner sc = new Scanner(System.in);
        Invoice inv = new Invoice();
        System.out.print("enter the part number: ");
        p_num = sc.next();
        inv.setPartNumber(p_num);
        System.out.print("enter the part description: ");
        p_des = sc.next();  
        inv.setPartDescription(p_des);
        System.out.print("enter the quantity: ");
        quantity = sc.nextInt();  
        inv.setQuantity(quantity);
        System.out.print("enter the price: ");
        price = sc.nextDouble(); 
        inv.setPrice(price);
        System.out.println("Part number is: "+inv.getPartNumber());
        System.out.println("Part description is: "+inv.getPartDescription());
        System.out.println("Quantity of item is: "+inv.getQuantity());
        System.out.println("Price per item is: "+inv.getPrice());
        System.out.println("Invoice amount is: "+inv.getInvoiceAmount());
        sc.close();
    }
}
