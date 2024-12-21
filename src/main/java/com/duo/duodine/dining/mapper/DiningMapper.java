package com.duo.duodine.dining.mapper;

import com.duo.duodine.dining.model.Restaurant;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface DiningMapper {

    // 맛집 리스트 조회
    List<Restaurant> selectRestaurantsList(Restaurant vo);
    // 맛집 상세
    Restaurant selectRestaurantById(Restaurant vo);
    // 맛집 개수
    Integer selectRestaurantsCount(Map<String, Object> params);
    // 맛집 등록
    int insertRestaurant(Restaurant vo);
    // 맛집 수정
    int updateRestaurant(Restaurant vo);
    // 맛집 삭제
    int deleteRestaurantById(Long id);
}
