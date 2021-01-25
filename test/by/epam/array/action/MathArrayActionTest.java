package by.epam.array.action;

import by.epam.array.action.simplemath.MathArrayAction;
import by.epam.array.entity.CustomArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MathArrayActionTest {

    MathArrayAction avg = new MathArrayAction();
    int[] a = new int[]{1,2,3,4,5};
    CustomArray arr = new CustomArray(a);


    @Test
    public void testAvg() throws Exception{
        Assert.assertEquals(3.0,avg.avg(arr));
    }

    @Test
    public void testMin() throws Exception{
        Assert.assertEquals(1,avg.min(arr));
    }

    @Test
    public void testMax() throws Exception{
        Assert.assertEquals(5,avg.max(arr));
    }

    @Test
    public void testSum() throws Exception{
        Assert.assertEquals(15,avg.sum(arr));
    }
}
