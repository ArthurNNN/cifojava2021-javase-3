package model;

import java.util.List;

import interfaces.CredentialsCalculations;
import interfaces.HolidaysCalculations;

public class Member extends User implements CredentialsCalculations, HolidaysCalculations {
	private List<HolidaysCalculations> holidays;
	private CredentialsCalculations credentials;

	public Member() {
		super();
	}

	@Override
	public void managmentCredentials() {
// TODO Auto-generated method stub
	}

	@Override
	public void calcultateHolidays() {

// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		return "Member [holidays=" + holidays + ", credentials=" + credentials + "]";
	}

	public void setId(int i) {
		// TODO Auto-generated method stub
		
	}
}