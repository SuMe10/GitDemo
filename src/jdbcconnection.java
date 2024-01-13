import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jdbcconnection {
	
	@Test
	public void postJira()
	{
		System.out.println("postJira");
		
		System.out.println("postJira2");
		System.out.println("postJira3");

		
		
	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host = "localhost";
		String port = "3306";

		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/QAdbt", "root", "NoSQL49");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from Employeeinfo where name ='tam'");
		
		

		while(rs.next())
		{
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumedh\\OneDrive\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			driver.findElement(By.id("username")).sendKeys(rs.getString("name"));
			driver.findElement(By.id("password")).sendKeys(rs.getString("location"));
		
		}

	}

}
