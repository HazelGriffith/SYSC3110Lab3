public class BuddyInfo {
	private String number;
	private String address;
	private String name;
	
	/**
	 * @param number
	 * @param address
	 * @param name
	 */
	public BuddyInfo(String number, String address, String name) {
		this.number = number;
		this.address = address;
		this.name = name;
	}

	/**
	 * @return the number
	 */
	private String getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	private void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the address
	 */
	private String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	private void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the name
	 */
	private String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	private void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return String
	 */
	public String toString() {
		return this.name + " " + this.address + " " + this.number;
	}
	
	/**
	 * @param BuddyInfo object
	 */
	private Boolean equals(BuddyInfo buddy) {
		if (this.toString().equals(buddy.toString())) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		BuddyInfo buddy = new BuddyInfo("6135555555", "570 Skully Dr.", "Billy McFarlane");
		System.out.println("Hello " + buddy.getName());
	}

}