package com.xworkz.xworkzapp.Hospital;

public class HospitalTester {

	public static void main(String[] args) {
		// public HospitalDto(String licenceNo, String name, String location, String
		// founder, String specilaization,
		// String phNo) {

		HospitalDto dto = new HospitalDto("123ABCDE", "abc1234", "bangalor", "xyzasds", "clinic", "1356451234");
		HospitalDto dto1 = new HospitalDto("456ADCBA", "def5412", "manglore", "uvwsdss", "neuro", "8952351234");
		HospitalDto dto2 = new HospitalDto("789ANBSH", "ghi8956", "gulbarga", "lmnsddf", "cardio", "2554963123");
		HospitalDaoImpl dao = new HospitalDaoImpl();
		HostpitalServiceImpl service = new HostpitalServiceImpl();
		service.validateDetails(dto);
		service.validateDetails(dto1);
		service.validateDetails(dto2);
		
		service.validateDisplay("456ADCBA");
		service.display();
		service.validateUpdate("456ADCBA", "asdfghj");
		service.display();
		service.validateDelete("456ADCBA");
		service.display();
	}

}
