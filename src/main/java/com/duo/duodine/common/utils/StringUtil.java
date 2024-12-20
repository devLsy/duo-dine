package com.duo.duodine.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.springframework.util.StringUtils;

import java.nio.charset.StandardCharsets;

@Slf4j
public class StringUtil extends StringUtils {

	public static String nvl(String str) {
		return nvl(str, "");
	}

	public static String nvl(String str, String def) {
		return isEmpty(str) ? (def == null ? "" : def) : str;
	}

	public static String encodeBase64(String str) {
		return !"".equals(nvl(str, "")) ? new String(Base64.encodeBase64(str.getBytes(StandardCharsets.UTF_8))) : "";
	}

	public static String decodeBase64(String str) {
		return !"".equals(nvl(str, "")) ? new String(Base64.decodeBase64(str.getBytes(StandardCharsets.UTF_8))) : "";
	}
}
