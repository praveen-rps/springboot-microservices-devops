package springcore;

public class DbConn {
	
	String driver;
	
	
	
	public String getDriver() {
		return driver;
	}



	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void init() {
		System.out.println("Datbase connection is established...");
	}

	public void destroy() {
		System.out.println("Database connection is removed....");
	}
	void executeTransactions() {
		System.out.println("DML operations are executed..");
	}

}
