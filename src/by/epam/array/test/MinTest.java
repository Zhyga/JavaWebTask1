package by.epam.array.test;

import by.epam.array.action.minmax.Min;
import by.epam.array.entity.MyArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MinTest {

    Min min = new Min();
    int[] a = new int[]{1,2,3,4,5};
    MyArray arr = new MyArray(a);

    @Test
    public void testMin() throws Exception{
        Assert.assertEquals(1,min.min(arr));
    }
}
