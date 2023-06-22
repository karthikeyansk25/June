package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Report {
	public static void createJvmReport(String jsonfilepath) {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\cucumber_project\\JVMReport");
		
		Configuration c = new Configuration(f, "Facebook & Adactin");
		c.addClassifications("Platform Name", "10");
		c.addClassifications("Browser Name", "20");
		c.addClassifications("Browser version", "30");
		c.addClassifications("Platform Version", "40");
		c.addClassifications("Sprint No", "50");
		
		List<String> l = new LinkedList<String>();
		l.add(jsonfilepath);
		
		ReportBuilder r = new ReportBuilder(l, c);
		r.generateReports();

	}

}
