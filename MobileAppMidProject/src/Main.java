import java.util.Scanner;
import java.util.ArrayList;

import Input.Brand;

public class Main {
	Scanner scan = new Scanner(System.in);
	Brand vech = new Brand(null, null, null, null, null, 0, 0, 0, null, 0);
	
	ArrayList<Brand> vehicles = new ArrayList<Brand>();
	
	int[] indx = new int[3];
	
	public Main() {
		String choice = "";
		int n = 0;
		
		do {
			n = 0;
			System.out.println("PT. Mentol");
			System.out.println("1. Input vehicles");
			System.out.println("2. View vehicles");
			System.out.println("3. Exit");
			
			do {
				System.out.print(">> ");
				choice = scan.nextLine();
				try {
					n = Integer.parseInt(choice);
					if(n < 1 || n > 3) {
						scan.nextLine();
					}
				} catch (NumberFormatException e) {
					scan.nextLine();
				}
			} while(n < 1 || n > 5);
			
			switch(n) {
			case 1:
				vech.insert(vehicles, indx);
				break;
			case 2:
				vech.view(vehicles);
//				System.out.print("ENTER to return");
//				scan.nextLine();
				break;
			case 3:
				System.out.print("Thankyou for using this app!");
				scan.nextLine();
				break;
			}
		} while(n != 3);
	}
	
	public static void main(String[] args) {
		new Main();
	}

}

