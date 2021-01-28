package by.epam.array.action;

import by.epam.array.entity.CustomArray;
import by.epam.array.action.poselems.PositiveElemsStream;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PostiveElemsTest {

    CustomArray customArray;
    PositiveElemsStream func;

    @BeforeClass
    public void setUp() {
        func = new PositiveElemsStream();
        customArray = new CustomArray();
    }

    @Test(dataProvider = "dataArray")
    public void testAmount(int[] array, int expectedValue){
        customArray.setArray(array);
        int actualValue = func.amountOfPosElems(customArray);
        Assert.assertEquals(actualValue, expectedValue);
    }

    @DataProvider(name = "dataArray")
    public Object[] createData(){
        return new Object[][] { { new int[] {-30,12,25,-765,123}, 3},
                { new int[] { -10,12,-6456,2 },  2 }};
    }
}
