package org.near.servicesupport.request;




public abstract class AbstractIdempotenceRequest extends BaseRequest {
    private static final long serialVersionUID = 2899988994533702386L;

    protected String key;

    public String getKey() {
        return key;
    }

    /**
     * 生成唯一 Key 来处理幂等性，同一个 Key 会被当作同一次请求，
     * 所以客户端要确保不通请求的 Key 一定时唯一的。
     */
    abstract public String genKey();
}
