

import java.sql.SQLOutput;
import java.util.Random;

// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
public class Main {
    public static void main(String[] args) {
        int min = 0;
        int max = 2000;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1) + min;
        System.out.println(i);

    
// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = i % 12;
        System.out.println(n);
        

//3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

//        System.out.println(Short.MAX_VALUE);



//    4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

//        System.out.println(Short.MIN_VALUE);

