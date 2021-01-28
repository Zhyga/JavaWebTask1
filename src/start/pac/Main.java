package start.pac;

import by.epam.array.action.simplemath.MathArrayActionStream;
import by.epam.array.action.changeelem.NegativElemsToPositiveStream;
import by.epam.array.action.poselems.PositiveElemsStream;
import by.epam.array.entity.CustomArray;

import by.epam.array.exception.ArrayException;
import by.epam.array.reader.CustomArrayReader;
import by.epam.array.sortmethods.CustomArraySort;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class Main {

    private final static Logger logger = LogManager.getRootLogger();

    public static void main(String[] args) throws ArrayException{

        logger.info("Program start");
        int[] arr = new int[]{2,3,1,5,4};
        CustomArray a = new CustomArray(arr);

        MathArrayActionStream avge = new MathArrayActionStream();
        double average = avge.avg(a);
        int max = avge.max(a);

        PositiveElemsStream pEl = new PositiveElemsStream();
        int ret = pEl.amountOfPosElems(a);

        NegativElemsToPositiveStream test = new NegativElemsToPositiveStream();
        test.changeElem(a);

        CustomArraySort sorted = new CustomArraySort();
        //sorted.bubbleSort(a);
        //sorted.selectionSort(a);
        sorted.quickSort(a,0,a.length()-1);

        CustomArrayReader creator = new CustomArrayReader();
        a = creator.fromFile("C:\\Users\\user\\IdeaProjects\\MyArray\\textFile.txt");
        a.setArray(new int[]{2, 74, 2});

        logger.info("Array:" + a);

    }
}
