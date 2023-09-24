package pcvs;

/*
 * Java: JavaSE - 16
 * Date: 18/10/2021
 */

/*
the administrator class that displays functions specified to the admin�s role 
 * this class extends the user.java class
 */

public class Admin extends User {
	
	private static int genStaffId = 1;
	private int staffID;
	private Healthcare healthcare;

	/**
	 * @param inUserName
	 * @param inPassWord
	 * @param inEmail
	 * @param inFullName
	 */
	public Admin(String inUserName, String inPassWord, String inEmail, String inFullName) {
		super(inUserName, inPassWord, inEmail, inFullName);
		setStaffID(genStaffId++);
	}


	/**
	 * @return the genStaffId
	 */
	public static int getGenStaffId() {
		return genStaffId;
	}


	/**
	 * @param genStaffId the genStaffId to set
	 */
	public static void setGenStaffId(int genStaffId) {
		Admin.genStaffId = genStaffId;
	}


	/**
	 * @return the healthcare
	 */
	public Healthcare getHealthcare() {
		return healthcare;
	}


	/**
	 * @param healthcare the healthcare to set
	 */
	public void setHealthcare(Healthcare healthcare) {
		this.healthcare = healthcare;
	}


	/**
	 * @return the staffID
	 */
	public int getStaffID() {
		return staffID;
	}

	/**
	 * @param staffID the staffID to set
	 */
	public void setStaffID(int staffID) {
		this.staffID = staffID;
	}

}
