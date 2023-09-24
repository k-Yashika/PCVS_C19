package pcvs;

/*
 * Java: JavaSE - 16
 * Date: 18/10/2021*/

/* a class for the PCVS system that contains a collection of 
User, vaccine, healthcare, batch and vaccination objects*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import pcvs.Vaccination.Status;

public class PCVS {
	
	public enum TypeOfUser{
		ADMIN, PATIENT
	}

	private List<User> user;
	private List<Vaccine> vaccine;
	private List<Healthcare> healthcare;

	
	//Constructor for PCVS Class
	public PCVS() {
		setUser(new ArrayList<User>());
		setVaccine(new ArrayList<Vaccine>());
		setHealthcare(new ArrayList<Healthcare>());}
	
	
	//Method to add user - either patient or administrator
	//newUser refers to the new user being added
	public void addUser(User newUser) {
		getUser().add(newUser);
	}
	
	// to find a user for log in
	public User findUser(String userName) {
		return getUser().stream()
				.filter(x -> x.getUserName() == userName)
				.findAny()
				.orElse(null);
		}

	
	/**
	 * @return the user
	 */
	public List<User> getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(List<User> user) {
		this.user = user;
	}
	
	//Method to add a new vaccine - for administrator
	//newVaccine refers to the new vaccine being added
	public void addVaccine(Vaccine newVaccine) {
		getVaccine().add(newVaccine);
	}
	
	public Vaccine findVaccine(String vaccineID) {
		return getVaccine().stream()
				.filter(x -> x.getVaccineID().equalsIgnoreCase(vaccineID))
				.findAny()
				.orElse(null);
	}

	/**
	 * @return the vaccine
	 */
	public List<Vaccine> getVaccine() {
		return vaccine;
	}

	/**
	 * @param vaccine the vaccine to set
	 */
	public void setVaccine(List<Vaccine> vaccine) {
		this.vaccine = vaccine;
	}
	
	public Healthcare findHc(String centreName) {
		return getHealthcare().stream()
				.filter(x -> x.getCentreName().equalsIgnoreCase(centreName))
				.findAny()
				.orElse(null);
	}
	
	//Method to add a new Healthcare Centre
	//newHC refers to the new Healthcare centre being added
	public void addHC(Healthcare newHC) {
		getHealthcare().add(newHC);
		}

	/**
	 * @return the healthcare
	 */
	public List<Healthcare> getHealthcare() {
		return healthcare;
	}

	/**
	 * @param healthcare the healthcare to set
	 */
	public void setHealthcare(List<Healthcare> healthcare) {
		this.healthcare = healthcare;
	}

	//Method to get the number of users in PCVS
	public int numOfUsers() {
		return getUser().size();
	}
	//Method to get the number of Healthcare Centres in PCVS
	public int numofHC() {
		return getHealthcare().size();
	}
	//Method to get the number of Vaccines in PCVS
	public int numofVaccine() {
		return getVaccine().size();
	}
	
	// a method to retireve the total number of appointments
	public int numOfAppointments() {
		 int totalAppt = 0;
		for(Vaccine v: getVaccine())
			for(Batch b: v.getBatches())
				for(Vaccination vac: b.getVaccinations())
					if(vac.getStatus() == Status.PENDING || vac.getStatus() == Status.CONFIRM) {
						totalAppt++;
					}
		return totalAppt;
	}
	
	// a method to display all appointments
	public String allAppointments() {
		String appt ="";
		for(Vaccine v: getVaccine())
			for(Batch b: v.getBatches())
				for(Vaccination vac: b.getVaccinations())
					if(vac.getStatus() == Status.PENDING || vac.getStatus() == Status.CONFIRM) {
						appt = appt + vac.toString() + "\n";
					}
		return appt;
	}
	
	
	//To display and sort all the users according to the criteria in check
	public String sortUsers(String check) {
		ArrayList<User> user = (ArrayList<User>) getUser();
		ArrayList<User> sameUser = (ArrayList<User>) user.clone();
		if(check.equalsIgnoreCase("fullname")) {
			Collections.sort(sameUser);
		}
		String allUsers = "";
		for(User aUser: sameUser)
			allUsers += aUser + "\n";
		return allUsers;
	}
	
	
}
