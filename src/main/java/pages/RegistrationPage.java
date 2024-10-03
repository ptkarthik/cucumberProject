package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class RegistrationPage extends BasePage {

    @FindBy(xpath = "//label[contains(text(),'Full Name* ')]/following::div[1]/child::input")
    private WebElement firstName;
    @FindBy(xpath = "//label[contains(text(),'Full Name* ')]/following::div[2]/child::input")
    private WebElement lastName;
    @FindBy(xpath = "//label[contains(text(),'Address')]/following::div[1]/textarea")
    private WebElement address;
    @FindBy(xpath = "//label[contains(text(),'Email address')]/following::div[1]/input")
    private WebElement emailAddress;
    @FindBy(xpath = "//label[contains(text(),'Phone')]/following::div[1]/input")
    private WebElement phoneNumber;
    @FindBy(xpath = "//label[contains(text(),'Gender')]/following::div[1]/label[2]")
    private WebElement femaleGender;
    @FindBy(xpath = "//label[contains(text(),'Gender')]/following::div[1]/label[1]")
    private WebElement maleGender;
    @FindBy(xpath = "//label[contains(text(),'Hobbies')]/following::div[1]/div[1]/input")
    private WebElement cricketHobby;
    @FindBy(xpath = "//label[contains(text(),'Hobbies')]/following::div[1]/div[2]/input")
    private WebElement moviesHobby;
    @FindBy(xpath = "//label[contains(text(),'Hobbies')]/following::div[1]/div[1]/input")
    private WebElement hockeyHobby;
    @FindBy(xpath = "//label[contains(text(),'Languages')]/following::div[1]//div[1]")
    private WebElement languageInputBox;
    @FindBy(xpath = "//label[contains(text(),'Languages')]/following::div[1]//div[1]")
    private WebElement languageSelect;
    @FindBy(xpath = "//label[contains(text(),'Skills')]/following::div[1]/select")
    private WebElement skillsSelect;
    @FindBy(xpath = "//label[contains(text(),'Country')]/following::div[1]/select")
    private WebElement countrySelect;
    @FindBy(xpath = "//label[contains(text(),'Date')]/following::div[3]/select")
    private WebElement dateOFDOB;
    @FindBy(xpath = "//label[contains(text(),'Date')]/following::div[1]/select")
    private WebElement yearOFDOB;
    @FindBy(xpath = "//label[contains(text(),'Date')]/following::div[2]/select")
    private WebElement monthOFDOB;
    @FindBy(xpath = "//input[@id='firstpassword']")
    private WebElement password;
    @FindBy(xpath = "//select[@id='Skills']/option")
    private List<WebElement> listOfSkills;
    @FindBy(xpath = "//div[@id='msdd']")
    private WebElement languageTextBox;
    @FindBy(xpath = "//input[@id='secondpassword']")
    private WebElement confirmPassword;
    @FindBy(xpath = "//button[@id='submitbtn']")
    private WebElement submit;
}
