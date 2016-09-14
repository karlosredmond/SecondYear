package Sample;

public class FleetManagementCompany {
	private String name;
	private String address;
	private int numCompanys;
	private Manager manager = new Manager();
	private Fleet fleet[] = new Fleet[5] ;
	private int numFleets = 0;

	
	public FleetManagementCompany() {
		// TODO Auto-generated constructor stub
		this("","",0,null) ;
	}
	public FleetManagementCompany(String name,String address, int numCompanys, Manager manager) {
		this.name = name;
		this.address = address;
		setNumCompanys(numCompanys);
		this.manager = manager;
	}
	public FleetManagementCompany(String name,String address, int numCompanys, Manager manager,Fleet[] fleetArr) {
		this.name = name;
		this.address = address;
		setNumCompanys(numCompanys);
		this.manager = manager;
		setFleets(fleetArr) ;
	}

	public void setNumCompanys(int numCompanys) {
		this.numCompanys = (numCompanys > 0 && numCompanys <= 5 ? numCompanys : 0);
	}


	public int getNumCompanys() {
		return numCompanys;
	}
	public void setFleets(Fleet[] fleets) {
		for(int i = 0; i < fleets.length; i++){
			this.fleet[i] = fleets[i];
			numFleets++;
			
		}
		
	}

	@Override
	public String toString() {
		if(numCompanys == 0){
			return	"FleetManagmentCompany\n______________________\n\n name of Company : " + name + "\n address :" + address
					+ "\n numCompanys : " + numCompanys + "\n manager :" + manager
					+ "\n fleet : [no fleet info]\n\n";
		}
		else{
		return	"FleetManagmentCompany\n______________________\n\n name of Company : " + name + "\n address :" + address
				+ "\n numCompanys : " + numCompanys + "\n manager :" + manager
				+ "\n fleet : " + Fleet.toString(fleet,numFleets)
				+ "]";
		}
	}


}
