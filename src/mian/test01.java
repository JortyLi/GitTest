package mian;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liheng
 * @data 2020-06-01 11:47
 */
public class test01 {
    public static void main(String[] args) {
        List<Integer>lists = Arrays.asList(111,222,333,444,111,333);
        //disint(lists);

        List<Studtent>stList = new ArrayList<>();
        stList.add(new Studtent("张三",15,"广州"));
        stList.add(new Studtent("李四",15,"上海"));
        stList.add(new Studtent("王五",17,"广州"));
        stList.add(new Studtent("麻子",18,"上海"));
        fifter(stList);
    }

    private static void fifter(List<Studtent> stList) {
        System.out.println(stList.stream().filter(studtent -> "上海".equals(studtent.getAddr())).collect(Collectors.toList()));
        System.out.println("=======================");
        stList.stream().filter(s -> s.getAge() > 15).collect(Collectors.toList()).forEach(System.out::println);
    }

    private static void disint(List<Integer> lists) {
        ArrayList<Integer> list = new ArrayList<>();
        lists.stream().distinct().forEach(System.out::println);
    }
}
class Studtent{
    private String name;
    private Integer age;
    private String addr;

    @Override
    public String toString() {
        return "Studtent{" + "name='" + name + '\'' + ", age=" + age + ", addr='" + addr + '\'' + '}';
    }

    public Studtent(String name, Integer age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddr() {
        return addr;
    }
}