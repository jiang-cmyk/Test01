package test1;

import java.text.SimpleDateFormat;
import java.util.Date;

import main.java.caculate;

public class test2 {

	public static void main(String[] args) throws Exception {

		String Input = "C:\\Users\\jiang\\Documents\\WeChat Files\\wxid_pueqh3fdguqv22\\FileStorage\\File\\2023-06";
		String Output = "C:/Users/jiang/Desktop/Output";
		Date stdate =new SimpleDateFormat("yyyy-MM-dd").parse("2023-05-25");
		Date endate =new SimpleDateFormat("yyyy-MM-dd").parse("2023-06-24");

		caculate caculate = new caculate();
		caculate.run(Input, Output, stdate, endate);
	}
}
