import java.io.File;

public class Hello {
    public static void main(String[] args) {
        try {
            var z = calculate();
            System.out.println(z);

        } catch ( ArithmeticException exception) {         //что у нас ArithmeticException, мы знаем из предыдущего лога - пропечатано серым
            exception.printStackTrace();    //вывести сообщение об исключении
        }
    }
    private static int calculate() {
        var x = 1;
        var y = 0;
        var z = divide(x, y);
        return z;
    }

    private static int divide(int x, int y) {
        var z = x / y;
        return z;

    }
}
