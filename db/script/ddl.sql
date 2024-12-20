CREATE TABLE restaurants (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,          -- 고유 ID (자동 증가)
    name VARCHAR(100) NOT NULL COMMENT '맛집 이름',  -- 맛집 이름
    address VARCHAR(255) COMMENT '맛집 주소',        -- 맛집 주소
    latitude DECIMAL(9,6) COMMENT '위도 (소수점 6자리)', -- 위도 (소수점 6자리)
    longitude DECIMAL(9,6) COMMENT '경도 (소수점 6자리)', -- 경도 (소수점 6자리)
    phone VARCHAR(15) COMMENT '연락처',             -- 연락처
    category VARCHAR(50) COMMENT '음식 카테고리 (예: 한식, 중식)', -- 음식 카테고리
    rating DECIMAL(2,1) CHECK (rating BETWEEN 0 AND 5) COMMENT '평점 (0.0 ~ 5.0)', -- 평점 (0.0 ~ 5.0)
    visited TINYINT(1) DEFAULT 0 COMMENT '방문 여부 (기본값: 미방문)', -- 방문 여부 (기본값: 미방문)
    revisit TINYINT(1) DEFAULT 0 COMMENT '재방문 의사 (기본값: 없음)', -- 재방문 의사 (기본값: 없음)
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT '생성 시각 (자동으로 현재 시간 입력)' -- 생성 시각
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='맛집 정보를 저장하는 테이블'
;