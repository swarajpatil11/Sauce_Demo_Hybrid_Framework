package com.utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	static DataFormatter formatter = new DataFormatter();

	public static String[][] ReadXl() throws Exception {
		String path = System.getProperty("user.dir") + "/src/main/resources/Hybrid_Data.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("swaraj1");

		int NoOfRows = sheet.getPhysicalNumberOfRows();
		int NoOfCell = sheet.getRow(0).getLastCellNum();

		String data[][] = new String[NoOfRows][NoOfCell];
		for (int i = 0; i <NoOfRows; i++) {

			XSSFRow row = sheet.getRow(i);

			for (int j = 0; j < NoOfCell; j++) {
				XSSFCell cell = row.getCell(j);

				data[i][j] = formatter.formatCellValue(cell);

			}

		}
		return data;

	}

}
