package com.example.demo;

        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;
@Controller

public class Using_Variables {
    @RequestMapping("/")
    public String homepage(Model model) {
        model.addAttribute("val", "hello web developer");

        return "UsingVariables";
    }
}
