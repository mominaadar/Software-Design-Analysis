
// MOMINA ATIF DAR P18-0030

package com.vogella.eclipse.ide.first;

public class MyDate {
	
	public int month, day, year;
	
	//Constructor
	public MyDate() {
		month = 0;
		day = 0;
		year = 0;
	}
	
	public void set_month(int m) {
		month = m;
	}
	
	public int get_month() {
		return month;
	}
	
	public void set_day(int d) {
		day = d;
	}
	
	public int get_day() {
		return day;
	}
	
	public void set_year(int y) {
		year = y;
	}
	
	public int get_year() {
		return year;
	}
	
	public void displayDate(int d, int m, int y) {
		System.out.println(d+"/"+m+ "/"+y);
	}
	
	
	public boolean equals(MyDate d) {
		if (this.get_day() == d.get_day() && this.get_month() == d.get_month() && this.get_year() == d.get_year()) {
			return true;
			
		}
		else {
			return false;
		}
		
	}
	
	public MyDate differenceDates(MyDate d) {
		
		MyDate date3 = new MyDate();
		
		int d1 = this.get_day()-d.get_day();
		date3.set_day(d1);
		int m1 = this.get_month()-d.get_month();
		date3.set_month(m1);
		int y1 = this.get_year()-d.get_year();
		date3.set_year(y1);
		return date3;
		
	}
	
	
	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		MyDate date2 = new MyDate();
		
		date.set_day(10);
		date.set_month(10);
		date.set_year(1998);
		
		date2.set_day(23);
		date2.set_month(11);
		date2.set_year(2019);
		
		date.displayDate(date.get_day(),date.get_month(),date.get_year());
		
		System.out.println("----------------------");

		
		boolean val = date.equals(date2);
		
		System.out.println(val);
		
		MyDate obj = date.differenceDates(date2);
		System.out.println(obj.get_day()+"/"+ obj.get_month()+ "/"+obj.get_year());
		
	}
	
}
