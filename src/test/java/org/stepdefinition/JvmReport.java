package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
public static void generateJvmReport(String jsonPath) {
	File f=new File("C:\\Users\\Kayira\\eclipse-workspace\\Cucumber2Project\\AllRepo\\JvmReport");
	Configuration c=new Configuration(f, "facebook application");
    c.addClassifications("jdk", "1.8");	
    c.addClassifications("os", "windows10");
    c.addClassifications("tool", "eclipse");
    c.addClassifications("application", "facebook");
    List<String> l=new ArrayList<String>();
    l.add(jsonPath);
    ReportBuilder r=new ReportBuilder(l, c);
    r.generateReports();
}
}