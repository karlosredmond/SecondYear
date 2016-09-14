package Lab5;

public class CarTest {
	public static void main(String[] args){
		Cars[] carArray = new Cars[10] ;
		
		carArray[0] = new Cars("Toyota","Corolla", 1.4, "Petrol", "04 MN 2309");
		carArray[1] = new Cars("Toyota","Avensis", 1.6, "Petrol", "05 WX 309");
		carArray[2] = new Cars("Toyota","Aurion", 3.0, "Petrol", "12 DW 4444");
		carArray[3] = new Cars("Toyota","Celica", 1.6, "Petrol", "15 CW 1234");
		carArray[4] = new Cars("Toyota","Avenis", 2.2, "Diesel", "98 W 321");
		carArray[5] = new Cars("VolksWagen","Golf", 1.4, "Petrol");
		carArray[6] = new Cars("Volkswagen","Polo", 1.3, "Petrol");
		carArray[7] = new Cars("Audi","A3", 2.0, "Diesel");
		carArray[8] = new Cars("Audi","A4", 1.6, "Petrol");
		carArray[9] = new Cars("Toyota","Yaris", 1.0, "Petrol");
		
		System.out.println(carArray[1].toString());
		System.out.println(carArray[9].toString());
	}

}