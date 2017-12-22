package jieun.lab;

public class Lab16 {
	public static void main(String[] args) {
		// 37.Person,Customer클래스를 설계하라
		Person p = new Person();

		System.out.printf("%s, %s, %s \n", p.getName(), p.getAddr(), p.getPhonenum());
		System.out.println(p);

		// 38.Book,Magazine클래스를 설계하라.
		Book b = new Book();
		System.out.println(b);

		Magazine m = new Magazine();
		System.out.println(m);

		// 39. Phone, SmartPhone
		Phone pn = new Phone();
		System.out.println(pn);

		SmartPhone sp = new SmartPhone();
		System.out.println(sp);
	}
}

class Person {
	// 멤버변수는 private로 선언!
	private String name;
	private String addr;
	private String phonenum;

	// 생성자
	public Person(String name, String addr, String phonenum) {
		super();
		this.name = name;
		this.addr = addr;
		this.phonenum = phonenum;
	}

	public Person() {
		this("혜교", "서울", "1234567");
	}

	// setget
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhonenum() {
		return phonenum;
	}

	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}

}

class Customer extends Person {

	private String phonenum;
	private int mileage;

	public Customer(String phonenum, int milige) {
		super();

		this.phonenum = phonenum;
		this.mileage = mileage;
	}

}

class Book {
	private String title;
	private int pageNum;
	private String author;

	public Book(String title, int pageNum, String author) {
		super();
		this.title = title;
		this.pageNum = pageNum;
		this.author = author;
	}

	public Book() {
		this("자바의 정석", 521, "남궁 성");
	}

}

class Magazine extends Book {

	private String date;

	public Magazine() {
		super();

		this.date = date;
	}

	// public Magazine() {
	// this,"2017-11-18");
}

class Phone {
	private String maker;
	private int price;
	private String comuType;

	public Phone(String maker, int price, String comuType) {
		super();
		this.maker = maker;
		this.price = price;
		this.comuType = comuType;
	}

	public Phone() {
		this("samsung", 500000, "4g");
	}

}

class SmartPhone extends Phone {
	private String version;
	private String innerSize;
	private boolean isCamera;
	private boolean isBluetooth;

	public SmartPhone(String maker, int price, String comuType, String version, String innerSize, boolean isCamera,
			boolean isBluetooth) {
		super();

		this.version = version;
		this.innerSize = innerSize;
		this.isCamera = isCamera;
		this.isBluetooth = isBluetooth;
	}

	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}
}
