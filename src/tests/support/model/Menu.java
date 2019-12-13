package tests.support.model;

public class Menu {

	private String dashboardName;
	private String updatesName;
	private String modulesName;
	private String addTourName;
	private String couponName;
	private String newsletterManagementName;
	private String bookingManagementName;
	private String carsManagementName;

	public Menu(String dashboardName, String updatesName, String modulesName, String addTourName, String couponName,
			String newsletterManagementName, String bookingManagementName, String carsManagementName) {
		super();
		this.dashboardName = dashboardName;
		this.updatesName = updatesName;
		this.modulesName = modulesName;
		this.addTourName = addTourName;
		this.couponName = couponName;
		this.newsletterManagementName = newsletterManagementName;
		this.bookingManagementName = bookingManagementName;
		this.carsManagementName = carsManagementName;
	}

	public String getDashboardName() {
		return dashboardName;
	}

	public void setDashboardName(String dashboardName) {
		this.dashboardName = dashboardName;
	}

	public String getUpdatesName() {
		return updatesName;
	}

	public void setUpdatesName(String updatesName) {
		this.updatesName = updatesName;
	}

	public String getModulesName() {
		return modulesName;
	}

	public void setModulesName(String modulesName) {
		this.modulesName = modulesName;
	}

	public String getAddTourName() {
		return addTourName;
	}

	public void setAddTourName(String addTourName) {
		this.addTourName = addTourName;
	}

	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getNewsletterManagementName() {
		return newsletterManagementName;
	}

	public void setNewsletterManagementName(String newsletterManagementName) {
		this.newsletterManagementName = newsletterManagementName;
	}

	public String getBookingManagementName() {
		return bookingManagementName;
	}

	public void setBookingManagementName(String bookingManagementName) {
		this.bookingManagementName = bookingManagementName;
	}

	public String getCarsManagementName() {
		return carsManagementName;
	}

	public void setCarsManagementName(String carsManagementName) {
		this.carsManagementName = carsManagementName;
	}
}
