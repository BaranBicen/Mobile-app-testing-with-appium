import io.cucumber.java.en.When;
import pages.aptoidePages;
import util.DriverFactory;

public class MyStepdefs {
    aptoidePages pages = new aptoidePages(DriverFactory.getDriver());

    @When("searchbutonunatiklanir")
    public void searchbutonunatiklanir(){
        pages.searchbutonunatiklama();
    }

    @When("searchbarinatiklanir")
    public void searchbarinatiklanir(){
        pages.searchbarinatiklama();
    }

    @When("uygulamaAdiyazilir")
    public void uygulamaAdiyazilir(){
        pages.uygulamaAdiyazma();
    }

    @When("aramayapilir")
    public void aramayapilir(){
        pages.aramayapma();
    }

    @When("uygulamayatiklanir")
    public void uygulamayatiklanir(){
        pages.uygulamayatiklama();
    }

    @When("uygulamayuklenir")
    public void uygulamayuklenir(){
        pages.uygulamayuklenir();
    }

    @When("iptaledilir")
    public void iptaledilir(){
        pages.iptaletme();
    }
}
