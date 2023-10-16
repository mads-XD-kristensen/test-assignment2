package stringUtils;
import io.cucumber.java.en.*;
public class StepDefinitions {
    String stringToReverse;
    String reversedString;

    @Given("I have a string {string}")
    public void iHaveAString(String arg0) {
        stringToReverse = arg0;
    }

    @When("I reverse the string")
    public void iReverseTheString() {
        reversedString = StringUtils.reverse(stringToReverse);
    }

    @Then("I should get {string}")
    public void iShouldGet(String arg0) {
        assert arg0.equals(reversedString);
    }


    String lowerCaseString;
    String upperCaseString;
    @Given("I have a lowercase string {string}")
    public void iHaveALowercaseString(String arg0) {
        lowerCaseString = arg0;
    }

    @When("I capitalize the string")
    public void iCapitalizeTheString() {
        upperCaseString = StringUtils.capitalize(lowerCaseString);
    }

    @Then("I should get uppercase {string}")
    public void iShouldGetUppercase(String arg0) {
        assert arg0.equals(upperCaseString);
    }

    @Given("I have a string uppercase {string}")
    public void iHaveAStringUppercase(String arg0) {
        upperCaseString = arg0;
    }

    @When("I lowercase the string")
    public void iLowercaseTheString() {
        lowerCaseString = StringUtils.lowercase(upperCaseString);
    }

    @Then("I should get lowercase {string}")
    public void iShouldGetLowercase(String arg0) {
        assert arg0.equals(lowerCaseString);
    }
}

class StringUtils {
    public static String reverse(String s) {
        String reversedString = "";
        for(int i = s.length() -1; i > 0; i--) {
            reversedString += s.charAt(i);
        }
        return reversedString;
    }

    public static String capitalize(String s) {
        String capitalizedString = "";
        for(char c : s.toCharArray()) {
            s = s.replace(c, Character.toUpperCase(c));
        }
        capitalizedString = s.toString();
        return capitalizedString;
    }

    public static String lowercase(String s) {
        String lowercaseString = "";
        for(char c : s.toCharArray()) {
            s = s.replace(c, Character.toLowerCase(c));
        }
        lowercaseString = s.toString();
        return lowercaseString;
    }


}
