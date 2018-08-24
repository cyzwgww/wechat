package org.yyx.wx.demo.service.access_token;


import org.yyx.wx.demo.domain.vo.wx.pubnum.reponse.AccessToken;

/**
 * IAccessTokenService
 * <p>
 *
 * @author 叶云轩 at tdg_yyx@foxmail.com
 * @date 2018/8/24-10:57
 */
public interface IAccessTokenService {
    /**
     * 获取AccessToken的方法
     * <p>内含使用线程局部变量判断token是否失效</p>
     *
     * @return 微信返回的AccessToken
     */
    AccessToken getAccessToken();
}
