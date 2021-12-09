package com.Runner;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.BaseClass.Base_Class;
import com.pom.Address;
import com.pom.My_Store;
import com.pom.Shipping;
import com.pom.Signin;
import com.pom.Summary;
import com.pom.Tshirt_Sec;
import com.sdp.Page_Object_Manager;

public class Test_Runner extends Base_Class {
	public static WebDriver driver=getBrowser("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	public static void main(String[] args) throws InterruptedException, IOException   {
	geturl("http://automationpractice.com/index.php");
	implicitwait(20);
	moveactions(pom.getInstancestore().getWomen());
    clickonelement(pom.getInstancestore().getTshirt());
	threadsleep(2000);
	scrolldown(pom.getInstancetshirt().getName());
	threadsleep(2000);
	clickonelement1(pom.getInstancetshirt().getColor());
	threadsleep(2000);
	clickonelement2(pom.getInstancetshirt().getCart());
	threadsleep(2000);
	clickonelement3(pom.getInstancetshirt().getBtn());
	threadsleep(2000);
	clickonelement4(pom.getInstanceSummary().getBtn1());
	email(pom.getInstancesignin().getEmail(), "karthikn8785@gmail.com");
	password(pom.getInstancesignin().getPassword(), "Karthikeyan@97");
	clickonelement5(pom.getInstancesignin().getSignin());
	threadsleep(2000);
	clickonelement6(pom.getInstanceaddress().getBtn2());
	threadsleep(2000);
	clickonelement7(pom.getInstanceshipping().getAgree());
	clickonelement8(pom.getInstanceshipping().getBtn3());
	threadsleep(2000);
    screenshot();
    close();
    quit();
	
	
	
	
}

}



