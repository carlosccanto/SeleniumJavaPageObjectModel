package stepDefinitions;

import java.sql.DriverManager;

public class CommonSteps {
    private final DriverManager driverManager;

    public CommonSteps(DriverManager webDriverManager) {
        this.driverManager = webDriverManager;
    }

}
