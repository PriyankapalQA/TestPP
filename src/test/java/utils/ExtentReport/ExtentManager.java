package utils.ExtentReport;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;

import utils.Config;

public class ExtentManager {
	 private static ExtentReports extent;
	 
	    public synchronized static ExtentReports getReporter(){
	       try{
	    	if(extent == null){
	            //Set HTML reporting file location
	        	
	        	 DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy HH-mm-ss");
				 Date date = new Date();
				
				 String currentDateTime = dateFormat.format(date);
				 File f = new File(".\\ExtentReports\\"+Config.env+"\\"+currentDateTime);
			//	 File f1 = new File(".\\ExtentReports\\"+currentDateTime+"\\Screenshot");
				 f.mkdir();
			//	 f1.mkdir();
	         //   String workingDir = System.getProperty("user.dir");
	            extent = new ExtentReports(".\\ExtentReports\\"+Config.env+"\\"+currentDateTime+"\\ExtentReportResults.html", true);
	        }
	       }
	       catch(Exception e)
	       {
	    	   System.out.println("Exception in getReporter"+e.getMessage());
	       }
	        return extent;
	    }
	}

