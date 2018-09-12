package tests;

import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class TestMainPage extends BaseTest {

    @Test(description = "51")
    void testSearch(){
        mainPageSteps.search("Cool dress!!!!");
        boolean result = mainPageSteps.isCoolDressDisplayed();
        assertEquals(result, true, "It seems to be like that cool dress " +
                "is not found!!!!!!! OMG BUGS!");

        result = mainPageSteps.isCoolDressShownTheFirst();
        assertEquals(result, true, "It seems to be like that cool dress " +
                "is not show the first one!!!!!!! OMG BUGS!");

    }
}
