package Tasks2;

import java.util.Scanner;


	
	


public class ProductMain {

	//void getTotal{
		
		
	//}
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		Product[] product= new Product[5];
		
		Product[] obj=new Product[5];
		
		//obj.getTotal();
		
		System.out.println("Hello");
		
		for (int i=0; i<5;i++) {
			System.out.println("Enter the Product ID: " +(i+1));
			int pid=sc.nextInt();
			
			System.out.println("Product ID: " +pid);
			
			
			System.out.println("Enter the Product Price: ");
			double price=sc.nextDouble();
			System.out.println("Product Price: " +price);
			
			
			System.out.println("Enter the Product Quantity: " );
			int quantity=sc.nextInt();
			System.out.println("Product Quantity: " +quantity);

			
			product[i]= new Product(pid,price,quantity);
		}
		
	
		
	}

}
