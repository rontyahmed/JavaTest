import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    /**
     *
     * @param args main
     */
    public static void main(String[] args) {


        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 6, 7, 8);
        System.out.println("print 4 : " + Collections.binarySearch(list1, 5));


    }

    /**
     *
     */
    private void test()
    {
        //
        System.out.println("thisis test");

    }
}
