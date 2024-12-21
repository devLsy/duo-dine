package com.duo.duodine.dining.service;

import com.duo.duodine.dining.mapper.DiningMapper;
import com.duo.duodine.dining.model.Restaurant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class DingingServiceImpl implements DiningService {

    private final DiningMapper mapper;

    /**
     * 맛집 리스트 조회
     * @return
     */
    @Override
    public List<Restaurant> selectRestaurantsList(Restaurant vo) {
        return mapper.selectRestaurantsList(vo);
    }

    /**
     * 맛집 상세
     * @param vo
     * @return
     */
    @Override
    public Restaurant selectRestaurantById(Restaurant vo) {
        return mapper.selectRestaurantById(vo);
    }

    /**
     * 맛집 개수
     * @param params
     * @return
     */
    @Override
    public Integer selectRestaurantsCount(Map<String, Object> params) {
        return mapper.selectRestaurantsCount(params);
    }

    /**
     * 맛집 등록
     * @param restaurant
     * @return
     */
    @Override
    public String insertRestaurant(Restaurant restaurant) throws Exception{
        String message = "";
        int result = mapper.insertRestaurant(restaurant);
        return message = result > 0 ? "success" : "fail";
    }

    /**
     * 맛집 수정
     * @param restaurant
     * @return
     */
    @Override
    public int updateRestaurant(Restaurant restaurant) throws Exception{
        return mapper.updateRestaurant(restaurant);
    }

    /**
     * 맛집 삭제
     * @param id
     * @return
     */
    @Override
    public int deleteRestaurantById(Long id) throws Exception{
        return mapper.deleteRestaurantById(id);
    }


}
