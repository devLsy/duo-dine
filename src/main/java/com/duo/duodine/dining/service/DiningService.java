package com.duo.duodine.dining.service;

import com.duo.duodine.dining.model.Restaurant;

import java.util.List;
import java.util.Map;

public interface DiningService {

    // 맛집 리스트 조회
    List<Restaurant> selectRestaurantsList(Restaurant vo);
    // 맛집 상세
    Restaurant selectRestaurantById(Restaurant vo);
    // 맛집 개수
    Integer selectRestaurantsCount(Map<String, Object> params);
    // 맛집 등록
    String insertRestaurant(Restaurant vo) throws Exception;
    // 맛집 수정
    int updateRestaurant(Restaurant vo) throws Exception;
    // 맛집 삭제
    int deleteRestaurantById(Long id) throws Exception;
}
