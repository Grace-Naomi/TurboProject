package com.cucumberFramework;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{

        LoginPage loginPage;
        ProductsPage productsPage;

        @BeforeClass
        public void initializePages() {
            loginPage = new LoginPage(driver);
            productsPage = new ProductsPage(driver);
        }

        @Test
        public void verifyLoginSuccess() {
            LoginPage loginPage = new LoginPage(driver);
            ProductsPage productsPage = new ProductsPage(driver);


                loginPage.login("standard_user", "secret_sauce");

                Assert.assertEquals(productsPage.getNumberOfProducts(), 2);
            }
            }