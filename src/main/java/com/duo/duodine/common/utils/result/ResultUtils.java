package com.duo.duodine.common.utils.result;

import com.duo.duodine.model.enu.ResultType;

public class ResultUtils {

    /**
     * 결과 코드값 반환
     * @param result
     * @return
     */
    public static String getResultCode(int result) {
        return result > 0 ? ResultType.SUCCESS.getCode() : ResultType.FAIL.getCode();
    }
}
