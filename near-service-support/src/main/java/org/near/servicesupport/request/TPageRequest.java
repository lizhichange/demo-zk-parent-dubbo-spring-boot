package org.near.servicesupport.request;

import lombok.Data;

/**
 * 泛型分页查询请求
 * <p>使用 {@link PageRequest} 作为基类扩展</p>
 *
 * @author Willard.Hu
 * @date 2016/5/5
 */
@Data
public class TPageRequest<T> extends PageRequest {
    private static final long serialVersionUID = -8011206062731891048L;
    private T                 condition;

}
