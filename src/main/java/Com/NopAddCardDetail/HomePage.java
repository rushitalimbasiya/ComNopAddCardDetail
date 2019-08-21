package Com.NopAddCardDetail;


import org.openqa.selenium.By;
import org.junit.Assert;


import static Com.NopAddCardDetail.BrowserSelector.browserSelection;

public class HomePage extends Utils {

    /*6.	Demo.nopcommerce.com – click on the product – change quantity of the product –
add picture of Fahrenheit 451 by ray Bradbury book in with list –
verify “The product has been added to you wishlist” from top green line –
add product in to cart – change the quantity to 4 – go to cart from top green message – select country –
term and condition – checkout – checkout as guest – filling personal detail –
add card detail – continue to order till end and verify order confirmation message.
 */

    public static void main(String[] args) {


        LoadProp loadProp = new LoadProp();
        BrowserSelector browserSelector = new BrowserSelector();
        browserSelection();

        //for open url
        driver.get(loadProp.getProperty("url"));
        //click on gift card
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']/li[7]/a"));
        // click on $25 Virtual Gift Card in add to cart
        clickOnElement(By.xpath("//div[@class='buttons']/input[@onclick='return AjaxCart.addproducttocomparelist(\"/compareproducts/add/43\"),!1']"));

        //assert for text The product has been added to your product comparison
        String expRes = "The product has been added to your product comparison";
        // String actRes = driver.findElement(By.xpath("")).getText();
        Assert.assertEquals(expRes, driver.findElement(By.xpath("//p[@class='content']")).getText());

        clickOnElement(By.xpath("//div[@class='buttons']/input[@onclick='return AjaxCart.addproducttocart_catalog(\"/addproducttocart/catalog/43/1/1\"),!1']"));

        //for recipient name
        clickOnElement(By.name("giftcard_43.RecipientName"));
        sendKey(By.name("giftcard_43.RecipientName"), loadProp.getProperty("RecipientName"));

        //for recipient email
        clickOnElement(By.name("giftcard_43.RecipientEmail"));
        sendKey(By.name("giftcard_43.RecipientEmail"), "pqrs" + GetCurrentDateStamp() + "@yahoo.com");

        //for sender name
        clickOnElement(By.name("giftcard_43.SenderName"));
        sendKey(By.name("giftcard_43.SenderName"), loadProp.getProperty("SenderName"));

        //for ender email
        clickOnElement(By.name("giftcard_43.SenderEmail"));
        sendKey(By.name("giftcard_43.SenderEmail"), "abcd" + GetCurrentDateStamp() + "@yahoo.com");

        //for message
        clickOnElement(By.name("giftcard_43.Message"));
        sendKey(By.name("giftcard_43.Message"), loadProp.getProperty("Message"));
        // for add to cart
        clickOnElement(By.xpath("//div[@class='add-to-cart-panel']/input[@id='add-to-cart-button-43']"));
        //click top green line The product has been added to your shopping cart
        clickOnElement(By.xpath("//div[@id='bar-notification']/div/p/a"));

        //for input product quantity
        clickOnElement(By.cssSelector(".quantity>input"));
        clearOnElement(By.cssSelector(".quantity>input"));
        sendKey(By.cssSelector(".quantity>input"), loadProp.getProperty("quantity"));

        //tik on terms box
        clickOnElement(By.cssSelector(".terms-of-service>input"));
        //click on checkout button
        clickOnElement(By.cssSelector(".checkout-buttons>button"));
        //click on Checkout as Guest button
        clickOnElement(By.xpath("//div[@class='buttons']/input[@value='Checkout as Guest']"));

        //for first name
        clickOnElement(By.cssSelector("#BillingNewAddress_FirstName"));
        sendKey(By.cssSelector("#BillingNewAddress_FirstName"), loadProp.getProperty("FirstName"));
        //for last name
        clickOnElement(By.cssSelector("#BillingNewAddress_LastName"));
        sendKey(By.cssSelector("#BillingNewAddress_LastName"), loadProp.getProperty("Lastname"));
        //for email add
        clickOnElement(By.cssSelector("#BillingNewAddress_Email"));
        sendKey(By.cssSelector("#BillingNewAddress_Email"), loadProp.getProperty("Email"));
        //for company name
        clickOnElement(By.cssSelector("#BillingNewAddress_Company"));
        sendKey(By.cssSelector("#BillingNewAddress_Company"), loadProp.getProperty("Company"));
        //for country name
        clickOnElement(By.cssSelector("#BillingNewAddress_CountryId"));
        byVisibleText(driver.findElement(By.cssSelector("#BillingNewAddress_CountryId")), loadProp.getProperty("Country"));
        //for city name
        clickOnElement(By.cssSelector("#BillingNewAddress_City"));
        sendKey(By.cssSelector("#BillingNewAddress_City"), loadProp.getProperty("City"));
        //for address1
        clickOnElement(By.cssSelector("#BillingNewAddress_Address1"));
        sendKey(By.cssSelector("#BillingNewAddress_Address1"), loadProp.getProperty("Address1"));
        //for address2
        clickOnElement(By.cssSelector("#BillingNewAddress_Address2"));
        sendKey(By.cssSelector("#BillingNewAddress_Address2"), loadProp.getProperty("Address2"));
        //for postcode
        clickOnElement(By.cssSelector("#BillingNewAddress_ZipPostalCode"));
        sendKey(By.cssSelector("#BillingNewAddress_ZipPostalCode"), loadProp.getProperty("Zip/postalcode"));
        //for phone number
        clickOnElement(By.cssSelector("#BillingNewAddress_PhoneNumber"));
        sendKey(By.cssSelector("#BillingNewAddress_PhoneNumber"), loadProp.getProperty("Phonenumber"));
        //for fax number
        clickOnElement(By.cssSelector("#BillingNewAddress_FaxNumber"));
        sendKey(By.cssSelector("#BillingNewAddress_FaxNumber"), loadProp.getProperty("Faxnumber"));
        //for continue button
        clickOnElement(By.cssSelector("#billing-buttons-container>input"));

        //click on credit card button
        clickOnElement(By.xpath("//input[@id='paymentmethod_1']"));
        //for continue button
        clickOnElement(By.cssSelector(".button-1.payment-method-next-step-button"));

        // Select credit card type
        clickOnElement(By.cssSelector("#CreditCardType"));
        byVisibleText(driver.findElement(By.cssSelector("#CreditCardType")), loadProp.getProperty("Selectcreditcard"));
        //for cardholder name
        clickOnElement(By.cssSelector("#CardholderName"));
        sendKey(By.cssSelector("#CardholderName"), loadProp.getProperty("CardholderName"));
        //for card number
        clickOnElement(By.cssSelector("#CardNumber"));
        sendKey(By.cssSelector("#CardNumber"), loadProp.getProperty("CardNum"));
        //for ExpireMonth
        clickOnElement(By.cssSelector("#ExpireMonth"));
        selectDropDownByValue(driver.findElement(By.cssSelector("#ExpireMonth")), loadProp.getProperty("ExpireMonth"));
        //for ExpireYear
        clickOnElement(By.cssSelector("#ExpireYear"));
        selectDropDownByValue(driver.findElement(By.cssSelector("#ExpireYear")), loadProp.getProperty("ExpireYear"));
        //for CardCode
        clickOnElement(By.cssSelector("#CardCode"));
        sendKey(By.cssSelector("#CardCode"), loadProp.getProperty("CardCode"));
        //for continue
        clickOnElement(By.cssSelector("#payment-info-buttons-container>input"));

        //for confirm
        clickOnElement(By.cssSelector("#payment-info-buttons-container>input"));

        //click on continue
        clickOnElement(By.cssSelector("#confirm-order-buttons-container>input"));
        //for assert massage "Your order has been successfully processed!"
        String expectedResult = "Your order has been successfully processed!";
        String actualResult = driver.findElement(By.xpath("//div[@class='section order-completed']/div/strong")).getText();
        Assert.assertEquals(expectedResult, actualResult);
        //close browser
        //add
        driver.close();
    }
}


