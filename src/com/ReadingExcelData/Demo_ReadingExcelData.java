package com.ReadingExcelData;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo_ReadingExcelData {

	public static void main(String[] args) throws Exception {

		String xcelfilepath = "G:\\javaprogram\\Java_Selenium\\DataFiles\\ExcelData.xlsx";

		FileInputStream file = new FileInputStream(xcelfilepath);

		// XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows = sheet.getLastRowNum() - sheet.getFirstRowNum();
		int cols = sheet.getRow(1).getLastCellNum();

		for (int r = 0; r <= rows; r++) {
			XSSFRow row = sheet.getRow(r);
			if (row != null) {
				for (int c = 0; c <= cols; c++) {
					XSSFCell cell = row.getCell(c);

					switch (cell.getCellType()) {
					case STRING:
						System.out.print(cell.getStringCellValue());
						break;
					case NUMERIC:
						System.out.print(cell.getNumericCellValue());
						break;
					case BOOLEAN:
						System.out.print(cell.getBooleanCellValue());
						break;
					default:
						break;
					}
					System.out.print(" | ");
				}
			}
			System.out.println();
		}
	}
}
