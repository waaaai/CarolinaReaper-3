package model;

import java.util.ArrayList;
import java.util.Calendar;
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Calendar a = Calendar.getInstance();
		Calendar b = a;
		//b.set(Calendar.YEAR, 2010);
		//System.out.println(a.getTime());
		String str ="a";
		ArrayList<String> list= new ArrayList<String> ();
		list.add(str);

		Event testEvent =  new Event(str,list,list,a,
									str,str,b,list,
									a,2,3,str,
									str,str,list);

		testEvent.setDeadlineDate(25);
		System.out.println(testEvent.getDeadlineDate());
	//	System.out.println(a.);

	}
}