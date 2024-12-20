package com.duo.duodine.dining.web;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "/dining")
public class DiningController {


    /**
     * 맛집 리스트 조회
     * @return
     * @throws Exception
     */
    @GetMapping(value = "")
    public String selectRestaurantsList() throws Exception{
        return "";
    }
}
