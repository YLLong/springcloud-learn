package com.yll.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @className: User
 * @description: // 用户实体
 * @author: yys1778
 * @date: Created in 2019/4/17 9:15
 * @modify by: yys1778
 * @version: V1.0
 */
@Data
@AllArgsConstructor
public class User {

    private String userName;

    private String password;

    private int age;

}
