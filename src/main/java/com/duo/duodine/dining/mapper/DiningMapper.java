package com.duo.duodine.dining.mapper;

import com.duo.duodine.dining.model.Restaurant;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiningMapper {

    // 맛집 리스트 조회
    List<Restaurant> selectRestaurantsList();
}
