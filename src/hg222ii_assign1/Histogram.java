package hg222ii_assign1;

import org.knowm.xchart.*;  
import org.knowm.xchart.style.PieStyler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Integer> primeNumber;
        primeNumber = add();

        int one = 0, two = 0, three = 0, four = 0, five = 0,
                six = 0, seven = 0, eight = 0, nine = 0, ten = 0, others = 0;

        for (int i = 0; i < primeNumber.size(); i++) {

            if (primeNumber.get(i) <= 10) {
                one++;
            } else if (primeNumber.get(i) > 10 && primeNumber.get(i) <= 20) {
                two++;
            } else if (primeNumber.get(i) > 20 && primeNumber.get(i) <= 30) {
                three++;
            } else if (primeNumber.get(i) > 30 && primeNumber.get(i) <= 40) {
                four++;
            } else if (primeNumber.get(i) > 40 && primeNumber.get(i) <= 50) {
                five++;
            } else if (primeNumber.get(i) > 50 && primeNumber.get(i) <= 60) {
                six++;
            } else if (primeNumber.get(i) > 60 && primeNumber.get(i) <= 70) {
                seven++;
            } else if (primeNumber.get(i) > 70 && primeNumber.get(i) <= 80) {
                eight++;
            } else if (primeNumber.get(i) > 80 && primeNumber.get(i) <= 90) {
                nine++;
            } else if (primeNumber.get(i) > 90 && primeNumber.get(i) <= 100) {
                ten++;
            } else {
                others++;
            }
        }

        histogram(one, two, three, four, five, six, seven, eight, nine, ten, others);
        showPieChart(one, two, three, four, five, six, seven, eight, nine, ten, others);
    }

    public static ArrayList<Integer> add() { //adding temp into prime list

        ArrayList<Integer> temp = new ArrayList<>();

        try {
            File file = new File("heltal.txt");

            Scanner scanFile = new Scanner(file);

            while (scanFile.hasNext()) {
                int digits = scanFile.nextInt();
                temp.add(digits);
            }
            scanFile.close();

        } catch (FileNotFoundException e) { // Exception if there's no file found
            System.err.println(e + "Your file couldn't be found. Please fix the location to the file!");
            System.exit(0);
        }

        return temp;

    }

    // method makes a histogram from the results from heltal.txt
    public static void histogram(int one,int two,int three,int four,int five,
                                 int six,int seven,int eight,int nine,int ten,int other) {

        //making and defining the chart
        CategoryChart chart = new CategoryChartBuilder().width(800).
                height(600).title("Histogram").xAxisTitle("Interval").
                yAxisTitle("Amount").build();

        // customize chart
        chart.getStyler().setHasAnnotations(true);
        chart.getStyler().setLegendVisible(false);

        // adding parts to the chart
        chart.addSeries("Numbers", Arrays.asList(new String[] { "0-10", "11-20", "21-30", "31-40",
                        "41-50", "51-60", "61-70", "71-80", "81-90", "91-100", "Others"}),
                Arrays.asList(new Integer[] {one, two, three, four, five, six, seven, eight, nine, ten, other}));

        new SwingWrapper(chart).displayChart(); //display Chart
    }

    //building and displaying pie chart
    public static void showPieChart(int one,int two,int three,int four,int five,
                                    int six,int seven,int eight,int nine,int ten,int other){

        //making and defining chart
        PieChart chart = new PieChartBuilder().width(800).height(600).title("How many in each part?").build();

        //Customize chart
        chart.getStyler().setLegendVisible(false);
        chart.getStyler().setAnnotationDistance(.82);
        chart.getStyler().setPlotContentSize(.9);
        chart.getStyler().setAnnotationType(PieStyler.AnnotationType.LabelAndPercentage);

        chart.addSeries("0-10", one);
        chart.addSeries("11-20", two);
        chart.addSeries("21-30", three);
        chart.addSeries("31-40", four);
        chart.addSeries("41-50", five);
        chart.addSeries("51-60", six);
        chart.addSeries("61-70", seven);
        chart.addSeries("71-80", eight);
        chart.addSeries("81-90", nine);
        chart.addSeries("91-100", ten);
        chart.addSeries("Other", other);

        new SwingWrapper(chart).displayChart();
    }
}