package com.duo.duodine.dining.service;

import com.duo.duodine.dining.model.Restaurant;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
@ActiveProfiles("local")
@Slf4j
class DingingServiceImplTest {

    @Autowired
    private DingingServiceImpl service;

    @Test
    @DisplayName("맛집 등록")
    @Disabled
    public void testInsert() throws Exception {

            Restaurant vo = null;

            for (int i = 0; i <= 10000; i++) {
                vo = new Restaurant();
                vo.setName("식당 " + i);
                vo.setMainAddress("메인" + i);
                vo.setDetailAddress("상세" + i);
                vo.setLatitude(BigDecimal.valueOf(37.560800));
                vo.setLongitude(BigDecimal.valueOf(126.982000));
                vo.setPhone("02-222-2222");
                vo.setCategory("한식");
                vo.setRating(BigDecimal.valueOf(4.5));
                vo.setVisited(true);
                vo.setRevisit(true);
                service.insertRestaurant(vo);
            }
    }

    // 맛집 목록
    @Test
    @DisplayName("맛집 목록")
    @Disabled
    public void testSelectList() throws Exception {
        Restaurant vo = new Restaurant();
        vo.setCategory("양식");
        List<Restaurant> list = service.selectRestaurantsList(vo);
    }
    
    // 맛집 상세
    @Test
    @DisplayName("맛집 상세")
    @Disabled
    public void testSelectById() throws Exception {
        Restaurant vo = new Restaurant();
        vo.setId(20L);
        Restaurant list = service.selectRestaurantById(vo);
    }

    @Test
    @DisplayName("맛집 삭제")
    @Disabled
    // 맛집 삭제
    public void testDeleteById() throws Exception {
        int result = service.deleteRestaurantById(20L);
        log.info("result => {}", result);
    }

    @Test
    @DisplayName("맛집 수정")
    @Disabled
    // 맛집 수정
    public void testUpdateById() throws Exception {
        Restaurant vo = new Restaurant();
        vo.setId(20L);
        vo.setMainAddress("메인19 수정");
        int result = service.updateRestaurant(vo);
        log.info("result => {}", result);
    }


    


}
