package com.facebook.pages;

import com.facebook.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseClass {
   @FindBy(id = "email")
   private WebElement userId;
   @FindBy(id = "pass")
    private WebElement password;
   @FindBy(id = "loginbutton")
    private WebElement loginButton;
   public LoginPage(){
       PageFactory.initElements(driver,this);
   }
   public HomePage loginFB(String un,String pass){
       userId.sendKeys(un);
       password.sendKeys(pass);
       loginButton.click();
       return new HomePage();
 }
}
