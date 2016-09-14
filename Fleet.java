package Sample;

public class Fleet {
	private int fleetId;
	private int numVehicle;
	private String fleetType;
	
	public Fleet(int fleetId,int numVehicle, String fleetType) {
		this.numVehicle = numVehicle;
		this.fleetType = fleetType;
		this.fleetId = fleetId;
	}

	public int getFleetId() {
		return fleetId;
	}

	public int getNumVehicle() {
		return numVehicle;
	}

	public static String toString(Fleet fleet[],int numFleets) {
		String returnValue = "" ;
		for(int i = 0; i < numFleets;i++){
		returnValue = returnValue +"\n FleetId : " + fleet[0].getFleetId() + "\n numVehicle : " + fleet[0].getNumVehicle()+ "\n fleetType : " + fleet[0].getFleetType();
		
		}
		return returnValue;
		}
		
	public String getFleetType() {
		return fleetType;
	}

	
	
}
