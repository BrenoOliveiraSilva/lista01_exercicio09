import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        double fahrenheit = 0;
        boolean validInput = false;
        DecimalFormat numberFormat = new DecimalFormat("#.00");

        while (!validInput) {
            String input_1 = JOptionPane.showInputDialog(null, "Informe a temperatura em Fahrenheit");
            try {
                fahrenheit = Double.parseDouble(input_1);
                validInput = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida!");
            }
        }
        double celsius = 5 * ((fahrenheit - 32) / 9);
        JOptionPane.showMessageDialog(null, "A temperatura em graus Celsius é de " + numberFormat.format(celsius) + " ºC");
    }
}
