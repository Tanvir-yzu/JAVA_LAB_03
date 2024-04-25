import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WeatherTemperatureChanges {
    public static void main(String[] args) {
        try {
            File file = new File("weather.txt");
            Scanner scanner = new Scanner(file);

            // Read the first temperature
            if (scanner.hasNextDouble()) {
                double prevTemp = scanner.nextDouble();
                System.out.println("Day 1 temperature: " + prevTemp);

                int day = 2;
                while (scanner.hasNextDouble()) {
                    double currentTemp = scanner.nextDouble();
                    double tempChange = currentTemp - prevTemp;
                    System.out.println("Day " + day + " temperature: " + currentTemp + ", change from previous day: " + tempChange);
                    prevTemp = currentTemp;
                    day++;
                }
            } else {
                System.out.println("No temperatures found in the file.");
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}