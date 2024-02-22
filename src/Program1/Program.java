package Program1;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Program {

	

	public static void main(String[] args) {
		//String s1="Flipkart";
		System.setProperty("webdriver.edge.driver", "C:\\browserdriver\\msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		String s2=driver.getTitle();
	System.out.println(s2);

	}
}

