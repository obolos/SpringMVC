package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/")
    public String base(@RequestParam(value="name", required = false, defaultValue = "stranger") String name, Model model) {
        model.addAttribute("msg", "Hello " + name);
        return "index";
    }

    @GetMapping("/view/{name}")
    public String view(@PathVariable("name") String name, Model model) {
        model.addAttribute("msg", "Hello " + name);
        return "index";
    }

    @GetMapping("/raw")
    @ResponseBody
    public String raw() {
        return "Raw data";
    }
}
