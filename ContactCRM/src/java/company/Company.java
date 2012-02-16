package company;

import contact.Contact;

public class Company {
	String companyName;
	String address;
	Contact mainContact;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Contact getMainContact() {
		return mainContact;
	}
	public void setMainContact(Contact mainContact) {
		this.mainContact = mainContact;
	}
	
	
	
}
