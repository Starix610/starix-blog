package com.starix.blog.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Starix
 * @date 2020-05-17 17:29
 */
@Data
@NoArgsConstructor
public class UserVO {

    private Integer id;

    private String nickname;

    private String username;

    private String email;

    private String avatar;

    private String type;

}
