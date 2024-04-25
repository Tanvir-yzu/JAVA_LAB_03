import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TemperatureChanges {
    public static void main(String[] args) {
        String filename = "weather.txt";
        try {
            double[] temperatures = readTemperatures(filename);
            double[] changes = calculateTemperatureChanges(temperatures);
            System.out.println("Temperature changes between neighboring days:");
            for (double change : changes) {
                System.out.println(change);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        }
    }

    public static double[] readTemperatures(String filename) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File(filename))) {
            String line = scanner.nextLine();
            String[] tokens = line.trim().split("\\s+");
            double[] temperatures = new double[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                temperatures[i] = Double.parseDouble(tokens[i]);
            }
            return temperatures;
        }
    }
    public static double[] calculateTemperatureChanges(double[] temperatures) {
        double[] changes = new double[temperatures.length - 1];
        for (int i = 1; i < temperatures.length; i++) {
            changes[i - 1] = temperatures[i] - temperatures[i - 1];
        }
        return changes;
    }
}
