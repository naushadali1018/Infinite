package Training;

import java.util.Arrays;

public class DataType {
    public static void main(String[] args){
        double fahrenheit = 212.0;      // Input in Fahrenheit

        double  celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);     // conversion from fahrenheit to celsius
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");

        //Write code here to convert temperature to Kelvin
        double temperature=100;

        double kelvin=(temperature +273.15);
        System.out.println(temperature+ " Degree temperature is equal to " + kelvin + " in kelvin");
    }
}
