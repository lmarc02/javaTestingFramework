package com.company.api.Utils;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name="getUsersProviderMethod", parallel=true)
    public static Object[][] getUsersProviderMethod() {
        return new Object[][] {
                {1,"Lore"},
                {2, "John"},
                {3, "Sonia"}
        };
    }

}
