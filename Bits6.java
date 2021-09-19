import java.util.BitSet;

public class Bits6 {
    public static void main(String[] args) {
        // Задание 6.  Обнулить все кроме последних i битов числа N. Вывести результат на консоль в двоичном виде

        int i = 0b1000001;
        int N = 0b1111111;
        i &= N;
        System.out.println(Integer.toBinaryString(i));
        }
    }
