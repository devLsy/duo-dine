package com.duo.duodine.dining.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "/")
public class MainController {

    @GetMapping(value = "")
    public String mainPage() {
        return "index";
    }
}
