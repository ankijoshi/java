package com.inherit.implemnts;

public class UKgovt implements USgovt, Canadagovt{
//mandatory to define all interface methods
//means overriding mandatory here.
	
	@Override
	public void savings() {
		System.out.println("Savings from USgovt");
	}

	@Override
	public void incometax() {
		System.out.println("incometax from USgovt");
	}
	
	@Override
	public void generaltax() {
		System.out.println("General Tax from Canadagovt");
	}
	
	public void plans(){
		System.out.println("OUR UK plans");
	}

	
}
