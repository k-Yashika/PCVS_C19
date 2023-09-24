package pcvs;

/*
 * Java: JavaSE - 16
 * Date: 18/10/2021*/

/* the healthcare class that holds a collection of healthcare objects*/

import java.util.ArrayList;
import java.util.List;

public class Patient extends User{

	private String icPassport;
	private List<Vaccination> vaccination;

	/**
	 * @param userName
	 * @param passWord
	 * @param email
	 * @param fullName
	 * @param icPassport
	 */
	
	
	public Patient(String userName, String passWord, String email, String fullName, String icPassport2) {
		super(userName, passWord, email, fullName);
		setIcPassport(icPassport);
		setVaccination(new ArrayList<Vaccination>());
	}

	public void add(Vaccination vacc) {
		getVaccination().add(vacc);
	}

	/**
	 * @return the icPassport
	 */
	public String getIcPassport() {
		return icPassport;
	}

	/**
	 * @param icPassport the icPassport to set
	 */
	public void setIcPassport(String icPassport) {
		this.icPassport = icPassport;
	}
	
	public List<Vaccination> getVaccination(){
		return vaccination;
	}
	
	public void setVaccination(List<Vaccination> vaccination) {
		this.vaccination = vaccination;
	}
	
	// a method to view appointment status
	public String viewAppointmentStatus() {
		String apt = "";
		for(Vaccination vacc: getVaccination()) {
			apt = apt + vacc.getVaccinationID() + ": " +
					vacc.getStatus() + "\n";
		}
		return apt;
	}
}
