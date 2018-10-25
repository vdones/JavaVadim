package JavaProblemSolving;

public class Pi {

    //https://habr.com/post/188700/  ----------------------------------------------------------

    //TODO: Another variant of implementing
    public static String piSpigot(int numbers) {
        // найденные цифры сразу же будем записывать в StringBuilder
        StringBuilder pi = new StringBuilder(numbers);
        int boxes = numbers * 10 / 3;	// размер массива
        int reminders[] = new int[boxes];
        // инициализируем масив двойками
        for (int i = 0; i < boxes; i++) {
            reminders[i] = 2;
        }
        int heldDigits = 0;    // счётчик временно недействительных цифр
        for (int i = 0; i < numbers; i++) {
            int carriedOver = 0;    // перенос на следующий шаг
            int sum = 0;
            for (int j = boxes - 1; j >= 0; j--) {
                reminders[j] *= 10;
                sum = reminders[j] + carriedOver;
                int quotient = sum / (j * 2 + 1);   // результат деления суммы на знаменатель
                reminders[j] = sum % (j * 2 + 1);   // остаток от деления суммы на знаменатель
                carriedOver = quotient * j;   // j - числитель
            }
            reminders[0] = sum % 10;
            int q = sum / 10;	// новая цифра числа Пи
            // регулировка недействительных цифр
            if (q == 9) {
                heldDigits++;
            } else if (q == 10) {
                q = 0;
                for (int k = 1; k <= heldDigits; k++) {
                    int replaced = Integer.parseInt(pi.substring(i - k, i - k + 1));
                    if (replaced == 9) {
                        replaced = 0;
                    } else {
                        replaced++;
                    }
                    pi.deleteCharAt(i - k);
                    pi.insert(i - k, replaced);
                }
                heldDigits = 1;
            } else {
                heldDigits = 1;
            }
            pi.append(q);	// сохраняем найденную цифру
        }
        if (pi.length() >= 2) {
            pi.insert(1, '.');	// добавляем в строчку точку после 3
        }
        return pi.toString();
    }


    public static double roundPi( int number){
        double sum = 0;
        for(int i = 1; i < Short.MAX_VALUE; i++){
            if(i%2 == 0)
                sum += -4 / ( 2 * (double)i - 1);
            else
                sum += 4 / (2 * (double)i - 1);
        }

        return (Math.round((Math.pow(10, number)) * sum))/(Math.pow(10, number));
    }
}
