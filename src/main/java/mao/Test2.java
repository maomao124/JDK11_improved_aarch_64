package mao;

import java.util.concurrent.TimeUnit;

/**
 * Project name(项目名称)：JDK11_improved_aarch_64
 * Package(包名): mao
 * Class(类名): Test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/2
 * Time(创建时间)： 18:06
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test2
{
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000000; i++)
        {
            Math.sin(i);
            Math.cos(i);
            Math.log(i);
        }
        long endTime = System.nanoTime();
        // JDK 11下耗时：476ms
        // JDK 8前耗时：4369ms
        System.out.println(TimeUnit.NANOSECONDS.toMillis(endTime - startTime) + "ms");
    }
}
