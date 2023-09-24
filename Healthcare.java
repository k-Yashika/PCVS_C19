package pcvs;

import java.util.ArrayList;
import java.util.List;

/*
 * Java: JavaSE - 16
 * Date: 18/10/2021*/

/* the healthcare class that holds a collection of healthcare objects*/
public class Healthcare {

	private String centreName;
	private String address;
	private List<Admin> admins;
	private List<Batch> batches;
	
	/**
	 * @param centreName
	 * @param address
	 */
	public Healthcare(String centreName, String address) {
		this.centreName = centreName;
		this.address = address;
		setAdmins(new ArrayList<Admin>());
		setBatches(new ArrayList<Batch>());
	}
	
	public void addAdmin(Admin a) {
		getAdmins().add(a);
		a.setHealthcare(this);
	}
	
	public void addBatch(Batch b) {
		getBatches().add(b);
	}
	
	public Admin findAdmin(int staffId) {
		return getAdmins().stream()
				.filter(x -> x.getStaffID() == (staffId))
				.findAny()
				.orElse(null);
	}
	
	public Batch findBatch(String batchNo) {
		return getBatches().stream()
				.filter(x -> x.getBatchNo().equalsIgnoreCase(batchNo))
				.findAny()
				.orElse(null);
	}
	/**
	 * @return the admins
	 */
	public List<Admin> getAdmins() {
		return admins;
	}


	/**
	 * @param admins the admins to set
	 */
	public void setAdmins(List<Admin> admins) {
		this.admins = admins;
	}


	/**
	 * @return the batches
	 */
	public List<Batch> getBatches() {
		return batches;
	}

	/**
	 * @param batches the batches to set
	 */
	public void setBatches(List<Batch> batches) {
		this.batches = batches;
	}

	/**
	 * @return the centreName
	 */
	public String getCentreName() {
		return centreName;
	}
	/**
	 * @param centreName the centreName to set
	 */
	public void setCentreName(String centreName) {
		this.centreName = centreName;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
}
