package com.ishikawa.springdemo.controllers;

/**
 * Created by Shpak on 18.06.2017.
 */

import com.ishikawa.springdemo.model.BlogEntity;
import com.ishikawa.springdemo.repository.BlogRepository;
import com.ishikawa.springdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    BlogRepository blogRepository;

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/")
    String showIndexPage(ModelMap modelMap) {
        System.out.println("Start use showIndexPage");
        List<BlogEntity> blogList = blogRepository.findAll();
        modelMap.addAttribute("blogList", blogList);
        return "index";
    }

    @GetMapping(value = "/blogs/add")
    String showAddUserPage(ModelMap modelMap) {
        System.out.println("Start use showIndexPage");
        List<BlogEntity> blogList = blogRepository.findAll();
        modelMap.addAttribute("blogList", blogList);
        return "index";
    }
}
