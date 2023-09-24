package pcvs;

/*
 * Java: JavaSE - 16
 * Date: 18/10/2021*/

/* the vaccination class that holds a collection of vaccination objects*/

import java.time.LocalDate;

public class Vaccination {
	
	public enum Status{
		PENDING, CONFIRM, REJECTED, ADMINISTERED; 
	}

	static int genVaccinationID = 1;
	private int vaccinationID;
	private LocalDate appointmentDate;
	private Status status;
	private String remarks;
	private Vaccine vaccine;
	
	/**
	 * @param vaccinationID
	 * @param appointmentDate
	 * @param status
	 * @param remarks
	 * @param vaccine
	 * @param patient
	 */
	public Vaccination(LocalDate appointmentDate) {
		setVaccinationID(genVaccinationID++);
		setAppointmentDate(appointmentDate);
		setStatus(Status.PENDING);
		setRemarks("");
	}
	
	public Vaccine getVaccine() {
		return vaccine;
	}
	
	public void setVaccine(Vaccine vaccine) {
		this.vaccine = vaccine;
	}
	
	/**
	 * @return the vaccinationID
	 */
	public int getVaccinationID() {
		return vaccinationID;
	}
	
	public void setVaccinationID(int vaccinationID) {
		this.vaccinationID = vaccinationID;
	}
	
	public static int getVaccinationIDGen() {
		return genVaccinationID;
	}
	
	public static void setVaccinationIDGen(int vaccinationIDGen) {
		Vaccination.genVaccinationID = vaccinationIDGen;
	}
	/**
	 * @return the appointmentDate
	 */
	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}
	/**
	 * @param appointmentDate the appointmentDate to set
	 */
	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}
	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	

}
