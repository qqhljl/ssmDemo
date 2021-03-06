package com.qqh.web;


import javax.annotation.Resource;  
import javax.servlet.http.HttpServletRequest;  
  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.RequestMapping;  
  

import com.qqh.model.User;  
import com.qqh.service.UserService;  
  
@Controller  
@RequestMapping("/user")  
public class UserController {  
    @Autowired  
    private UserService userService;  
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user =userService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "showUser";  
    }  
}  
