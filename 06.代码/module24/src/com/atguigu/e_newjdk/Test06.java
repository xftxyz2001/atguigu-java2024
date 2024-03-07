package com.atguigu.e_newjdk;

public class Test06 {
    public static void main(String[] args) {
        String s = "<html>\n" +
                "  <body>\n" +
                "      <p>Hello, 尚硅谷</p>\n" +
                "  </body>\n" +
                "</html>";
        System.out.println(s);

        String s1 = """
                <html>
                  <body>
                      <p>Hello, 尚硅谷</p>
                  </body>
                </html>
                """;

        String s2 = """ 
                haha """;
        System.out.println(s1);
    }
}
