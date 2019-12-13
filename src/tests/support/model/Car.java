package tests.support.model;

public class Car {

	private String carPhotoPath;
	private String carName;
	private boolean status;
	private int carPrice;

	public Car(String carPhotoPath, String carName, boolean status, int carPrice) {
		this.carPhotoPath = carPhotoPath;
		this.carName = carName;
		this.status = status;
		this.carPrice = carPrice;
	}

	public String getCarPhotoPath() {
		return carPhotoPath;
	}

	public void setCarPhotoPath(String carPhotoPath) {
		this.carPhotoPath = carPhotoPath;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
}
