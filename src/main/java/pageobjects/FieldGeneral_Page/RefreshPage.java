package pageobjects.FieldGeneral_Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageobjects.BasePage;
import java.io.IOException;

public class RefreshPage extends BasePage {

    public @FindBy(id = "userName")
    WebElement textFieldUserName;


    public RefreshPage() throws IOException {
        super();
    }

}
