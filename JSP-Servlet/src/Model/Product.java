package Model;

import java.io.Serializable;

public class Product implements Serializable{
	private int Pid;
	private Categories categories;
	private String Pname;
	private String Note;
	private int Price;
	private String picture;
	private String Manhinh;
	private String CPU;
	private String Hedieuhanh;
	private String Ram;
	private String Bonhotrong;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Categories categories, String pname, String note, int price, String picture, String manhinh,
			String cPU, String hedieuhanh, String ram, String bonhotrong) {
		super();
		this.categories = categories;
		Pname = pname;
		Note = note;
		Price = price;
		this.picture = picture;
		Manhinh = manhinh;
		CPU = cPU;
		Hedieuhanh = hedieuhanh;
		Ram = ram;
		Bonhotrong = bonhotrong;
	}
	

	public Product(int pid, Categories categories, String pname, String note, int price, String picture, String manhinh,
			String cPU, String hedieuhanh, String ram, String bonhotrong) {
		super();
		Pid = pid;
		this.categories = categories;
		Pname = pname;
		Note = note;
		Price = price;
		this.picture = picture;
		Manhinh = manhinh;
		CPU = cPU;
		Hedieuhanh = hedieuhanh;
		Ram = ram;
		Bonhotrong = bonhotrong;
	}
	

	public Product(int pid, String pname, String note, int price, String picture, String manhinh, String cPU,
			String hedieuhanh, String ram, String bonhotrong) {
		super();
		Pid = pid;
		Pname = pname;
		Note = note;
		Price = price;
		this.picture = picture;
		Manhinh = manhinh;
		CPU = cPU;
		Hedieuhanh = hedieuhanh;
		Ram = ram;
		Bonhotrong = bonhotrong;
	}

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public String getNote() {
		return Note;
	}

	public void setNote(String note) {
		Note = note;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getManhinh() {
		return Manhinh;
	}

	public void setManhinh(String manhinh) {
		Manhinh = manhinh;
	}

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	public String getHedieuhanh() {
		return Hedieuhanh;
	}

	public void setHedieuhanh(String hedieuhanh) {
		Hedieuhanh = hedieuhanh;
	}

	public String getRam() {
		return Ram;
	}

	public void setRam(String ram) {
		Ram = ram;
	}

	public String getBonhotrong() {
		return Bonhotrong;
	}

	public void setBonhotrong(String bonhotrong) {
		Bonhotrong = bonhotrong;
	}

	@Override
	public String toString() {
		return "Product [Pid=" + Pid + ", categories=" + categories + ", Pname=" + Pname + ", Note=" + Note + ", Price="
				+ Price + ", picture=" + picture + ", Manhinh=" + Manhinh + ", CPU=" + CPU + ", Hedieuhanh="
				+ Hedieuhanh + ", Ram=" + Ram + ", Bonhotrong=" + Bonhotrong + "]";
	}

	

	
	

}
