package online;

//각 Item별 필요요소, getter,setter설정
public class Item {
	private String no;
	private String title;
	private int price;
	private int amount;

public String getNo() {
	return no;
}
public void setNo(String no) {
	this.no = no;
}
public String gettitle() {
	return title;
}
public void settitle(String title) {
	this.title = title;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getAmount() {
	return amount;
}
public void setAmount(int amount) {
	this.amount = amount;
}
//출력시 나오는자료
@Override
public String toString() {
	String result= "Item[no=" + no + ",title=" + title + ",price=" + price + ",amount=" + amount + "]";
	return result;
}


}
