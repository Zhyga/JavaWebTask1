package by.epam.array.validator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ValidationTest {

    @Test(dataProvider = "data")
    public void validatorTest(String line,boolean expectedValue){
        boolean actualValue = Validation.lineIsNumeric(line);
        Assert.assertEquals(actualValue,expectedValue);
    }

    @DataProvider(name = "data")
    public Object[] createData(){
        return new Object[][] { { "1 2 3 4 5 7", true},
                { "1 2 3 4 5, 7", false },
                { "1 22x 3b 4 5 7", false }};
    }
}
