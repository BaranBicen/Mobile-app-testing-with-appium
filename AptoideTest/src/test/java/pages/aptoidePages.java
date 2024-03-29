package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class aptoidePages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;


    By serchbutonutiklama = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Search\")");
    By searchbarinatiklamak = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Search…\")");
    By aramayapmak = MobileBy.AndroidUIAutomator("new UiSelector().text(\"facebook\")");
    By uygulamayatiklamak = MobileBy.AndroidUIAutomator("new UiSelector().text(\"INSTALL\")");
    By uygulamayukleme = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"cm.aptoide.pt:id/frameLayout\")");
    By iptaletme = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"cm.aptoide.pt:id/cancelButton\")");

    public aptoidePages(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void searchbutonunatiklama(){
        driver.findElement(serchbutonutiklama).click();
    }

    public void searchbarinatiklama() {
        driver.findElement(searchbarinatiklamak).click();
    }

    public void uygulamaAdiyazma() {
        elementHelper.sendKeys("Facebook");

    }

    public void aramayapma() {
        driver.findElement(aramayapmak).click();
    }

    public void uygulamayatiklama() {
        driver.findElement(uygulamayatiklamak).click();
    }

    public void uygulamayuklenir() {
        driver.findElement(uygulamayukleme).click();
    }

    public void iptaletme() {
        driver.findElement(iptaletme).click();
    }
}
