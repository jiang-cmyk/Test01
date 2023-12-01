package test1;

import java.text.SimpleDateFormat;
import java.util.Date;

import main.java.caculate;

public class test2 {

	public static void main(String[] args) throws Exception {

		String Input = "C:\\Users\\ABC\\Documents\\WeChat Files\\wxid_pueqh3fdguqv22\\FileStorage\\File\\2023-11\\月底统计20231127";
		String Output = "C:/Users/ABC/Desktop/Output";
		Date stdate =new SimpleDateFormat("yyyy-MM-dd").parse("2023-10-25");
		Date endate =new SimpleDateFormat("yyyy-MM-dd").parse("2023-11-24");

		caculate caculate = new caculate();
		caculate.run(Input, Output, stdate, endate);
	}
}
