package com.duo.duodine.dining.service;

import com.duo.duodine.dining.mapper.DiningMapper;
import com.duo.duodine.dining.model.Restaurant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static com.duo.duodine.common.utils.result.ResultUtils.getResultCode;

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
        int result = mapper.insertRestaurant(restaurant);
        return getResultCode(result);
    }

    /**
     * 맛집 수정
     *
     * @param restaurant
     * @return
     */
    @Override
    public String updateRestaurant(Restaurant restaurant) throws Exception{
        int result = mapper.updateRestaurant(restaurant);
        return getResultCode(result);
    }

    /**
     * 맛집 삭제
     *
     * @param id
     * @return
     */
    @Override
    public String deleteRestaurantById(Long id) throws Exception{
        int result = mapper.deleteRestaurantById(id);
        return getResultCode(result);
    }
}
