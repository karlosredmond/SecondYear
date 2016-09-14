package Lab5;

public final class ShiftWorker extends Employee {
	private double hours;
	private double rate;
	private double shift; // 0== day shift, 1 == evening shifts, 2 == night shifts
	
	
	public ShiftWorker(String fName, String lName,double hours, double rate, String shift) {
		super(fName, lName);
		setHours(hours);
		setRate(rate) ;
		setShifts(shift) ;
		
		// TODO Auto-generated constructor stub
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public void setShifts(String shift) {
		if(shift == "Day"){
			this.shift = 1;
		}
		else if (shift == "Evening"){
			this.shift = 1.5;
		}
		else
			this.shift = 2;
	}

	@Override
	double earnings() {
		// TODO Auto-generated method stub
		return hours*(rate * shift);
	}

}
