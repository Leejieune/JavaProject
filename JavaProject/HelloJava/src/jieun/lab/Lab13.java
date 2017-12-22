package jieun.lab;

public class Lab13 {
	// public static void main(String[] args) {
	// // 37.Person,Customer클래스를 설계하라
	// System.out.println("<<<<Person>>>>");
	//
	// Person p = new Person();
	// System.out.println(p);
	//
	// Person 지현 = new Person("지현", "인천", "987-213");
	// System.out.println(지현);
	//
	// // p = new Person("지은", "서울시", "44567175");
	// System.out.printf("%s, %s, %s \n", p.getName(), p.getAddr(),
	// p.getPhonenum());
	// System.out.println(p);
	//
	// System.out.println("\n<<<<Customer>>>>");
	// Customer c = new Customer();
	// System.out.println(c);
	//
	// System.out.printf("%s, %s, %s %s %d \n", c.getName(), c.getAddr(),
	// c.getPhonenum(), c.getNum(), c.getMilige());
	// System.out.println(c);
	//
	// // 38.Book,Magazine클래스를 설계하라.
	// System.out.println("\n<<<<BOOK>>>>");
	// Book b = new Book();
	// System.out.println(b);
	//
	// System.out.printf("%s,%d,%s \n", b.getTitle(), b.getPageNum(),
	// b.getAuthor());
	// System.out.println(b);
	//
	// System.out.println("\n<<<<MAGAZINE>>>>");
	// Magazine m = new Magazine();
	// System.out.println(m);
	//
	// System.out.printf("%s,%d,%s %s \n", m.getTitle(), m.getPageNum(),
	// m.getAuthor(), m.getDate());
	// System.out.println(m);
	//
	// // 39. Phone, SmartPhone
	// System.out.println("\n<<<<PHONE>>>>");
	// Phone pn = new Phone();
	// System.out.println(pn);
	//
	// System.out.printf("%s,%d %s \n", pn.getMaker(), pn.getPrice(),
	// pn.getComuType());
	// System.out.println(pn);
	//
	// System.out.println("\n<<<<SMARTPHONE>>>>");
	// SmartPhone sp = new SmartPhone();
	// System.out.println(sp);
	//
	// System.out.printf("%s,%d %s %s %s %s \n", sp.getMaker(), sp.getPrice(),
	// sp.getComuType(), sp.getVersion(),
	// sp.getCamera(), sp.getBluetooth());
	// System.out.println(sp);
	//
	// }
	// }
	//
	// class Person {
	// // 멤버변수는 private로 선언!
	// private String name;
	// private String addr;
	// private String phonenum;
	//
	// // 생성자
	// public Person(String name, String addr, String phonenum) {
	// super();
	// this.name = name;
	// this.addr = addr;
	// this.phonenum = phonenum;
	// }
	//
	// public Person() {
	// this("혜교", "서울", "1234567");
	// }
	//
	// // setget
	// public String getName() {
	// return name;
	// }
	//
	// public void setName(String name) {
	// this.name = name;
	// }
	//
	// public String getAddr() {
	// return addr;
	// }
	//
	// public void setAddr(String addr) {
	// this.addr = addr;
	// }
	//
	// public String getPhonenum() {
	// return phonenum;
	// }
	//
	// public void setPhonenum(String phonenum) {
	// this.phonenum = phonenum;
	// }
	//
	// // toString()
	//
	// @Override
	// public String toString() {
	// return "Person [name=" + name + ", addr=" + addr + ", phonenum=" + phonenum +
	// "]";
	// }
	// }
	//
	// class Customer {
	// private String num;
	//
	// private String name;
	// private String addr;
	// private String phonenum;
	// private int mileage;
	//
	// public Customer(String name, String addr, String phonenum, String num, int
	// milige) {
	// super();
	// this.num = num;
	//
	// this.name = name;
	// this.addr = addr;
	// this.phonenum = phonenum;
	// this.mileage = mileage;
	// }
	//
	// public Customer() {
	// this("1", "혜교", "서울", "1234567", 1000);
	// }
	//
	// public String getName() {
	// return name;
	// }
	//
	// public void setName(String name) {
	// this.name = name;
	// }
	//
	// public String getAddr() {
	// return addr;
	// }
	//
	// public void setAddr(String addr) {
	// this.addr = addr;
	// }
	//
	// public String getPhonenum() {
	// return phonenum;
	// }
	//
	// public void setPhonenum(String phonenum) {
	// this.phonenum = phonenum;
	// }
	//
	// public String getNum() {
	// return num;
	// }
	//
	// public void setNum(String num) {
	// this.num = num;
	// }
	//
	// public int getMilige() {
	// return mileage;
	// }
	//
	// public void setMilige(int milige) {
	// this.mileage = milige;
	// }
	//
	// @Override
	// public String toString() {
	// return "Customer [name=" + name + ", addr=" + addr + ", phonenum=" + phonenum
	// + ", num=" + num + ", milige="
	// + mileage + "]";
	// }
	//
	// }
	//
	////
	// class Book {
	// private String title;
	// private int pageNum;
	// private String author;
	//
	// public Book(String title, int pageNum, String author) {
	// super();
	// this.title = title;
	// this.pageNum = pageNum;
	// this.author = author;
	// }
	//
	// public Book() {
	// this("자바의 정석", 521, "남궁 성");
	// }
	//
	// public String getTitle() {
	// return title;
	// }
	//
	// public void setTitle(String title) {
	// this.title = title;
	// }
	//
	// public int getPageNum() {
	// return pageNum;
	// }
	//
	// public void setPageNum(int pageNum) {
	// this.pageNum = pageNum;
	// }
	//
	// public String getAuthor() {
	// return author;
	// }
	//
	// public void setAuthor(String author) {
	// this.author = author;
	// }
	//
	// @Override
	// public String toString() {
	// return "Book [title=" + title + ", pageNum=" + pageNum + ", author=" + author
	// + "]";
	// }
	//
	// }
	//
	// class Magazine {
	// private String title;
	// private int pageNum;
	// private String author;
	// private String date;
	//
	// public Magazine(String title, int pageNum, String author, String date) {
	// super();
	// this.title = title;
	// this.pageNum = pageNum;
	// this.author = author;
	// this.date = date;
	// }
	//
	// public Magazine() {
	// this("자바", 345, "냠궁", "2017-11-18");
	// }
	//
	// public String getTitle() {
	// return title;
	// }
	//
	// public void setTitle(String title) {
	// this.title = title;
	// }
	//
	// public int getPageNum() {
	// return pageNum;
	// }
	//
	// public void setPageNum(int pageNum) {
	// this.pageNum = pageNum;
	// }
	//
	// public String getAuthor() {
	// return author;
	// }
	//
	// public void setAuthor(String author) {
	// this.author = author;
	// }
	//
	// public String getDate() {
	// return date;
	// }
	//
	// public void setDate(String date) {
	// this.date = date;
	// }
	//
	// @Override
	// public String toString() {
	// return "Magazine [title=" + title + ", pageNum=" + pageNum + ", author=" +
	// author + ", date=" + date + "]";
	// }
	//
	// }
	//
	// class Phone {
	// private String maker;
	// private int price;
	// private String comuType;
	//
	// public Phone(String maker, int price, String comuType) {
	// super();
	// this.maker = maker;
	// this.price = price;
	// this.comuType = comuType;
	// }
	//
	// public Phone() {
	// this("samsung", 500000, "4g");
	// }
	//
	// public String getMaker() {
	// return maker;
	// }
	//
	// public void setMaker(String maker) {
	// this.maker = maker;
	// }
	//
	// public int getPrice() {
	// return price;
	// }
	//
	// public void setPrice(int price) {
	// this.price = price;
	// }
	//
	// public String getComuType() {
	// return comuType;
	// }
	//
	// public void setComuType(String comuType) {
	// this.comuType = comuType;
	// }
	//
	// @Override
	// public String toString() {
	// return "Phone [maker=" + maker + ", price=" + price + ", comuType=" +
	// comuType + "]";
	// }
	//
	// }
	//
	// class SmartPhone {
	// private String maker;
	// private int price;
	// private String comuType;
	// private String version;
	// private String innerSize;
	// private boolean isCamera;
	// private boolean isBluetooth;
	//
	// public SmartPhone(String maker, int price, String comuType, String version,
	// String innerSize, boolean isCamera,
	// boolean isBluetooth) {
	// super();
	// this.maker = maker;
	// this.price = price;
	// this.comuType = comuType;
	// this.version = version;
	// this.innerSize = innerSize;
	// this.isCamera = isCamera;
	// this.isBluetooth = isBluetooth;
	// }
	//
	// public SmartPhone() {
	// this("IPHONE", 700000, "4g", "10v", "16g", false, true);
	// }
	//
	// public String getMaker() {
	// return maker;
	// }
	//
	// public void setMaker(String maker) {
	// this.maker = maker;
	// }
	//
	// public int getPrice() {
	// return price;
	// }
	//
	// public void setPrice(int price) {
	// this.price = price;
	// }
	//
	// public String getComuType() {
	// return comuType;
	// }
	//
	// public void setComuType(String comuType) {
	// this.comuType = comuType;
	// }
	//
	// public String getVersion() {
	// return version;
	// }
	//
	// public void setVersion(String version) {
	// this.version = version;
	// }
	//
	// public String getInnerSize() {
	// return innerSize;
	// }
	//
	// public void setInnerSize(String innerSize) {
	// this.innerSize = innerSize;
	// }
	//
	// public boolean getCamera() {
	// return isCamera;
	// }
	//
	// public void setCamera(boolean camera) {
	// this.isCamera = isCamera;
	// }
	//
	// public boolean getBluetooth() {
	// return isBluetooth;
	// }
	//
	// public void setBluetooth(boolean bluetooth) {
	// this.isBluetooth = isBluetooth;
	// }
	//
	// @Override
	// public String toString() {
	// return "SmartPhone [maker=" + maker + ", price=" + price + ", comuType=" +
	// comuType + ", version=" + version
	// + ", innerSize=" + innerSize + ", camera=" + isCamera + ", bluetooth=" +
	// isBluetooth + "]";
	// }

}