package com.duo.duodine.model.enu;

import com.duo.duodine.model.CodeEnum;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ResultType implements CodeEnum {

    SUCCESS("1", "success"),
    FAIL("0", "failed");

    private final String code;
    private final String msg;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
