package com.xworkz.xworkzapp.Hospital;

public class HospitalDaoImpl implements HospitalDao {
//HospitalService serviceImpl = new HostpitalServiceImpl();  loop
	HospitalDto[] info = new HospitalDto[3];
	int index = 0;

	@Override
	public void add(HospitalDto dto) {
		this.info[index] = dto;
		index++;
	}

	@Override
	public void update(String licence, String name) {
		for (int i = 0; i < index; i++) {
			if (info[i].getLicenceNo() == licence) {
				info[i].setName(name);
			}

		}
	}

	@Override
	public void display() {
		for (int i = 0; i < index; i++) {

			System.out.println(info[i].getLicenceNo() + ":" + info[i].getName() + ":" + info[i].getLocation() + ":"
					+ info[i].getPhNo());
		}
	}

	@Override
	public void display(String licence) {
		for (int i = 0; i < info.length; i++) {
			if (info[i].getLicenceNo() == licence) {
				System.out.println(info[i].getLicenceNo() + ":" + info[i].getName() + ":" + info[i].getLocation() + ":"
						+ info[i].getPhNo());
			}
		}

	}

	@Override
	public void delete(String licence) {
		for (int i = 0; i < index; i++) {
			if (info[i].getLicenceNo() == licence) {
				info[i].setLicenceNo(null);
				info[i].setFounder(null);
				info[i].setLocation(null);
				info[i].setName(null);
				info[i].setPhNo(null);
				info[i].setSpecilaization(null);

			}
		}
	}

}
