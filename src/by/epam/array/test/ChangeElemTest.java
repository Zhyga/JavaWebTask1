package by.epam.array.test;

import by.epam.array.action.changeelem.NegativElemsToPositive;
import by.epam.array.entity.MyArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeElemTest {

    NegativElemsToPositive nEl = new NegativElemsToPositive();
    int[] a = new int[]{-1,2,-3,-4,5};
    MyArray arr = new MyArray(a);

    int[] a2 = new int[]{1,2,3,4,5};
    MyArray arr2 = new MyArray(a);

    @Test
    public void testSum() throws Exception{
        nEl.changeElem(arr);
        Assert.assertEquals(a2,a);
    }

    @Test
    public void testSum2() throws Exception{
       // Assert.assertEquals(arr2,nEl.changeElem(arr));
    }
}
