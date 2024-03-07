package com.atguigu.e_newjdk;

public class Test05 {
    public static void main(String[] args) {
        //method01();
        //method02();
        //method03();
        method04();
    }

    /**
     * jdk13之后
     */
    private static void method04() {
        int month = 5;
        var seson = switch (month) {
            case 12, 1, 2 -> {
                yield "冬季";
            }
            case 3, 4, 5 -> {
                yield "春季";
            }
            case 6, 7, 8 -> {
               yield "夏季";
            }
            case 9, 10, 11 -> {
               yield "秋季";
            }
            default -> {
               yield "有毛病";
            }
        };
        System.out.println("seson = " + seson);
    }

    /**
     * jdk13之前想要拿到switch结果,需要定义一个变量,然后为其赋值
     */
    private static void method03() {
        int month = 5;
        String season = "";
        switch (month) {
            case 12, 1, 2:
                season = "冬季";
                break;
            case 3, 4, 5:
                season = "春季";
                break;
            case 6, 7, 8:
                season = "夏季";
                break;
            case 9, 10, 11:
                season = "秋季";
                break;
            default:
                season = "有毛病";
                break;
        }
        System.out.println("season = " + season);
    }

    private static void method02() {
        int month = 5;
        switch (month) {
            case 12, 1, 2 -> System.out.println("冬季");
            case 3, 4, 5 -> System.out.println("春季");
            case 6, 7, 8 -> System.out.println("夏季");
            case 9, 10, 11 -> System.out.println("秋季");
            default -> System.out.println("有毛病呀,没有这个月份");

        }
    }

    /**
     * 如果用:
     * break不写依然会case穿透性
     */
    private static void method01() {
        int month = 5;
        switch (month) {
            case 12, 1, 2:
                System.out.println("冬季");
                break;
            case 3, 4, 5:
                System.out.println("春季");
                break;
            case 6, 7, 8:
                System.out.println("夏季");
                break;
            case 9, 10, 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("有毛病呀,没有这个月份");
                break;
        }
    }
}
