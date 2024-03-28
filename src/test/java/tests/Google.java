package tests;

import org.testng.annotations.Test;

import static utilities.Driver.driver;
import static utilities.Driver.getDriver;

public class Google {
    @Test
    public void test01(){
        System.out.println("test01 start");
        driver.get("https://www.google.com/");
        getDriver().close();
    }


}
