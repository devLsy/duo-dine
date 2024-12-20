package com.duo.duodine.dining.service;

import com.duo.duodine.dining.mapper.DiningMapper;
import com.duo.duodine.dining.model.Restaurant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DingingServiceImpl implements DiningService {

    private final DiningMapper mapper;

    /**
     * 맛집 리스트 조회
     * @return
     */
    @Override
    public List<Restaurant> selectRestaurantsList() {
        return mapper.selectRestaurantsList();
    }
}
