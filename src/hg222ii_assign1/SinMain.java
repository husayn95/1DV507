package hg222ii_assign1;

import org.knowm.xchart.*;   
import java.util.ArrayList;
import java.util.List;


public class SinMain {

    public static void main(String[] args){

        List<Double> xChart = new ArrayList<>();
        List<Double> yChart= new ArrayList<>();

        for(double x = 0; x < 2*Math.PI; x += 2*Math.PI/1000) {  
                xChart.add(x); //get all the values for the x axis
        }

        for(int i =0; i <xChart.size(); i++){  //get the values for plotting the x on the y axis
            yChart.add((1 + xChart.get(i)/Math.PI)*Math.cos(xChart.get(i))*Math.cos(40*xChart.get(i)));
        }

        // paints the graph
        XYChart graph1 = QuickChart.getChart("Sinus Curve", "X", "Y", " ", xChart, yChart);
        graph1.getStyler().setMarkerSize(16);
        graph1.getStyler().setHasAnnotations(true);

        new SwingWrapper<>(graph1).displayChart();

    }
}

