package com.MyWeb.MyWeb.Guide;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class GuidePageController {
    @RequestMapping("/Kmovie")
    public String Guide(){
        return "GuidePage";
    }

    @GetMapping("/main")
    public String main(){ return "main";}

    @GetMapping("/Signup")
    public String Signup(){
        return "Signup";
    }
    @GetMapping("/Signin")
    public String Signin(){
        return "Signin";
    }

    @GetMapping("/MainMovie")
    public String MainMovie(){ return "MainMovie";}
}
