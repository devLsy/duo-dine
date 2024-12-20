package com.duo.duodine.dining.service;

import com.duo.duodine.dining.model.Restaurant;

import java.util.List;

public interface DiningService {

    // 맛집 리스트 조회
    List<Restaurant> selectRestaurantsList();
    // 맛집 등록
    String insertRestaurant(Restaurant restaurant) throws Exception;
}
