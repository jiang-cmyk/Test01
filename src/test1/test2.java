package test1;

import java.text.SimpleDateFormat;
import java.util.Date;

import main.java.caculate;

public class test2 {

	public static void main(String[] args) throws Exception {

		String Input = "C:\\Users\\ABC\\Desktop\\2022-10\\data20221024";
		String Output = "C:/Users/ABC/Desktop/Output";
		Date stdate =new SimpleDateFormat("yyyy-MM-dd").parse("2022-09-25");
		Date endate =new SimpleDateFormat("yyyy-MM-dd").parse("2022-10-24");

		caculate caculate = new caculate();
		caculate.run(Input, Output, stdate, endate);
	}
}
