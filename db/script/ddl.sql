CREATE TABLE restaurants (
id BIGINT AUTO_INCREMENT PRIMARY KEY,          -- 고유 ID (자동 증가)
name VARCHAR(100) NOT NULL COMMENT '맛집 이름',  -- 맛집 이름
main_address VARCHAR(200) NOT NULL COMMENT '도로명 주소 또는 기본 주소',    -- 도로명 주소 또는 기본 주소
detail_address VARCHAR(100) NOT NULL COMMENT '상세 주소',                -- 상세 주소
latitude DECIMAL(9,6) NOT NULL COMMENT '위도 (소수점 6자리)', -- 위도 (소수점 6자리)
longitude DECIMAL(9,6) NOT NULL COMMENT '경도 (소수점 6자리)', -- 경도 (소수점 6자리)
phone VARCHAR(15) NOT NULL COMMENT '연락처',             -- 연락처
category VARCHAR(50) NOT NULL COMMENT '음식 카테고리 (예: 한식, 중식)', -- 음식 카테고리
rating DECIMAL(2,1) NOT NULL CHECK (rating BETWEEN 0 AND 5) COMMENT '평점 (0.0 ~ 5.0)', -- 평점 (0.0 ~ 5.0)
visited TINYINT(1) NOT NULL DEFAULT 0 COMMENT '방문 여부 (기본값: 미방문)', -- 방문 여부 (기본값: 미방문)
revisit TINYINT(1) NOT NULL DEFAULT 0 COMMENT '재방문 의사 (기본값: 없음)', -- 재방문 의사 (기본값: 없음)
use_yn TINYINT(1) NOT NULL DEFAULT 1 COMMENT '사용 여부 (1: 사용, 0: 사용 안함)', -- 사용 여부 (기본값: 사용)
created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '생성 시각 (자동으로 현재 시간 입력)' -- 생성 시각
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='맛집 정보를 저장하는 테이블'
;