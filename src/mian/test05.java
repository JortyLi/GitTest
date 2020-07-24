package mian;

/**
 * @author liheng
 * @data 2020-07-24 15:20
 *
 *
 * 算法题
 */
public class test05 {
    public static void main(String[] args) {
        int number = 50;
        int count = 0;

        while (number-3>=0){
            number = number-3;
            number++;
            count +=3;
        }
        if (number+1==3){
            System.out.println("多换了一瓶");
            count++;
        }
        System.out.println(String.format("一共和了%s瓶水",count));
    }
}
