package module1;

public class Product {
       private int productId;
       private String name;
       private double price;
       private int quantity;
       private String manufacturar;
       
       public void displayDetails() {
       	System.out.println("product details are");
       	 
       	
       	
        }
       public void upadetPrice() {
          	System.out.println("upadated price is");
          	 
          	
          	
          	
           }
          
       public void updateAvilability() {
         	System.out.println("product avilable is");
         	 
         	
         	
         	
          }
       public void applyDiscount() {
         	System.out.println("product discount is");
         	
         	
         	
          }
       public void display() {
        	System.out.println("productId="+productId);
        	
        	System.out.println("name="+name);  
       	  
        	System.out.println("price="+price); 
        	
        	System.out.println("quantity="+quantity); 
        	System.out.println("manufacturar="+manufacturar); 
       	  
         }
         
  
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Product product =new Product();
		   product.productId=123;
		   product.name="Amul";
		   product.price=70;
		   product.quantity=1;
		   product.manufacturar="abc company";
		   
		   System.out.println("calling memeber fun");
		   
		   product.displayDetails();
		   product.upadetPrice();
		   product.updateAvilability();
		   product.applyDiscount();
		   product.display();
		   
		   
		   
		   
	}

}
