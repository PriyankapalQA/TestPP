package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Config
{
	 public static String env = null;
	 public static String browser;
	 public static String url;
	 
	 public static void readConfigExcelFile()
	  {
		 
		 String configFilePath=".\\resources\\ConfigFiles";
		 String configFileName="Configuration.xlsx";
		 File file = new File(configFilePath+"\\"+configFileName);
		 String fileExtensionName = configFileName.substring(configFileName.indexOf("."));
		 Workbook configDataWorkbook = null;
		 String configuationsSheetName= "Configuations";
		 String configValuesSheetName = "ConfigValues";
		
		 DataFormatter df = new DataFormatter();
		 
		 try {
		  			FileInputStream inputStream = new FileInputStream(file);
					
					  if(fileExtensionName.equals(".xlsx"))
						  configDataWorkbook = new XSSFWorkbook(inputStream);

					  else if(fileExtensionName.equals(".xls"))
						  configDataWorkbook = new HSSFWorkbook(inputStream);
		  		  	 }
			  catch (IOException e) {
				  System.out.println("IO Exception encountered while reading config file : "+e.getMessage());
					 }
	 
			try{
		   		  Sheet configDataWorksheet = configDataWorkbook.getSheet(configuationsSheetName);
			      int rowCount1 = configDataWorksheet.getLastRowNum()-configDataWorksheet.getFirstRowNum();
			      
				      for (int i=0;i<=rowCount1;i++)
				      {
				    	Row  row = configDataWorksheet.getRow(i);			    			   		    	
				    	String cell2= df.formatCellValue(row.getCell(0));
				    	switch (cell2)
				    	{
				    	  case "Environment": env = df.formatCellValue(row.getCell(1));
				    	  	break;
				    	  case "Browser":  browser = df.formatCellValue(row.getCell(1));
				    	  	break;
				         default: System.out.print("Not valid configuration");  
	 		   	       }
				  }
			}
		  catch (Exception e) {
			  System.out.println("Exception encountered while reading configValue page: "+e.getMessage());
				 }
				 
		
			try{
		      Sheet configValueWorksheet = configDataWorkbook.getSheet(configValuesSheetName);
		      int rowCount2 = configValueWorksheet.getLastRowNum()-configValueWorksheet.getFirstRowNum();   
	        	 
		      for (int i=0;i<=rowCount2;i++)
		      {
		    	Row  row1 = configValueWorksheet.getRow(i);
		    	String cell3= df.formatCellValue(row1.getCell(0));
	        	 if (cell3.equalsIgnoreCase(env))
	        	 {
	        		 url = df.formatCellValue(row1.getCell(1));
	        	     break;
	        	 }
	          }
		  }
			catch (Exception e) {
			  System.out.println("Exception encountered while reading configValue page : "+e.getMessage());
				 }
		}
		
}
