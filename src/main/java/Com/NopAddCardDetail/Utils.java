package Com.NopAddCardDetail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage{

    public static void clickOnElement (By by){
        driver.findElement(by).click();        // for click method
    }

    public static void clearOnElement(By by){
        driver.findElement(by).clear();        // for clear method
    }

    public static void selectDropDownByValue(WebElement element, String byValue) {
        Select select = new Select(element);
        select.selectByValue(byValue);

    }
    public static void dropDownSelectByVisibleTextMethod(WebElement element, String value) {//for selectByValue
        Select sc = new Select(element);                        //TextFromDropdown
        sc.selectByValue(value);
    }
    public static void byIndex(WebElement element,int index){//for selectByIndex
        Select sc = new Select(element);                    //TextFromDropdown
        sc.selectByIndex(index);
    }
    public static void byVisibleText(WebElement element,String visibleText ) { //for selectByVisibleText
        Select sc = new Select(element);                                       //TextFromDropdown
        sc.selectByVisibleText(visibleText);
    }
    public static void sendKey(By by,String sendkey) {
        driver.findElement(by).sendKeys(sendkey);

    }
    public static String getText(By by) {
        return driver.findElement(by).getText();
        // String text = driver.findElements(by).getText();
        // return text;
    }
    public static String GetCurrentDateStamp() {
        SimpleDateFormat sdfDate = new SimpleDateFormat(
                "ddmmyyyy");// dd/MM/yyyy
        Date today = new Date();
        String strDate = sdfDate.format(today);
        return strDate;
    }
    public static String GetCurrentTimeStamp(){
        SimpleDateFormat stfTime = new SimpleDateFormat("hhmmssss");
        Date now = new Date();
        String stdTime = stfTime.format(now);
        return stdTime;
    }


}


