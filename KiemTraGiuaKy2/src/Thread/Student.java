package Thread;

import java.util.Date;

public class Student {
	private String id;
	private String name;
	private String address;
	private Date dateOfBirthl;

	public Student(String id, String name, String address, Date dateOfBirthl) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.dateOfBirthl = dateOfBirthl;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfBirthl() {
		return dateOfBirthl;
	}

	public void setDateOfBirthl(Date dateOfBirthl) {
		this.dateOfBirthl = dateOfBirthl;
	}

}
