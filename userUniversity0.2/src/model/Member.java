package model;

import java.util.List;

import interfaces.CredentialsCalculations;
import interfaces.HolidaysCalculations;

public class Member extends User implements CredentialsCalculations, HolidaysCalculations {
	public int id;
	private List<HolidaysCalculations> holidays;
	private CredentialsCalculations credentials;

	public Member() {
		super();
	}

	
	@Override
	public void managmentCredentials() {
// TODO Auto-generated method stub
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public List<HolidaysCalculations> getHolidays() {
		return holidays;
	}


	public void setHolidays(List<HolidaysCalculations> holidays) {
		this.holidays = holidays;
	}


	public CredentialsCalculations getCredentials() {
		return credentials;
	}


	public void setCredentials(CredentialsCalculations credentials) {
		this.credentials = credentials;
	}


	@Override
	public void calcultateHolidays() {

// TODO Auto-generated method stub
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", holidays=" + holidays + ", credentials=" + credentials + "]";
	}
	
	


}