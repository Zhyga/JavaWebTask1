package by.epam.array.test;

import by.epam.array.action.average.Average;
import by.epam.array.action.sum.Sum;
import by.epam.array.entity.MyArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AverageTest {

    Average avg = new Average();
    int[] a = new int[]{1,4,5};
    int[] a2 = new int[]{1,2,3,4,5};
    MyArray arr = new MyArray(a);
    MyArray arr2 = new MyArray(a2);

    @Test
    public void testAvg() throws Exception{
        Assert.assertEquals(3.3,avg.avg(arr));
    }

    @Test
    public void testAvg2() throws Exception{
        Assert.assertEquals(5.0,avg.avg(arr2));
    }

    @Test
    public void testAvg3() throws Exception{
        Assert.assertEquals(3.0,avg.avg(arr2));
    }
}
