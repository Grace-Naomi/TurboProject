package com.selenium.tests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyIAgreeSalesForceCheckbox {


        WebDriver driver;
        SoftAssert softAssert;

        @BeforeTest
        public void launchBrowser(){
            driver = new ChromeDriver();
            softAssert = new SoftAssert();

            driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");


        }

        @Test
        public void verifyCheckBox() throws InterruptedException {


            /*********************************************************************************/

            WebElement iAgreeToTheCheckbox = driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']"));
            iAgreeToTheCheckbox.click();

            System.out.println("iAgreeToTheCheckbox : : "+iAgreeToTheCheckbox);

           // System.out.println(checkBox1.isSelected());
          //  System.out.println(checkBox2.isSelected());

          //  softAssert.assertAll();




        }
        }
