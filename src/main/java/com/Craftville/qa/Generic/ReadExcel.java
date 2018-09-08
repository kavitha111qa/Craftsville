package com.Craftville.qa.Generic;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel 
{   
	public static File file=null; // create a file as gl
	public static FileInputStream fin = null; //read file 
	public static Workbook wb =null; //workbook is a interface in apache poi//create an object
	public static Sheet sh =null;
	public static String[][]getdata(String filename,String Sheetname)
	{    // method to read data
		try {
		 file = new File(filename);	   
	     fin = new FileInputStream(file);
	     wb = new XSSFWorkbook(fin);
	     sh = wb.getSheet(Sheetname);
	     int rowNum = sh.getLastRowNum()+1; //plus one because will return one less -the first one has title
	     int colNum = sh.getRow(0).getLastCellNum();
	     String[][]data = new String[rowNum][colNum];
	     for (int i =0;i<rowNum;i++) 
	     {
	    	 Row r =sh.getRow(i);
	    	 for(int j=0;j<colNum;j++)
	    	 {
	    		 Cell c = r.getCell(j);
	    		 String value = new DataFormatter().formatCellValue(c);
	    		 data[i][j]=value;
	    	 }
	    	 
	     }
	     return data;
	      }
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
		
		finally
		{
			
			try {
				file=null;
				fin.close();
				fin=null;
				wb.close();
				wb=null;
				sh=null;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
		
	}

	
