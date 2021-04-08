import java.util.Scanner;

public class WashingMachines {
			Scanner in = new Scanner(System.in);
			
			void printWashingMachines() {
				System.out.println("Enter Brand, Colour, Weight(in kg), Price(RM)");
				String brand = in.next();
				String colour = in.next();
				double weight = in.nextDouble();
				double price = in.nextDouble();
				System.out.println("Brand: " + brand);
				System.out.println("Colour: " + colour);
				System.out.println("Weight: " + weight + "kg");
				System.out.println("Price: RM" + price);
				System.out.println();
				}
			void printPrice() {
				System.out.print("Enter the price: ");
				double price = in.nextDouble();
				System.out.print("Enter the quantity: ");
				double quantity = in.nextDouble();
				System.out.println("Do you need installation service? (charge RM50.00)");
				boolean installationService = in.nextBoolean(); 
				boolean yes = true;
				boolean no = false;
	
			if (yes == true) {
				double total = (price * quantity) + 50;
				System.out.println("The total price is: " + total);
			}
			else if(no == false){
				double total = (price * quantity);
				System.out.println("The total price is" + total);
			}
			
					
			}
			void printOnOff() {   
				String [] function = {"Regular", "Quick", "Water Saving", "Delicate"};
				System.out.println("Switch On/Off:");
				String onOff = in.next();
				
				switch (onOff) {
					case "on":
						System.out.println("The washing machine is on!");
						System.out.println("--Functions-- ");
						for(int i = 0; i < function.length; i++) {
						System.out.println(function[i]);
						}break;
						
					case "off":
						System.out.println("The washing machine is now off!");
					break;
						
				}
	
			}
			void printRinseSpin() {
			System.out.print("Please enter the function:");
			String function = in.next();
			String r = "Regular";
			String q = "Quick";
			String ws = "Water Saving";
			String d = "Delicate";
		
			if (function.equals(r)) {
			System.out.println("The Rinse Spin for Regular is 45minutes");
			}
			else if (function.equals(q)) {
					System.out.println("The Rinse Spin for Quick is 30minutes");
				}
			else if (function.equals(ws)) {
					System.out.println("The Rinse Spin for Water Saving is 20minutes");
				}
			else if (function.equals(d)) {
					System.out.println("The Rinse Spin for Delicate is 40mintues");
				}		
			else {
				System.out.println("This function is unvaiable!");

			}
	}
}
		
