package com.xworkz.xworkzapp.Hospital;

public interface HospitalDao {
public void add(HospitalDto dto);
public void update(String licence,String name);
public void display();
public void display(String licence);
public void delete(String licence);
}
