package com.facebook.basetest;

import com.facebook.baseclass.BaseClass;
import com.facebook.pages.HomePage;
import com.facebook.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass {
    LoginPage loginPage;
    HomePage homePage;
    public LoginPageTest() {
        super();
    }
    @BeforeMethod
    public void setUp(){
       initialize();
         loginPage = new LoginPage();
         homePage = new HomePage();
    }
    @Test
    public void loginPageTest() throws InterruptedException {
         homePage  =loginPage.loginFB(pro.getProperty("username"),pro.getProperty("password"));
         Thread.sleep(1000);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
