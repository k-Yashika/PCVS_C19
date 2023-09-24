package pcvs;

/*
 * Java: JavaSE - 16
 * Date: 18/10/2021*/


/* the batch class that holds a collection of batch objects*/
import java.time.LocalDate;
import java.util.List;

public class Batch {
	private String batchNo;
	private LocalDate expiryDate;
	private String quantityAvailable;
	private String quantityAdministered;
	private List<Vaccination> vaccinations; 
	
	
	/**
	 * @param batchNo
	 * @param expiryDate
	 * @param quantityAvailable
	 * @param quantityAdministered
	 */
	public Batch(String batchNo, LocalDate expiryDate, String quantityAvailable, String quantityAdministered) {
		setBatchNo(batchNo);
		setExpiryDate(expiryDate);
		setQuantityAvailable(quantityAvailable);
		setQuantityAdministered(quantityAdministered);
		setVaccinations(vaccinations);
	}
	
	// to add a new vaccination
	public void addVaccinations(Vaccination v) {
		getVaccinations().add(v);
	}
	
	// to find a vaccination
	public Vaccination findVaccination(int vaccinationID) {
		return getVaccinations().stream()
				.filter(x -> x.getVaccinationID() == (vaccinationID))
				.findAny()
				.orElse(null);
	}
	/**
	 * @return the vaccinations
	 */
	public List<Vaccination> getVaccinations() {
		return vaccinations;
	}

	/**
	 * @param vaccinations the vaccinations to set
	 */
	public void setVaccinations(List<Vaccination> vaccinations) {
		this.vaccinations = vaccinations;
	}

	/**
	 * @return the batchNo
	 */
	public String getBatchNo() {
		return batchNo;
	}
	/**
	 * @param batchNo the batchNo to set
	 */
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	/**
	 * @return the expiryDate
	 */
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	/**
	 * @return the quantityAvailable
	 */
	public String getQuantityAvailable() {
		return quantityAvailable;
	}
	/**
	 * @param quantityAvailable the quantityAvailable to set
	 */
	public void setQuantityAvailable(String quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}
	/**
	 * @return the quantityAdministered
	 */
	public String getQuantityAdministered() {
		return quantityAdministered;
	}
	/**
	 * @param quantityAdministered the quantityAdministered to set
	 */
	public void setQuantityAdministered(String quantityAdministered) {
		this.quantityAdministered = quantityAdministered;
	}
}
