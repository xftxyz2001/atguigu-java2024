package com.atguigu.g_lombok;

import lombok.*;

/*@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private Integer age;
}
