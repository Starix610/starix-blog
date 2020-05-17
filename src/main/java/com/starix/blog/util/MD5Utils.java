package com.starix.blog.util;

import org.springframework.util.DigestUtils;

/**
 * @author Starix
 * @date 2020-05-17 19:55
 */
public class MD5Utils {

    public static String encode(String str){
        return DigestUtils.md5DigestAsHex(str.getBytes());
    }

    public static void main(String[] args) {
        System.out.println(encode("646722"));
    }

}
