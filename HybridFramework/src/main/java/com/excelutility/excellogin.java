package com.excelutility;

import java.io.FileInputStream;
import java.io.IOException;

public class excellogin {
public String excel_username(int a)throws IOException{
	FileInputStream fil=new FileInputstream(new File(""));
	XSSFWorkbook workbook=new XSSFWorkbook(fil);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int count=sheet.getLastRowNum();
	System.out.println(count);
	XSSFRow row=sheet.getRow(a);
	XSSFCell cell=row.getCell(0);
	String un=cell.getStringCellValue();
	return un;
	
}
	//to read and return the password
public String excel_password(int b)throws IOException{
	FileInputStream fil=new FileInputstream(new File(""));
	XSSFWorkbook workbook=new XSSFWorkbook(fil);
	XSSFSheet sheet=workbook.getSheet("Sheet1");
	int count=sheet.getLastRowNum();
	System.out.println(count);
	XSSFRow row=sheet.getRow(b);
	XSSFCell cell=row.getCell(1);
	String pwd=cell.getStringCellValue();
	return pwd;
	
}
}
