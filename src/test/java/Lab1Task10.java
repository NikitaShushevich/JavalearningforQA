import javax.swing.JOptionPane;
public class Lab1Task10 {
    public static void main(String[] args) {
        double eurValue = 0.025;
// Юзер вводить сумму у гривні
        String input = JOptionPane.showInputDialog(null, "Введіть сумму в гривні: ");
        try {
            double result = Double.parseDouble(input);
// тут рахуємо та виводимо резкльтат у діалоговому вікні.
            JOptionPane.showMessageDialog(null, "Кількість євро буде становити: " + (result * eurValue));
        } catch (NumberFormatException e) {
// хендлимо невірний інпут, наприклад коли юзер вводить не число, або число яке виходить за значення int.
            JOptionPane.showMessageDialog(null, "Неправильний формат введення. Можна  ввести тільки числа.", "Помилка", JOptionPane.ERROR_MESSAGE);
        }
    }
}