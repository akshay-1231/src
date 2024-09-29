package javaproject;

public class Prod {
    private int ProductId;
    private String name;
    private int price;
    private int quantity;
    private String Manufacturar;
    
    public void DisplayproductDetails() {
    	System.out.println("deatails are");
    	
    }
    public void UpdatePrice() {
    	System.out.println("updated price is");
    }
    public void UpdateQuantity() {
    	System.out.println("updated quantity is");
    }
  //  private void CheckAvilability()
   // {
    //	System.out.println("avilability of product is");
    //}
    public void Display() {
    	System.out.println("ProductId="+ProductId);
    	System.out.println("name="+name);
    	System.out.println("price="+price);
    	System.out.println("quantity="+quantity);
    	System.out.println("manufacturar="+Manufacturar);
    
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Prod prod=new Prod();
           prod.ProductId=1234;
           prod.name="Akshay";
           prod.price=70;
           prod.quantity=2;
           prod.Manufacturar="asd company";
           
           prod.Display();
           prod.DisplayproductDetails();
           prod. UpdatePrice();
           prod.UpdateQuantity();
           
           
	}

}
