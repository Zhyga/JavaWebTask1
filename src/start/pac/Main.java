package start.pac;

import by.epam.array.action.average.Average;
import by.epam.array.action.changeelem.NegativElemsToPositive;
import by.epam.array.action.minmax.Max;
import by.epam.array.action.minmax.Min;
import by.epam.array.action.poselems.PositiveElems;
import by.epam.array.action.sum.Sum;
import by.epam.array.entity.MyArray;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;


public class Main {

    //private final static Logger logger = LogManager.getLogger("Main");

    public static void main(String[] args) {

        //logger.info("This info to the left is red");

        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i ++){
            arr[i] = i-1;
        }
        MyArray a = new MyArray(arr);

        Sum total = new Sum();
        int summa = total.sum(a);

        Average avge = new Average();
        double average = avge.avg(a);

        Min min = new Min();
        int m = min.min(a);

        Max max = new Max();
        int maximum = max.max(a);

        PositiveElems pEl = new PositiveElems();
        int ret = pEl.amountOfPosElems(a);

        NegativElemsToPositive test = new NegativElemsToPositive();
        test.changeElem(a);

        for(int i = 0; i < 5; i++)
            System.out.println(a.getElement(i));
    }
}
