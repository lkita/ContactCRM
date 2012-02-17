package company;

import java.util.List;

import contact.Contact;

public class Company {
	String companyName;
	String address;
	String specialty;
	Contact mainContact;
	List<Contact> employees;

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
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public void addEmployees(Contact employee){
		employees.add(employee);
	}

}
