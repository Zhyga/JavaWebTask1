package by.epam.array.test;

import by.epam.array.action.sum.Sum;
import by.epam.array.entity.MyArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest {

    Sum sum = new Sum();
    int[] a = new int[]{1,2,3,4,5};
    MyArray arr = new MyArray(a);

    @Test
    public void testSum() throws Exception{
        Assert.assertEquals(15,sum.sum(arr));
    }

    @Test
    public void testSum2() throws Exception{
        Assert.assertEquals(14,sum.sum(arr));
    }

}
