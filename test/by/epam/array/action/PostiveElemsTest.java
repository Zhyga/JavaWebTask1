package by.epam.array.action;

import by.epam.array.entity.CustomArray;
import by.epam.array.action.poselems.PositiveElems;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostiveElemsTest {

    PositiveElems pEl = new PositiveElems();
    int[] a = new int[]{1,2,3,4,5};
    CustomArray arr = new CustomArray(a);

    int[] a2 = new int[]{-1,2,-3,0,5};
    CustomArray arr2 = new CustomArray(a2);


    @Test
    public void testAmount() throws Exception{
        Assert.assertEquals(5, pEl.amountOfPosElems(arr));
    }

    @Test
    public void testAmount2() throws Exception{
        Assert.assertEquals(2,pEl.amountOfPosElems(arr2));
    }
}
