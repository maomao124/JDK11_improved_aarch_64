

## Unicode 10

升级现有平台的API，支持Unicode 10，

Unicode10的标准请参考网站（http://unicode.org/versions/Unicode 10.0.0） 目前支持最新的Unicode的类主要有

* java.lang包下的Character, String
* java.awt.font下的相关类
* java.text包下的Bidi,Normalizer等





```sh
package mao;

/**
 * Project name(项目名称)：JDK11_improved_aarch_64
 * Package(包名): mao
 * Class(类名): Test1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/11/2
 * Time(创建时间)： 18:01
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test1
{
    public static void main(String[] args)
    {
        System.out.println("\uD83E\uDD93");
        System.out.println("\uD83E\uDD92");
        System.out.println("\uD83E\uDDDA");
        System.out.println("\uD83E\uDDD9");
        System.out.println("\uD83E\uDDD1");
        System.out.println("\uD83E\uDDD8");
        System.out.println("\uD83E\uDD95");
        System.out.println("\uD83E\uDD2e");
    }
}

```



```sh
🦓
🦒
🧚
🧙
🧑
🧘
🦕
🤮
```





## 改进Aarch64函数

改进现有的字符串和数组函数，并在Aarch64处理器上为java.lang.Math 下的sin , cos 和log函数实现新的内联函数。从而实现专用的CPU架构下提高应用程序的性能

```java
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
```



