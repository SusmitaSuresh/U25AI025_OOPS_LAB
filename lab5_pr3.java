import java.util.Scanner;

/*Q.3) Create Product having following attributes: Product ID, Name, Category ID and UnitPrice. Create
ElectricalProduct having the following additional attributes: VoltageRange and Wattage. Add a behavior to
change the Wattage and price of the electrical product. Display the updated ElectricalProduct details. */

class Product
{
    int ProductID;
    String Name;
    String CategoryID;
    double UnitPrice;
    Product(int ProductID, String Name, double UnitPrice)
    {
        this.Name = Name;
        this.ProductID = ProductID;
        this.UnitPrice = UnitPrice;
    }
}

class ElectricalProduct extends Product
{
    {
        CategoryID = "electrical";
    }
    double VoltageRange, Wattage;       //voltage range is maximum value of volt... min is 0

    ElectricalProduct(int ProductID, String Name, double UnitPrice, double VoltageRange, double Wattage) 
    {
        super(ProductID, Name, UnitPrice);
        this.VoltageRange = VoltageRange;
        this.Wattage = Wattage;
    }

    void displayInfo()
    {
        System.out.println("product info: ");
        System.out.println("product ID: "+ProductID);
        System.out.println("name: "+Name);
        System.out.println("category ID: "+CategoryID);
        System.out.println("unit price: "+UnitPrice);
        System.out.println("voltage range: 0 to "+VoltageRange);
        System.out.println("wattage: "+Wattage);
    }

    void changeWattage(double Wattage)
    {
        this.Wattage = Wattage;
    }
    void changeUnitPrice(double UnitPrice)
    {
        this.UnitPrice = UnitPrice;
    }
}

public class lab5_pr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ProductID;
        String Name;
        String CategoryID;
        double UnitPrice, VoltageRange, Wattage;


        System.out.print("enter product name: ");
        Name = sc.nextLine();
        System.out.print("enter product ID: ");
        ProductID = sc.nextInt();
        System.out.print("enter product unit price: ");
        UnitPrice = sc.nextDouble();
        System.out.print("enter product voltage range: ");
        VoltageRange = sc.nextDouble();
        System.out.print("enter product wattage: ");
        Wattage = sc.nextDouble();

        ElectricalProduct ep = new ElectricalProduct(ProductID, Name, UnitPrice, VoltageRange, Wattage);
        
        ep.displayInfo();

        System.out.print("\nenter new wattage: ");
        Wattage = sc.nextDouble();
        System.out.print("enter new unti price: ");
        UnitPrice = sc.nextDouble();
        ep.changeUnitPrice(UnitPrice);
        ep.changeWattage(Wattage);

        ep.displayInfo();
        sc.close();
    }
}
