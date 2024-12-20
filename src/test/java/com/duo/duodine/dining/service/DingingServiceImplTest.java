package com.duo.duodine.dining.service;

import com.duo.duodine.dining.model.Restaurant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.math.BigDecimal;

@SpringBootTest
@ActiveProfiles("local")
class DingingServiceImplTest {

    @Autowired
    private DingingServiceImpl service;

    @Test
    public void testInsert() throws Exception {

        Restaurant vo = null;

            for (int i = 0; i < 101; i++) {
                vo = new Restaurant();
                vo.setName("식당 " + i);
                vo.setAddress("주소 " + i);
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
}
