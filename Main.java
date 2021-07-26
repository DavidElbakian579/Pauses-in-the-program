/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro9l4;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author David-pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException{
        countDown();
        printNumbers();
    }
    
    /* 1
    Обратный отсчет
    В методе countDown() происходит обратный отсчет. 
    Тебе нужно сделать так, чтобы между выводом текста в консоль была пауза в 1 секунду. 
    В этом тебе поможет метод sleep(long) класса Thread.
    */
    
    public static void countDown() throws InterruptedException {
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("Старт!");
    }
    
    /* 2
    Counter
    реализуй метод printNumbers(), который выводит числа от 1 до 10 включительно 
    с паузой между выводом каждого числа — 1,3 миллисекунды. 
    В этом тебе поможет метод sleep(long, int) класса Thread.
    */
    
    public static void printNumbers() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i < 10) {
                Thread.sleep(1, 300_000);
            }
        }
    }
    
    /* 3
    Таймер
    В классе Solution реализуй метод setTimer(int, int, int, int, int), 
    который засыпает на определенное время, используя соответствующие методы java.util.concurrent.TimeUnit.
    */
    
    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущен!");
        TimeUnit.DAYS.sleep(days);
        TimeUnit.HOURS.sleep(hours);
        TimeUnit.MINUTES.sleep(minutes);
        TimeUnit.SECONDS.sleep(seconds);
        TimeUnit.MILLISECONDS.sleep(millis);
        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}
