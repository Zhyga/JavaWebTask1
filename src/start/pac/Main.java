package start.pac;

import by.epam.array.action.simplemath.MathArrayAction;
import by.epam.array.action.changeelem.NegativElemsToPositive;
import by.epam.array.action.poselems.PositiveElems;
import by.epam.array.creator.CustomArrayCreator;
import by.epam.array.entity.CustomArray;

import by.epam.array.exception.ArrayException;
import by.epam.array.sortmethods.CustomArraySort;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.io.IOException;


public class Main {

    private final static Logger logger = LogManager.getLogger("Main");

    public static void main(String[] args) throws ArrayException{


        int[] arr = new int[]{2,3,1,5,4};
        CustomArray a = new CustomArray(arr);

        MathArrayAction avge = new MathArrayAction();
        double average = avge.avg(a);
        int max = avge.max(a);

        PositiveElems pEl = new PositiveElems();
        int ret = pEl.amountOfPosElems(a);

        NegativElemsToPositive test = new NegativElemsToPositive();
        test.changeElem(a);

        CustomArraySort sorted = new CustomArraySort();
        sorted.bubbleSort(a);
        sorted.selectionSort(a);
        sorted.quickSort(a,0,a.getArrSize()-1);

        CustomArrayCreator creator = new CustomArrayCreator();
        creator.fromFile();

        System.out.println(a);

    }
}
