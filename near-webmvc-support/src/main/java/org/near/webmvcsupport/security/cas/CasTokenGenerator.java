package org.near.webmvcsupport.security.cas;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;
import org.near.toolkit.common.RandomCharset;
import org.near.toolkit.common.StringUtil;

/**
 * 单点登录令牌生成器
 * XXX 临时的微信端单点登录实现，后续需要更安全的实现方案
 * @author Created by Willard.Hu on 2016/5/30.
 */
public class CasTokenGenerator {
    private static MessageDigest messageDigest;
    static {
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException ignore) { // 算法名一定支持
        }
    }

    /* 登录帐号 */
    private String               loginId;
    /* 密码 */
    private String               password;

    public CasTokenGenerator(String loginId, String password) {
        this.loginId = loginId;
        // 没有密码，默认8位随机密码
        if (StringUtil.isBlank(password)) {
            this.password = RandomCharset.randomMixture(8);
        } else {
            this.password = password;
        }
    }

    public String genToken() {
        String src = loginId + password + System.currentTimeMillis();
        try {
            return Hex.encodeHexString(messageDigest.digest(src.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) { // UTF-8编码是有效的
            throw new RuntimeException(e);
        }
    }
}
