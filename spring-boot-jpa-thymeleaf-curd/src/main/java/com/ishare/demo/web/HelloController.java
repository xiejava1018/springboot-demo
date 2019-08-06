package com.ishare.demo.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ishare.demo.service.UserClassService;
import com.ishare.demo.service.UserService;

@Controller
public class HelloController {

	@Resource
	UserClassService userClassService;
	
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }
    
    @RequestMapping("/getclassbyuser")
    @ResponseBody
    public Page<Object> getclassbyuser(Model model, @RequestParam(value="userid", required=false, defaultValue="1") Integer userId,Pageable pageable) {
        return userClassService.getUserClass(userId,pageable);
    }
}
