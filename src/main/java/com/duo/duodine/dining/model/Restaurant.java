package com.duo.duodine.dining.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Restaurant {

    private Long id;               // 고유 ID
    private String name;           // 맛집 이름
    private String mainAddress;        // 맛집 도로명 주소 또는 기본주소
    private String detailAddress;        // 상세 주소
    private BigDecimal latitude;   // 위도
    private BigDecimal longitude;  // 경도
    private String phone;          // 연락처
    private String category;       // 음식 카테고리
    private BigDecimal rating;     // 평점
    private Boolean visited;       // 방문 여부
    private Boolean revisit;       // 재방문 의사
    private Boolean useYn;         // 사용 여부
    private String createdAt;      // 생성 시각
}
