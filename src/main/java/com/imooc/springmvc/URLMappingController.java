package com.imooc.springmvc;

import com.imooc.springmvc.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/um")
public class URLMappingController {


    //
    @GetMapping("/g")
    @ResponseBody
    public String getMapping(String name)
    {
        System.out.println("name :" + name);
        return "This is get method";
    }

    @PostMapping("/p")
    @ResponseBody
    public String postMapping(String username,Long password){
        //User u = new User()
        //u.setUsername(username)
        //request.getParameter()
        System.out.println(username+":"+password);
        return "This is post method";
    }

    @PostMapping("/p1")
    @ResponseBody
    public String postMapping1(User user , String username , @DateTimeFormat(pattern = "yyyy-MM-dd") Date createTime){
        System.out.println(user.getUsername() + ":" + user.getPassword());
        return "<h1>这是Post响应</h1>";
    }

}
