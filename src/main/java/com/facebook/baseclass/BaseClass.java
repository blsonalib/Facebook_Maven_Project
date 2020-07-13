package com.facebook.baseclass;

import com.facebook.utility.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    public static Properties pro;
    FileInputStream fs;
   public BaseClass() {

       try {
           pro = new Properties();
           fs = new FileInputStream("C:\\Users\\HP\\Documents\\FaceBookMavenProject\\src\\main\\java\\com\\facebook\\config\\config.properties");
           pro.load(fs);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
   public static void initialize(){
       System.setProperty("webdriver.gecko.driver","C:\\Users\\HP\\Documents\\FaceBookMavenProject\\Driver\\geckodriver.exe");
       driver = new FirefoxDriver();
       driver.manage().deleteAllCookies();
       driver.manage().window().maximize();
       driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
       driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_TIMEOUT,TimeUnit.SECONDS);
       driver.get(pro.getProperty("url"));
   }
}
