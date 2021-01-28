package by.epam.array.action;

import by.epam.array.action.simplemath.MathArrayActionStream;
import by.epam.array.entity.CustomArray;
import by.epam.array.exception.ArrayException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MathArrayActionTest {

    MathArrayActionStream mathAction;
    CustomArray customArray;

    @BeforeClass
    public void setUp() {
        mathAction = new MathArrayActionStream();
        customArray = new CustomArray();
    }

    @Test(dataProvider = "arrays_avg")
    public void testAvgCorrect(int[] array, double expectedValue) {
            customArray.setArray(array);
            double actualValue = mathAction.avg(customArray);
            Assert.assertEquals(actualValue,expectedValue);
    }

    @Test(dataProvider = "arrays_min")
    public void testMinCorrect(int[] array, int expectedValue){
        customArray.setArray(array);
        int actualValue = mathAction.min(customArray);
        Assert.assertEquals(actualValue,expectedValue);
    }

    @Test(dataProvider = "arrays_max")
    public void testMaxCorrect(int[] array, int expectedValue){
        customArray.setArray(array);
        int actualValue = mathAction.max(customArray);
        Assert.assertEquals(actualValue,expectedValue);
    }

    @Test(dataProvider = "arrays_sum")
    public void testSumCorrect(int[] array, int expectedValue){
        customArray.setArray(array);
        int actualValue = mathAction.sum(customArray);
        Assert.assertEquals(actualValue,expectedValue);
    }


    @DataProvider(name = "arrays_avg")
    public Object[] createAvgTestData() {
        return new Object[][] { { new int[] {1,2,3,4,5}, 3.0},
                { new int[] { -10,12,5,87 }, 23.5 } };
    }

    @DataProvider(name = "arrays_min")
    public Object[] createMinTestData() {
        return new Object[][] { { new int[] {-1230,5,7,9,0}, -1230},
                { new int[] { 10,12,6456,2 }, 2 } };
    }

    @DataProvider(name = "arrays_max")
    public Object[] createMaxTestData() {
        return new Object[][] { { new int[] {1,2,3,4,5}, 5},
                { new int[] { -10,12,5,87 }, 87 }};
    }

    @DataProvider(name = "arrays_sum")
    public Object[] createSumTestData() {
        return new Object[][] { { new int[] {1,2,3,4,5}, 15},
                { new int[] { -10,12,5,87 }, 94 } };
    }
}
