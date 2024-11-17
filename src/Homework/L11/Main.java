package Homework.L11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static String getKey(HashMap<String, Integer> rim, Integer value) {
        String key = null;
        for (Map.Entry<String, Integer> entry : rim.entrySet()) {
            if ((value == null && entry.getValue() == null) || (value != null && value.equals(entry.getValue()))) {
                key = entry.getKey();
                break;
            }
        }
        return key;
    }

    public static String calc(String input) {
        int a = 0; // Результат арифмитической операции
        String s = input;
        String k = "";
        String q = "";
        String qw1 = "";
        String qw2 = "";
        boolean game_is_on = true;

        HashMap<String, Integer> rim = new HashMap<>();

        rim.put("I", 1);
        rim.put("II", 2);
        rim.put("III", 3);
        rim.put("IV", 4);
        rim.put("V", 5);
        rim.put("VI", 6);
        rim.put("VII", 7);
        rim.put("VIII", 8);
        rim.put("IX", 9);
        rim.put("X", 10);
        rim.put("XI", 11);
        rim.put("XII", 12);
        rim.put("XIII", 13);
        rim.put("XIV", 14);
        rim.put("XV", 15);
        rim.put("XVI", 16);
        rim.put("XVII", 17);
        rim.put("XVIII", 18);
        rim.put("XIX", 19);
        rim.put("XX", 20);
        rim.put("XXI", 21);
        rim.put("XXII", 22);
        rim.put("XXIII", 23);
        rim.put("XXIV", 24);
        rim.put("XXV", 25);
        rim.put("XXVI", 26);
        rim.put("XXVII", 27);
        rim.put("XXVIII", 28);
        rim.put("XXIX", 29);
        rim.put("XXX", 30);
        rim.put("XXXI", 31);
        rim.put("XXXII", 32);
        rim.put("XXXIII", 33);
        rim.put("XXXIV", 34);
        rim.put("XXXV", 35);
        rim.put("XXXVI", 36);
        rim.put("XXXVII", 37);
        rim.put("XXXVIII", 38);
        rim.put("XXXIX", 39);
        rim.put("XL", 40);
        rim.put("XLI", 41);
        rim.put("XlII", 42);
        rim.put("XLIII", 43);
        rim.put("XLIV", 44);
        rim.put("XLV", 45);
        rim.put("XLVI", 46);
        rim.put("XLVII", 47);
        rim.put("XLVIII", 48);
        rim.put("XLIX", 49);
        rim.put("L", 50);
        rim.put("LI", 51);
        rim.put("LII", 52);
        rim.put("LIII", 53);
        rim.put("LIV", 54);
        rim.put("LV", 55);
        rim.put("LVI", 56);
        rim.put("LVII", 57);
        rim.put("LVIII", 58);
        rim.put("LIX", 59);
        rim.put("LX", 60);
        rim.put("LXI", 61);
        rim.put("LXII", 62);
        rim.put("LXIII", 63);
        rim.put("LXIV", 64);
        rim.put("LXV", 65);
        rim.put("LXVI", 66);
        rim.put("LXVII", 67);
        rim.put("LXVIII", 68);
        rim.put("LXIX", 69);
        rim.put("LXX", 70);
        rim.put("LXXI", 71);
        rim.put("LXXII", 72);
        rim.put("LXXIII", 73);
        rim.put("LXXIV", 74);
        rim.put("LXXV", 75);
        rim.put("LXXVI", 76);
        rim.put("LXXVII", 77);
        rim.put("LXXVIII", 78);
        rim.put("LXXIX", 79);
        rim.put("LXXX", 80);
        rim.put("LXXXI", 81);
        rim.put("LXXXII", 82);
        rim.put("LXXXIII", 83);
        rim.put("LXXXIV", 84);
        rim.put("LXXXV", 85);
        rim.put("LXXXVI", 86);
        rim.put("LXXXVII", 87);
        rim.put("LXXXVIII", 88);
        rim.put("LXXXIX", 89);
        rim.put("XC", 90);
        rim.put("XCI", 91);
        rim.put("XCII", 92);
        rim.put("XCIII", 93);
        rim.put("XCIV", 94);
        rim.put("XCV", 95);
        rim.put("XCVI", 96);
        rim.put("XCVII", 97);
        rim.put("XCVIII", 98);
        rim.put("XCIX", 99);
        rim.put("C", 100);

        String[] arabInt = new String[10];

        arabInt[0] = "1";
        arabInt[1] = "2";
        arabInt[2] = "3";
        arabInt[3] = "4";
        arabInt[4] = "5";
        arabInt[5] = "6";
        arabInt[6] = "7";
        arabInt[7] = "8";
        arabInt[8] = "9";
        arabInt[9] = "10";


        if (s.indexOf('+') != -1) {
            String[] str = s.split("\\+");

            for (String qq : arabInt) {
                if (str[0].equals(qq)) {
                    qw1 = qq;
                }
            }
            for (String qq : arabInt) {
                if (str[1].equals(qq)) {
                    qw2 = qq;
                }
            }

            if (!str[0].trim().equals(qw1) && !str[1].trim().equals(qw2)) {
                if (rim.get(str[0].trim()) <= 10 && rim.get(str[1].trim()) <= 10) {
                    a = rim.get(str[0].trim()) + rim.get(str[1].trim());
                    k = getKey(rim, a);
                    if (k == null) {
                        System.out.println("Ошибка, т.к. в римской системе нет отрицательных чисел");
                    }
                }
            } else if (str[0].trim().equals(qw1) && str[1].trim().equals(qw2)) {
                if (Integer.parseInt(str[0].trim()) <= 10 && Integer.parseInt(str[1].trim()) <= 10) {
                    if (str.length >= 3) {
                        a = Integer.parseInt(str[0].trim()) + Integer.parseInt(str[1].trim());
                        k = String.valueOf(a);
                    } else {
                        System.out.println("Ошибка, т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                    }
                }
            } else {
                System.out.println("Ошибка, т.к. используются одновременно разные системы счисления");
            }
        } else if (s.indexOf('-') != -1) {
            String[] str = s.split("\\-");
            for (String qq : arabInt) {
                if (str[0].equals(qq)) {
                    qw1 = qq;
                }
            }
            for (String qq : arabInt) {
                if (str[1].equals(qq)) {
                    qw2 = qq;
                }
            }

            if (!str[0].trim().equals(qw1) && !str[1].trim().equals(qw2)) {
                if (rim.get(str[0].trim()) <= 10 && rim.get(str[1].trim()) <= 10) {
                    a = rim.get(str[0].trim()) - rim.get(str[1].trim());
                    k = getKey(rim, a);
                    if (k == null) {
                        System.out.println("Ошибка, т.к. в римской системе нет отрицательных чисел");
                    }
                }
            } else if (str[0].trim().equals(qw1) && str[1].trim().equals(qw2)) {
                if (Integer.parseInt(str[0].trim()) <= 10 && Integer.parseInt(str[1].trim()) <= 10) {
                    if (str.length <= 2) {
                        a = Integer.parseInt(str[0].trim()) - Integer.parseInt(str[1].trim());
                        k = String.valueOf(a);
                    } else {
                        System.out.println("Ошибка, т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                    }
                }
            } else {
                System.out.println("Ошибка, т.к. используются одновременно разные системы счисления");
            }
        } else if (s.indexOf('*') != -1) {

            String[] str = s.split("\\*");
            for (String qq : arabInt) {
                if (str[0].equals(qq)) {
                    qw1 = qq;
                }
            }
            for (String qq : arabInt) {
                if (str[1].equals(qq)) {
                    qw2 = qq;
                }
            }

            if (!str[0].trim().equals(qw1) && !str[1].trim().equals(qw2)) {
                if (rim.get(str[0].trim()) <= 10 && rim.get(str[1].trim()) <= 10) {
                    a = rim.get(str[0].trim()) * rim.get(str[1].trim());
                    k = getKey(rim, a);
                    if (k == null) {
                        System.out.println("Ошибка, т.к. в римской системе нет отрицательных чисел");
                    }
                }
            } else if (str[0].trim().equals(qw1) && str[1].trim().equals(qw2)) {
                if (Integer.parseInt(str[0].trim()) <= 10 && Integer.parseInt(str[1].trim()) <= 10) {
                    if (str.length <= 2) {
                        a = Integer.parseInt(str[0].trim()) * Integer.parseInt(str[1].trim());
                        k = String.valueOf(a);
                    } else {
                        System.out.println("Ошибка, т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                    }
                }
            } else {
                System.out.println("Ошибка, т.к. используются одновременно разные системы счисления");
            }
        } else if (s.indexOf('/') != -1) {

            String[] str = s.split("\\/");
            for (String qq : arabInt) {
                if (str[0].equals(qq)) {
                    qw1 = qq;
                }
            }
            for (String qq : arabInt) {
                if (str[1].equals(qq)) {
                    qw2 = qq;
                }
            }

            if (!str[0].trim().equals(qw1) && !str[1].trim().equals(qw2)) {
                if (rim.get(str[0].trim()) <= 10 && rim.get(str[1].trim()) <= 10) {
                    a = rim.get(str[0].trim()) / rim.get(str[1].trim());
                    k = getKey(rim, a);
                    if (k == null) {
                        System.out.println("Ошибка, т.к. в римской системе нет отрицательных чисел");
                    }
                }
            } else if (str[0].trim().equals(qw1) && str[1].trim().equals(qw2)) {
                if (Integer.parseInt(str[0].trim()) <= 10 && Integer.parseInt(str[1].trim()) <= 10) {
                    if (str.length <= 2) {
                        a = Integer.parseInt(str[0].trim()) / Integer.parseInt(str[1].trim());
                        k = String.valueOf(a);
                    } else {
                        System.out.println("Ошибка, т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                    }
                }
            } else {
                System.out.println("Ошибка, т.к. используются одновременно разные системы счисления");
            }
        } else {
            System.out.println("Ошибка, т.к. строка не является математической операцией");
        }
        return k;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: ");
        String name = scanner.nextLine().toUpperCase();

        System.out.println("Output: " + calc(name));
    }


}
