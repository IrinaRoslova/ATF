package Util;

public enum AbstractLocations {
    SET_PROPERTY_CHROME("webdriver.chrome.driver"),
    PROP_FILE("src/test/resources/data.proprieties");

    String value;
    public String getValue(){
        return value;
    }
    AbstractLocations(String value) {
        this.value = value;
    }
}

