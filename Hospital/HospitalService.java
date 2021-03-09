package com.xworkz.xworkzapp.Hospital;

public interface HospitalService {
public boolean validateDetails(HospitalDto dto);
public boolean validateUpdate(String licence,String name);
public boolean validateDisplay(String licence);
public boolean validateDelete(String licence);
public void display();
}
