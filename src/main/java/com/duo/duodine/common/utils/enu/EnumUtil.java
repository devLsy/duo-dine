package com.duo.duodine.common.utils.enu;


import com.duo.duodine.model.CodeEnum;

public class EnumUtil {
    
    /**
     * 매개변수로 넘어온 코드의 존재여부 체크
     * @param enumClass
     * @param code
     * @return
     * @param <E>
     */
    public static <E extends Enum<E> & CodeEnum> boolean hasEnumCode(Class<E> enumClass, String code) {
        if (code != null && !code.isEmpty()) {
            for (E enumConstant : enumClass.getEnumConstants()) {
                if (code.equals(enumConstant.getCode())) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 매개변수로 넘어온 코드의 메시지 반환
     * @param enumClass
     * @param code
     * @return
     * @param <E>
     */
    public static <E extends Enum<E> & CodeEnum> String getEnumMessageByCode(Class<E> enumClass, String code) {
        if (code != null && !code.isEmpty()) {
            for (E enumConstant : enumClass.getEnumConstants()) {
                if (code.equals(enumConstant.getCode())) {
                    return enumConstant.getMsg();
                }
            }
        }
        return "Unknown code";
    }
}
