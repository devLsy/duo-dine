package com.duo.duodine.dining.web;

import com.duo.duodine.dining.model.Restaurant;
import com.duo.duodine.dining.service.DiningService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "/dining")
public class DiningController {

    private final DiningService service;

    /**
     * 맛집 리스트 조회
     * @param model
     * @return
     * @throws Exception
     */
    @GetMapping(value = "")
    public String selectRestaurantsList(Model model, Restaurant vo) throws Exception{
        List<Restaurant> list = service.selectRestaurantsList(vo);
        model.addAttribute("list", list);
        return "/dining/list";
    }
}
