package by.epam.array.sortmethods;

import by.epam.array.entity.CustomArray;
import by.epam.array.exception.ArrayException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CustomArraySortTest {

    CustomArraySort customArraySort;
    CustomArray customArray;

    @BeforeClass
    public void setUp() {
        customArraySort = new CustomArraySort();
        customArray = new CustomArray();
    }

    @Test(dataProvider = "dataArray")
    public void testBubbleSort(int[] array, int[] expectedValue) throws ArrayException {
        customArray = CustomArray.createArray(array);
        customArraySort.bubbleSort(customArray);
        int[] actualValue = customArray.getArray();
        Assert.assertEquals(actualValue,expectedValue);
    }

    @Test(dataProvider = "dataArray")
    public void testQuickSort(int[] array, int[] expectedValue) throws ArrayException {
        customArray = CustomArray.createArray(array);
        customArraySort.quickSort(customArray,0,customArray.length()-1);
        int[] actualValue = customArray.getArray();
        Assert.assertEquals(actualValue,expectedValue);
    }

    @Test(dataProvider = "dataArray")
    public void testSelectionSort(int[] array, int[] expectedValue) throws ArrayException {
        customArray = CustomArray.createArray(array);
        customArraySort.selectionSort(customArray);
        int[] actualValue = customArray.getArray();
        Assert.assertEquals(actualValue,expectedValue);
    }

    @DataProvider(name = "dataArray")
    public Object[] createTestData() {
        return new Object[][] { { new int[] {-1230,5,7,9,0}, new int[] {-1230,0,5,7,9}},
                { new int[] { 10,12,6456,2 },new int[] { 2,10,12,6456 } } };
    }


}
