package com.xworkz.xworkzapp.Hospital;

public class HostpitalServiceImpl implements HospitalService {
	HospitalDaoImpl daoImpl = new HospitalDaoImpl();

	@Override
	public boolean validateDetails(HospitalDto dto) {
		boolean isValid = true;
		if (dto.getLicenceNo() == null || dto.getLicenceNo().length() != 8) {
			System.out.println("enter valid licence details");
			isValid = false;
			return isValid;
		}
		if (dto.getName() == null || dto.getName().length() < 6) {
			System.out.println("enter valid name");
			isValid = false;
			return isValid;
		}
		if (dto.getLocation() == null || dto.getLocation().length() < 8) {
			System.out.println("enter valid location");
			isValid = false;
			return isValid;
		}
		if (dto.getFounder() == null || dto.getFounder().length() < 6) {
			System.out.println("enter valid founder");
			isValid = false;
			return isValid;
		}
		if (dto.getSpecilaization() == null || dto.getSpecilaization().length() < 3) {
			System.out.println("enter valid specialization");
			isValid = false;
			return isValid;
		}
		if (dto.getPhNo() == null || dto.getPhNo().length() != 10) {
			System.out.println("enter valid phNO");
			isValid = false;
			return isValid;
		}
		if (isValid) {
			daoImpl.add(dto);
		}

		return isValid;
	}

	@Override
	public boolean validateUpdate(String licence, String name) {
		if (licence != null) {
			daoImpl.update(licence, name);

		}
		return false;
	}

	@Override
	public boolean validateDisplay(String licence) {
		if (licence != null) {
			daoImpl.display(licence);
		}
		return false;
	}

	@Override
	public boolean validateDelete(String licence) {
		if (licence != null) {
			daoImpl.delete(licence);

		}
		return false;
	}

	@Override
	public void display() {
		daoImpl.display();
	}

}
