package Model;

import java.io.Serializable;

public class Categories implements Serializable{
	private int Cid;
	private String Cname;
	public Categories() {
		// TODO Auto-generated constructor stub
	}
	public Categories(int cid, String cname) {
		super();
		Cid = cid;
		Cname = cname;
	}
	public int getCid() {
		return Cid;
	}
	public void setCid(int cid) {
		Cid = cid;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	
}
