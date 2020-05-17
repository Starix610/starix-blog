package com.starix.blog.controller;

import com.starix.blog.entity.User;
import com.starix.blog.service.UserService;
import com.starix.blog.vo.UserVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 * @author Starix
 * @date 2020-05-03 20:49
 */
@Controller
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String loginPage(){
        return "admin/login";
    }

    @PostMapping("/login")
    public String login(String username, String password, HttpSession session, RedirectAttributes attributes){
        User user = userService.checkUser(username, password);
        if (user != null){
            UserVO userVO = new UserVO();
            BeanUtils.copyProperties(user, userVO);
            session.setAttribute("user", userVO);
            return "admin/index";
        }else {
            attributes.addFlashAttribute("username", username);
            attributes.addFlashAttribute("password", password);
            attributes.addFlashAttribute("message", "用户名或密码错误");
            return "redirect:/admin";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/admin";
    }

}
