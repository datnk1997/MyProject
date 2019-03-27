package aht.company.model;

public class Employee {
	private String conpany;
	private String mnv, hoten, ca, ra; 
	
	public  Employee() {
		// TODO Auto-generated method stub

	}
	
	public Employee(String conpany, String mnv, String hoten, String ca, String ra) {
		super();
		this.conpany = conpany;
		this.mnv = mnv;
		this.hoten = hoten;
		this.ca = ca;
		this.ra = ra;
	}

	public String getConpany() {
		return conpany;
	}

	public void setConpany(String conpany) {
		this.conpany = conpany;
	}

	public String getMnv() {
		return mnv;
	}

	public void setMnv(String mnv) {
		this.mnv = mnv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getCa() {
		return ca;
	}

	public void setCa(String ca) {
		this.ca = ca;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	@Override
	public String toString() {
		return "Employee [ hoten=" + mnv + ", ngay=" + hoten + ", den=" + ca + ", ve=" + ra + "]";
	}

	
	
	
	
	
}
