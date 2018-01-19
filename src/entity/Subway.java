package entity;

public class Subway {
	private int id;
	private String name;
	private String sf;
	private String zd;
	private int count;
	private String first;
	private int price;
	
	public Subway() {
		super();
	}

	public Subway(String name, String sf, String zd, int count, String first, int price) {
		super();
		this.name = name;
		this.sf = sf;
		this.zd = zd;
		this.count = count;
		this.first = first;
		this.price = price;
	}

	public Subway(int id, String name, String sf, String zd, int count, String first, int price) {
		super();
		this.id = id;
		this.name = name;
		this.sf = sf;
		this.zd = zd;
		this.count = count;
		this.first = first;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSf() {
		return sf;
	}

	public void setSf(String sf) {
		this.sf = sf;
	}

	public String getZd() {
		return zd;
	}

	public void setZd(String zd) {
		this.zd = zd;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
}
