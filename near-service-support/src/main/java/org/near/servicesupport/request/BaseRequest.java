package org.near.servicesupport.request;

import lombok.Data;

/**
 * 基础请求封装
 *
 * @author willard
 * @date 16-2-26
 */
@Data
public class BaseRequest extends AbstractServiceRequest {
    private static final long serialVersionUID = -6289936912859265354L;

    /**
     * 调用方设备名
     */
    protected String clientName;
    /**
     * 调用方IP地址
     */
    protected String clientIp;
    /**
     * 时间戳
     */
    protected long timestamp = System.currentTimeMillis();


}
