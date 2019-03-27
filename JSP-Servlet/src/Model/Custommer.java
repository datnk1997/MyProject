package Model;

import java.io.Serializable;

public class Custommer implements Serializable{
	private int Cusid;
	private String Uname;
	private String  Pword;
	private String Name;
	private String Adress;
	private String Phone;
	public Custommer() {
		super();
	}
	
	
	
	public Custommer(int cusid, String uname, String pword, String name, String adress, String phone) {
		super();
		Cusid = cusid;
		Uname = uname;
		Pword = pword;
		Name = name;
		Adress = adress;
		Phone = phone;
	}



	public Custommer(String uname, String pword, String name, String adress, String phone) {
		super();
		Uname = uname;
		Pword = pword;
		Name = name;
		Adress = adress;
		Phone = phone;
	}
	

	public int getCusid() {
		return Cusid;
	}

	public void setCusid(int cusid) {
		Cusid = cusid;
	}

	public String getUname() {
		return Uname;
	}
	public void setUname(String uname) {
		Uname = uname;
	}
	public String getPword() {
		return Pword;
	}
	public void setPword(String pword) {
		Pword = pword;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAdress() {
		return Adress;
	}
	public void setAdress(String adress) {
		Adress = adress;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}

	@Override
	public String toString() {
		return "Custommer [Cusid=" + Cusid + ", Uname=" + Uname + ", Pword=" + Pword + ", Name=" + Name + ", Adress="
				+ Adress + ", Phone=" + Phone + "]";
	}
	
	
	
}
