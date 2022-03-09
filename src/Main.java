import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Plot[][] testPlotArray = setupTestPlots();
        ExperimentalFarm f = new ExperimentalFarm(testPlotArray);

        System.out.println("--- TESTING PART (a) ---");

        Plot test1 = f.getHighestYield("corn");
        if (test1 == testPlotArray[1][2]) {
            System.out.println("Test 1 Passed!");
        } else {
            System.out.println("***Test 1 FAILED***");
        }
        Plot test2 = f.getHighestYield("peas");
        if (test2 == testPlotArray[1][0] || test2 == testPlotArray[3][2]) {
            System.out.println("Test 2 Passed!");
        } else {
            System.out.println("***Test 2 FAILED***");
        }
        Plot test3 = f.getHighestYield("bananas");
        if (test3 == null) {
            System.out.println("Test 3 Passed!");
        } else {
            System.out.println("***Test 3 FAILED***");
        }

        System.out.println("\n--- TESTING PART (b) ---");

        boolean test4 = f.sameCrop(0);
        if (test4 == false) {
            System.out.println("Test 4 Passed!");
        } else {
            System.out.println("***Test 4 FAILED***");
        }
        boolean test5 = f.sameCrop(1);
        if (test5 == true) {
            System.out.println("Test 5 Passed!");
        } else {
            System.out.println("***Test 5 FAILED***");
        }

        System.out.println("\n--- TESTING PART (c) ---");

        ArrayList<Plot> test6 = f.plotsWithCrop("corn");
        if (test6.contains(testPlotArray[0][0]) && test6.contains(testPlotArray[0][1]) && test6.contains(testPlotArray[1][1]) &&
                test6.contains(testPlotArray[1][2]) && test6.contains(testPlotArray[2][1]) && test6.contains(testPlotArray[0][0]) &&
                test6.contains(testPlotArray[3][0]) && test6.contains(testPlotArray[3][1]) && test6.size() == 7) {
            System.out.println("Test 6 Passed!");
        } else {
            System.out.println("***Test 6 FAILED***");
        }
        ArrayList<Plot> test7 = f.plotsWithCrop("wheat");
        if (test7.contains(testPlotArray[2][0]) && test7.size() == 1) {
            System.out.println("Test 7 Passed!");
        } else {
            System.out.println("***Test 7 FAILED***");
        }
        ArrayList<Plot> test8 = f.plotsWithCrop("apples");
        if (test8.size() == 0) {
            System.out.println("Test 8 Passed!");
        } else {
            System.out.println("***Test 8 FAILED***");
        }
    }

    // sets up the plots to reflect sample in handout
    public static Plot[][] setupTestPlots()
    {
        Plot p1 = new Plot("corn", 20);
        Plot p2 = new Plot("corn", 30);
        Plot p3 = new Plot("peas", 10);
        Plot p4 = new Plot("peas", 30);
        Plot p5 = new Plot("corn", 40);
        Plot p6 = new Plot("corn", 62);
        Plot p7 = new Plot("wheat", 10);
        Plot p8 = new Plot("corn", 50);
        Plot p9 = new Plot("rice", 30);
        Plot p10 = new Plot("corn", 55);
        Plot p11 = new Plot("corn", 30);
        Plot p12 = new Plot("peas", 30);

        Plot[][] testArr = {{p1, p2, p3},
                {p4, p5, p6},
                {p7, p8, p9},
                {p10, p11, p12}};
        return testArr;
    }
}