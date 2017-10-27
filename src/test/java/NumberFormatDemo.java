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
        System.out.println(nf.format(i));
    }
}