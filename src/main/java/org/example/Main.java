package org.example;
import java.util.Scanner;

public class Main {
    private static final double EARTH_RADIUS = 6371;
    // Создание константы для радиуса земли
    public static void main(String[] args) {
        // Создание нового экземпляра класса Scanner для ввода
        Scanner scanner = new Scanner(System.in);
        // Ввод в консоль широты первой точки координат
        System.out.print("Введите широту первой точки: ");
        double width = scanner.nextDouble();
        // Ввод в консоль долготы первой точки координат
        System.out.print("Введите долготу первой точки: ");
        double long1 = scanner.nextDouble();
        // Ввод в консоль широты второй точки координат
        System.out.print("Введите широту второй точки: ");
        double width2 = scanner.nextDouble();
        // Ввод в консоль долготы второй точки координат
        System.out.print("Введите долготу второй точки: ");
        double long2 = scanner.nextDouble();
        // Приводим наши переменны в радиальную меру угла, для подчета в формуле
        width = Math.toRadians(width);
        long1 = Math.toRadians(long1);
        width2 = Math.toRadians(width2);
        long2 = Math.toRadians(long2);
        // Вычисляем расстояние с помощью формулы гаверсинусов (для удобства чтения формула была разделена)
        double a = Math.pow(Math.sin((width2 - width) / 2), 2);
        double b = a + Math.cos(width) * Math.cos(width2) * Math.pow(Math.sin((long2 - long1) / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(b), Math.sqrt(1 - b));
        // Выводим произведения результата вычисления из формулы и нашей константы
        System.out.println("Расстояние между двумя точками: " + EARTH_RADIUS * c + " км");
        // В конце закрываем сканер
        scanner.close();
    }
}
