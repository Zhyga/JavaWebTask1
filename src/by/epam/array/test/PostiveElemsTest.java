package by.epam.array.test;

import by.epam.array.entity.MyArray;
import by.epam.array.action.poselems.PositiveElems;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostiveElemsTest {

    PositiveElems pEl = new PositiveElems();
    int[] a = new int[]{1,2,3,4,5};
    MyArray arr = new MyArray(a);

    int[] a2 = new int[]{-1,2,-3,0,5};
    MyArray arr2 = new MyArray(a2);


    @Test
    public void testAmount() throws Exception{
        Assert.assertEquals(5, pEl.amountOfPosElems(arr));
    }

    @Test
    public void testAmount2() throws Exception{
        Assert.assertEquals(2,pEl.amountOfPosElems(arr2));
    }
}
