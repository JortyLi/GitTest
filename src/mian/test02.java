package mian;

import java.util.Scanner;

/**
 * @author liheng
 * @data 2020-06-01 15:00
 */
public class test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int next = scanner.nextInt();
        StringBuilder builder = new StringBuilder(String.valueOf(next));
        System.out.println(builder.reverse());

    }
}
