package com.duo.duodine.dining.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Restaurant {

    private Long id;               // 고유 ID
    private String name;           // 맛집 이름
    private String address;        // 맛집 주소
    private BigDecimal latitude;   // 위도
    private BigDecimal longitude;  // 경도
    private String phone;          // 연락처
    private String category;       // 음식 카테고리
    private BigDecimal rating;     // 평점
    private Boolean visited;       // 방문 여부
    private Boolean revisit;       // 재방문 의사
    private String createdAt;      // 생성 시각
}
