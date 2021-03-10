package Input;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Brand {
	Scanner scan = new Scanner(System.in);
	
	private String id;
	private String type;
	private String brand;
	private String name;
	private String license;
	private String typeC;
	private int topSpeed;
	private int gasCap;
	private int wheel;
	private int system;

	public Brand(String id, String brand, String type, String name, String license, int topSpeed, int gasCap, int wheel, String typeC, int system) {
		super();
		this.id = id;
		this.type = type;
		this.brand = brand;
		this.name = name;
		this.license = license;
		this.typeC = typeC;
		this.topSpeed = topSpeed;
		this.gasCap = gasCap;
		this.wheel = wheel;
		this.system = system;
	}
	
	//Set ID
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	//Set Type
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	//Set Brand
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//Set Name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Set License
	public String getlicense() {
		return license;
	}

	public void setlicense(String license) {
		this.license = license;
	}
	
	//Set TopSpeed
	public int gettopSpeed() {
		return topSpeed;
	}
	
	public void settopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	//Set gasCap
	public int getgasCap() {
		return gasCap;
	}
	
	public void setgasCap(int gasCap) {
		this.gasCap = gasCap;
	}
	
	//Set wheel
	public int getwheel() {
		return wheel;
	}
		
	public void setwheel(int wheel) {
		this.wheel = wheel;
	}
	
	//Set typeC
	public String gettypeC() {
		return typeC;
	}
	
	public void settypeC(String typeC) {
		this.typeC = typeC;
	}
	
	//Set system
	public int getsystem() {
		return system;
	}
		
	public void setsystem(int system) {
		this.system = system;
	}

//INPUT USER
	public Brand getData() {
		//Initialize all variables
		String type = "", brand = "", name = "", license = "", id = "", typeC = "";
		int topSpeed = 0;
		int gasCap = 0;
		int wheel = 0;
		int system = 0;
		
		//Input type
		do {
			System.out.print("Input type [Car | Motorcycle]: ");
			type = scan.nextLine();
			
			if(type.equals("Car") || type.equals("Motorcycle")) {
				break;				
			} 
		} while(true);
		
		//Input brand
		do {
			System.out.print("Input brand [>= 5]: ");
			brand = scan.nextLine();
			
			if(brand.length() <= 5) {
				break;
			}
		} while(brand.length() <= 5);
		
		//Input name
		do {
			System.out.print("Input name[>= 5]: ");
			name = scan.nextLine();
			
			if(name.length() >= 5) {
				break;
			}
		} while(name.length() <= 5);
		
		//Input license 
		do {
			System.out.print("Input license: ");
			license = scan.nextLine();
		} while(license.length() <= 1);
		
		
		//Input topSpeed
		do {
			System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
			topSpeed = scan.nextInt();
		
			if(topSpeed>=100&&topSpeed<=250) {
				break;
			}
		} while(true);
		
	
		//Input gasCap
		do {
			System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
			gasCap = scan.nextInt();
			if(gasCap>=30&&gasCap<=60) {
				break;
			}
		}while(true);
			
		
		//Input wheel
		do {
			if(type.equals("Car")) {
				System.out.print("Input wheel [4 <= wheel <= 6]: ");
				wheel = scan.nextInt();
				scan.nextLine();
				if(wheel>=4&&wheel<=6) {
					break;
				}
			}else if(type.equals("Motorcycle")) {
				System.out.print("Input wheel [2 <= wheel <= 3]: ");
				wheel = scan.nextInt();
				scan.nextLine();
				if(wheel>=2&&wheel<=3) {
					break;
				}
			}
		}while(true);
		
		//Input typeC
		do {
			if(type.equals("Car")) {
				System.out.print("Input type [SUV | Supercar | Minivan]: ");
				typeC = scan.nextLine();
				if(typeC.equals("SUV") || typeC.equals("Supercar") || typeC.equals("Minivan")) {
					break;		
				}
			}else if(type.equals("Motorcycle")) {
				System.out.print("Input type [Automatic | Manual]: ");
				typeC = scan.nextLine();
				if(typeC.equals("Automatic") || typeC.equals("Manual")) {
					break;
				}
			}
		}while(true);
		
		//Input system
		do {
			if(type.equals("Car")) {
				System.out.print("Input entertainment system amount [>=1]: ");
				system = scan.nextInt();
				if(system>=1) {
					break;
				}
			}else if(type.equals("Motorcycle")) {
				System.out.print("Input amount of helm [>=1]: ");
				system = scan.nextInt();
				if(system>=1) {
					break;
				}
			}
		}while(true);
		
		Brand vech = new Brand(id, type, brand, name, license, topSpeed, gasCap, wheel, typeC, system);
		
		return vech;
	}
	
	public int searchBrand(ArrayList<Brand> vehicles, String action) {
		ArrayList<Brand> count = new ArrayList<>(vehicles);
		view(count);
		
		int flag = 0;
		
		do {
			Brand vech = getData();
			System.out.print("Pick a vehicle number to test drive[Enter '0' to exit]: ");
			vehicles.add(new Brand(vech.getId(), vech.getType(), vech.getBrand(), vech.getName(), vech.getlicense(), vech.gettopSpeed(), vech.getgasCap(), vech.getwheel(), vech.gettypeC(), vech.getsystem()));
			scan.nextLine();
			System.out.println("Brand: " + ((List<Brand>) vech).get(flag).getBrand());
			System.out.println("Name: " + ((List<Brand>) vech).get(flag).getName());
			System.out.println("License Plate: " + ((List<Brand>) vech).get(flag).getlicense());
			System.out.println("Type : " + ((List<Brand>) vech).get(flag).getgasCap());
			System.out.println("Gas Capacity : " + ((List<Brand>) vech).get(flag).getBrand());
			System.out.println("Top Speed: " + ((List<Brand>) vech).get(flag).getName());
			System.out.println("Wheel(s): " + ((List<Brand>) vech).get(flag).getlicense());
			System.out.println("Entertainment System: " + ((List<Brand>) vech).get(flag).getgasCap());
			System.out.println("Press Enter to continue to main menu...");
			flag++;
			scan.nextLine();
		} while(true);
	}
	
	public void insert(ArrayList<Brand> vehicles, int[] indx) {
		Brand vech = getData();
		
		vehicles.add(new Brand(vech.getId(), vech.getType(), vech.getBrand(), vech.getName(), vech.getlicense(), vech.gettopSpeed(), vech.getgasCap(), vech.getwheel(), vech.gettypeC(), vech.getsystem()));
		
		System.out.println("ENTER to return");
		scan.nextLine();
		
	}
	
	public void view(ArrayList<Brand> vehicles) {
		int idx = 1;
		ArrayList<Brand> temp = new ArrayList<>(vehicles);
		
		System.out.println("|-----|---------------|---------------|");
		System.out.println("|No   |Type           |Name           |");
		System.out.println("|-----|---------------|---------------|");
		for (Brand i : temp) {
			System.out.printf("|%-5d|%-15s|%-15s|\n", idx, i.getType(), i.getName());
			idx++;
		}
		System.out.println("|-----|---------------|---------------|");
		System.out.println();
		
		do {
			System.out.print("Pick a vehicle number to test drive[Enter '0' to exit]: ");
			int num = scan.nextInt();
			scan.nextLine();
			if(num == 0) {
				break;
			}else {
				searchBrand(vehicles, id);
			}
		}while(true);
	}
}
