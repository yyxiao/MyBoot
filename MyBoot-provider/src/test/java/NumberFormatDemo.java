import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * NumberFormatTest
 * PACKAGE_NAME
 *
 * @author xiaoyy
 * //Java 中给数字左边补0
 * @Date 2017-10-27 上午11:29
 * The word 'impossible' is not in my dictionary.
 */
public class NumberFormatDemo {

    public static void main(String[] args) {

        //例一：
        // 待测试数据
        int i = 1;
        // 得到一个NumberFormat的实例
        NumberFormat nf = NumberFormat.getInstance();
        // 设置是否使用分组
        nf.setGroupingUsed(false);
        // 设置最大整数位数
        nf.setMaximumIntegerDigits(4);
        // 设置最小整数位数
        nf.setMinimumIntegerDigits(4);
        // 输出测试语句
        System.out.println("first :" + nf.format(i));

        //例二：
        int youNumber = 1;
        // 0 代表前面补充0
        // 4 代表长度为4
        // d 代表参数为正数型
        String str = String.format("%04d", youNumber);
        System.out.println("second :" + str); // 0001

        //例三：
        //流水号加1后返回，流水号长度为4
        String STR_FORMAT = "0000";

        Integer intHao = Integer.parseInt("0");
        intHao++;
        DecimalFormat df = new DecimalFormat(STR_FORMAT);
        System.out.println("third :" + df.format(intHao)); // 0001
    }



}