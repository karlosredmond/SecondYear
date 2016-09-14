package Sample;

/*
** Author:      	Karl Redmond
** Login ID:	C00196815
** Date:		
**
** Description: This Driver class creates managers and fleets for fleet management
**			companies and then creates the three fleets and prints 
**			the details of the objects created.
*/


public class FleetManagementCompanyDriver{
	public static void main (String args[])
	{
		// create three Manager objects
		Manager joe = new Manager ("Joe", "Joe's Fleet, Barcelona St", 10000f);
		Manager peter = new Manager ("Peter", "Pete's Fleet, Paris St", 23456f);
		Manager bertie = new Manager ("Bertie", "Berties Fleet, Dublin St", 33444f);
		Manager karl = new Manager("Karl","Karls' Fleet, Wexford Street,Wexford",150000f) ;
		// create three Fleet objects 
		Fleet 	fleetUtilityVan = new Fleet (1, 100, "Utility Van");
		Fleet 	fleetHaulage = new Fleet (2, 200, "Haulage");
		Fleet 	fleetCompanyCars = new Fleet (3, 300, "Company Cars");

		//put the Fleets in an array so that they can be added to a specific Fleet
		Fleet[] fleets = new Fleet[3];
		fleets[0] = fleetUtilityVan;
		fleets[1] = fleetHaulage;
		fleets[2] = fleetCompanyCars;

		// create three Fleet Management Companies each one with a Manager
		FleetManagementCompany fleetCO = new FleetManagementCompany("FleetCO Fleets","Tullow Street, Carlow", 30000, joe);
	
		FleetManagementCompany fayetteFleets = new FleetManagementCompany("Fayette Fleets", "French St, Carlow", 12000, peter);

		// notice the different constructor called here
		FleetManagementCompany museumFleets = new FleetManagementCompany("Museum Fleets", "Dublin St, Carlow", 50000, bertie, fleets);
		
		Fleet[] fleet = new Fleet[5];
		fleet[0] = fleetUtilityVan;
		fleet[1] = fleetUtilityVan;
		fleet[2] = fleetHaulage;
		fleet[3] = fleetHaulage;
		fleet[4] = fleetCompanyCars;

		FleetManagementCompany carlowFleets = new FleetManagementCompany("Carlow Fleets","Carlow St,Carlow",5,karl,fleet) ;
		//print the details of the FleetManagementCompany objects
		
		System.out.println(fleetCO.toString());
		System.out.println(fayetteFleets.toString());
		System.out.println(museumFleets.toString());
		System.out.println(carlowFleets.toString());
		System.out.println(fleetCO.getNumCompanys());
		
	}
}

