# 模块三 idea_运算符

```java
模块二的回顾:
  1.常量:在代码的运行过程中,值不会发生改变的数据
    a.整数常量:所有的整数
    b.小数常量:所有带小数点的  2.0
    c.字符常量:带单引号的,单引号中必须有,且只能有一个内容
    d.字符串常量:带双引号的
    e.布尔常量:true false -> 可以当条件判断使用
    f.空常量:null 代表数据不存在,所以不能直接使用
  2.变量:在代码的运行过程中,会根据不同的情况而随时可以改变的数据
    a.定义:
      数据类型 变量名 = 值 -> 将等号右边的值赋值给等号左边的变量
    b.数据类型:
      基本类型:byte short int long float double boolean char
      引用类型:类 数组 接口 枚举 注解
          
  3.数据类型转换:等号左右两边类型不一致时,或者不同的类型做运算
    a.自动类型转换:小转大
      将取值范围小的类型赋值给取值范围大的类型
      取值范围小的类型和取值范围大的类型之间做运算
    b.强转:大转小
      取值范围小的数据类型 变量名 = (取值范围小的数据类型)取值范围大的数据类型
        
        
模块三的重点:
  all
```

# 第一章.IDEA的使用

## 1.idea的介绍

```java
1.概述:开发工具
2.特点:
  a.idea是java写的,所以本地上必须有正确的jdk环境(JAVA_HOME)
  b.idea自动保存
  c.不用我们打开dos命令窗口执行javac和java命令
  d.idea有强大的快捷键,生成代码,纠错等
  e.idea会自动管理我们写的代码
      
3.相关开发工具:eclipse myeclipse   
    
4.作用:加速我们的开发    
```

<img src="img/1698654549891.png" alt="1698654549891" style="zoom:80%;" />

## 2.idea的目录结构

<img src="img/1698655258798.png" alt="1698655258798" style="zoom:80%;" />

> 先创建project,在project下创建module,在module下创建package -> 必须记住

## 3.Project的操作

### 3.1.project的创建

<img src="img/1698656313192.png" alt="1698656313192" style="zoom:80%;" />



### 3.2再次创建一个新的Project

<img src="img/1698656369654.png" alt="1698656369654" style="zoom:80%;" />



<img src="img/1698656431983.png" alt="1698656431983" style="zoom:80%;" />



<img src="img/1698656486848.png" alt="1698656486848" style="zoom:80%;" />

### 3.3.关闭Project

```java
file-> close project
```

<img src="img/1698656529824.png" alt="1698656529824" style="zoom:80%;" />



### 3.4.打开project

<img src="img/1698656643041.png" alt="1698656643041" style="zoom:80%;" />

## 4.module的操作

### 4.1.创建module

<img src="img/1698657956849.png" alt="1698657956849" style="zoom:80%;" />



<img src="img/1698658056821.png" alt="1698658056821" style="zoom:80%;" />

### 4.2.关闭module

```java
a.对着要关闭的module右键 -> remove module -> 此时是关闭,不是真正的删除module
b.再对着关闭的module右键-> delete -> 从本地上真正删除
```

<img src="img/1698658178382.png" alt="1698658178382" style="zoom:80%;" />



<img src="img/1698658250143.png" alt="1698658250143" style="zoom:80%;" />![1698658413831](img/1698658413831.png)



### 4.3.导入已有的module

<img src="img/1698658424190.png" alt="1698658424190" style="zoom:80%;" />



<img src="img/1698658530931.png" alt="1698658530931" style="zoom:80%;" />

## 5.package的操作

### 5.1创建

<img src="img/1698659767078.png" alt="1698659767078" style="zoom:80%;" />

### 5.2 package的删除

```java
右键-> delete
```

<img src="img/1698659832251.png" alt="1698659832251" style="zoom:80%;" />

### 5.3 package取名字规范

```java
1.公司域名倒着写:
  比如:尚硅谷  域名为:www.atguigu.com
  我们写代码创建包: com.atguigu
```

<img src="img/1698660235926.png" alt="1698660235926" style="zoom:80%;" />

## 6.创建类以及基本语句生成快捷键

<img src="img/1698660395965.png" alt="1698660395965" style="zoom:80%;" />

<img src="img/1698660554481.png" alt="1698660554481" style="zoom:80%;" />



> 1.生成main方法:输入main -> 回车
>
> 2.生成输出语句:sout -> 回车
>
> 3.将变量名放到输出语句中:
>
>    a.变量名.sout
>
>    b.变量名.soutv -> 带字符串平拼接格式的输出方式-> 输出格式好看

## 7.基本设置

### 7.1设置字体

```java
file-settings
```

<img src="img/1698660971384.png" alt="1698660971384" style="zoom:80%;" />

### 7.2设置提示的快捷键

```java
file-settings
```

<img src="img/1698661137410.png" alt="1698661137410" style="zoom:80%;" />![1698661320028](img/1698661320028.png)

### 7.3 设置注释字体

![1698661320028](img/1698661320028.png)

## 8.快捷键

| 快捷键               | 功能                                   |
| -------------------- | -------------------------------------- |
| `Alt+Enter`          | 导入包，自动修正代码(重中之重)         |
| `Ctrl+Y`             | 删除光标所在行                         |
| `Ctrl+D`             | 复制光标所在行的内容，插入光标位置下面 |
| `Ctrl+Alt+L`         | 格式化代码                             |
| `Ctrl+/`             | 单行注释                               |
| `Ctrl+Shift+/`       | 选中代码注释，多行注释，再按取消注释   |
| `Alt+Shift+上下箭头` | 移动当前代码行                         |

> 先写等号右边的,可以自动生成等号左边的变量
>
> <img src="img/1698662119415.png" alt="1698662119415" style="zoom:80%;" />

或者

> <img src="img/1698662152111.png" alt="1698662152111" style="zoom:80%;" />

## 9.出现的问题

```java
1.在运行代码时会出现"找不到对应的发行源"或者"不支持发行版本"或者"无效的发行源版本",证明本地jdk版本和idea中的language level不匹配
  所以要匹配版本
  file->project Structure->点击project->引入本地jdk->project level选择对应的版本
2.没有out路径的问题
  out路径是专门存放idea自动编译生成的.class文件的
  所以需要指明out路径
    
3.src是灰色的,对着src,右键,选项中没有java class或者package
    
4.刚使用,jdk没有配置
```

<img src="img/1698663293553.png" alt="1698663293553" style="zoom:80%;" />

<img src="img/1698663426985.png" alt="1698663426985" style="zoom:80%;" />

# 第二章.运算符

## 1.算数运算符

| 符号 | 说明                                                         |
| ---- | ------------------------------------------------------------ |
| +    | 加法                                                         |
| -    | 减法                                                         |
| *    | 乘法                                                         |
| /    | 除法<br>如果符号前后都是整数,结果取整数部分<br>如果符号前后有一个为小数,结果就是正常小数 |
| %    | 模,取余数部分                                                |

```java
public class Demo01Arithmetic {
    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        int add = i+j;//推荐使用
        System.out.println(add);//13
        System.out.println(i+j);//13

        int sub = i-j;
        System.out.println(sub);//7

        int mul = i*j;
        System.out.println(mul);//30

        int div = i/j;
        System.out.println(div);//3

        int mo = i%j;
        System.out.println(mo);//1
    }
}
```

```java
+:
  1.运算
  2.字符串拼接:任何类型的数据遇到字符串都会变成字符串,此时+就不再是运算了,而是字符串拼接,将内容直接往后拼接    
 
```

```java
public class Demo02Arithmetic {
    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        System.out.println(i+j+"");//13
        System.out.println(i+j+""+1);//131
        System.out.println(i+""+j);//103

        System.out.println("i和j相加只和为:"+(i+j));
    }
}
```

### 1.2.自增自减运算符(也算算数运算符的一种)

```java
1.格式:
  变量++ -> 后自加
  ++变量 -> 前自加
  变量-- -> 后自减
  --变量 -> 前自减
      
  自增和自减只变化1
      
2.使用:
  a.单独使用: ++ -- 单独为一句,没有和其他的语句掺和使用
    i++;

    符号前在在后都是先运算
        
  b.混合使用: ++ -- 和其他的语句掺和使用了(比如:输出语句,赋值语句)
    符号在前:先运算,在使用运算后的值
    符号在后:先使用原值,使用完毕之后,自身再运算
      
```

```java
public class Demo03Arithmetic {
    public static void main(String[] args) {
        int i = 10;
        //i++;
        ++i;
        System.out.println("i = " + i);

        System.out.println("==================");

        int j = 100;
        int result01 = ++j;
        System.out.println("result01 = " + result01);//101
        System.out.println(j);//101

        System.out.println("==================");
        int k = 10;
        int result02 = k++;
        System.out.println("result02 = " + result02);
        System.out.println(k);

        System.out.println("==================");

        int z = 100;
        System.out.println(z++);
        System.out.println(z);

        System.out.println("==================");

        int x = 10;
        int y = 20;

        /*
           10+19 = 29
           29+12 = 41

           以后开发肯定不会这么写
         */

        int result03 = x++ + --y + ++x;
        System.out.println("result03 = " + result03);

        System.out.println("=======================");

        int c = 10;
        c = c++;
        System.out.println(c);//10
        System.out.println(c);//10

    }
}
```

<img src="img/1698743122044.png" alt="1698743122044" style="zoom:80%;" />

## 3.赋值运算符

```java
1.基本赋值运算符:
  =  -> 先看等号右边的,再将右边的数据赋值给等号左边的变量
      
2.复合赋值运算符:
  +=:
    int i = 10;
    i+=2 -> i = i+2
       
        
  -=
  *=
  /=  : 取整数部分
  %=  : 取余数部分  
      
3.注意:byte short 遇到复合赋值运算符,jvm会自动转型      
```

```java
public class Demo01Assignment {
    public static void main(String[] args) {
        int i = 10;
        i+=2;//i = i+2
        System.out.println(i);
    }
}
```

```java
public class Demo02Assignment {
    public static void main(String[] args) {
        byte b = 10;
        //b = (byte)(b + 1);
        b+=1;//b = b+1
        System.out.println(b);
    }
}
```

## 4.关系运算符(比较运算符)

```java
1.结果:boolean型 -> 要么是true,要么是false
2.作用:做条件判断使用    
```

| 符号 | 说明                                                       |
| ---- | ---------------------------------------------------------- |
| ==   | 如果符号前后相等为true;否则为false                         |
| >    | 如果符号前的数据大于符号后的数据为true,否则为false         |
| <    | 如果符号前的数据小于符号后的数据为true,否则为false         |
| >=   | 如果符号前的数据大于或者等于符号后的数据为true,否则为false |
| <=   | 如果符号前的数据小于或者等于符号后的数据为true,否则为false |
| !=   | 如果符号前后不相等为true;否则为false                       |

```java
public class Demo01Compare {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;

        boolean result01 = i == j;
        System.out.println("result01 = " + result01);//false
        System.out.println(i>j);//false
        System.out.println(i<j);//true
        System.out.println(i>=j);//false
        System.out.println(i<=j);//true
        System.out.println(i!=j);//true

    }
}
```

## 5.逻辑运算符

```java
 1.作用:连接多个boolean结果的
 2.结果:boolean型结果    
```

| 符号        | 说明                                                         |
| ----------- | ------------------------------------------------------------ |
| &&(与,并且) | 有假则假,符号前后有一个结果为false,整体就是false             |
| \|\|(或者)  | 有真则真,符号前后有一个结果为true,整体就是true               |
| !(非,取反)  | 不是true,就是false;不是false,就是true                        |
| ^(异或)     | 符号前后结果一样为false;不一样为true<br>true^true -> false<br>true^false -> true<br>false^true -> true<br>false^false -> false |

```java
public class Demo01Logic {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = 10;

        boolean result01 = (i>j) && (i==k);
        System.out.println("result01 = " + result01);//false

        boolean result02 = (i>j) || (i==k);
        System.out.println("result02 = " + result02);//true

        boolean result03 = (i>j) ^ (i==k);//false ^ true
        System.out.println("result03 = " + result03);//true

        boolean result04 = !(i>j) ;
        System.out.println("result04 = " + result04);//true
    }
}

```

> | 符号 | 说明                                                         |
> | ---- | ------------------------------------------------------------ |
> | &    | 1.单与,如果前后都是布尔型,有假则假,但是如果符号前为false,符号后的判断会继续执行<br>2.如果该符号前后都是数字,看做是位运算符 |
> | &&   | 1.双与,有假则假,但是有短路效果,如果符号前为false,符号后的判断就不会执行了 |
> | \|   | 1.单或,如果前后都是布尔型,有真则真,但是如果符号前为true,符号后的判断会继续执行<br>2.如果该符号前后都是数字,看做是位运算符 |
> | \|\| | 1.双或,有真则真,但是有短路效果,如果符号前为true,符号后的判断就不会执行了 |
>
> ```java
> public class Demo02Logic {
>     public static void main(String[] args) {
>         int a = 10;
>         int b = 20;
>         //boolean result01 = (++a>100)&(++b>10);
>         //boolean result01 = (++a > 100) && (++b > 10);
> 
>         //boolean result01 = (++a<100)|(++b>10);
>         boolean result01 = (++a<100)||(++b>10);
>         System.out.println("result01 = " + result01);
>         System.out.println("a = " + a);
>         System.out.println("b = " + b);
>     }
> }
> ```
>
> 问题:定义一个变量(a),随意给一个值,判断这个变量接收的值是否在1-100之间
>
> 1<=a<=100 -> 错误,这是数学写法
>
> i>=1 && i<=100 -> java写法,用逻辑运算符拼接多个判断

## 6.三元运算符

```java
1.格式:
  boolean表达式?表达式1:表达式2
      
2.执行流程:
  先判断,如果是true,就走?后面的表达式1,否则就走:后面的表达式2
```

### 6.1练习1

```java
需求:小明考完试了,判断小明的分数是否及格,返回结果
```

```java
public class Demo01Ternary {
    public static void main(String[] args) {
        //定义一个变量,表示小明的分数
        int score = 60;
        String result = score>=60?"及格":"不及格";
        System.out.println("result = " + result);
    }
}
```

### 6.2练习2

```java
有两个老人,年龄分别为70  80  求出两个老人的最高年龄
```

```java
public class Demo02Ternary {
    public static void main(String[] args) {
        int old1 = 70;
        int old2 = 80;
        
        int max = old1>old2?old1:old2;
        System.out.println("max = " + max);
    }
}
```

### 6.3 练习3

```java
有三个老人,年龄分别为70  80  60  求出三个老人的最高年龄
```

```java
public class Demo03Ternary {
    public static void main(String[] args) {
        int old1 = 70;
        int old2 = 80;
        int old3 = 60;

        int temp = old1>old2?old1:old2;

        int max = temp>old3?temp:old3;
        System.out.println("max = " + max);
    }
}
```

