package com.github.lyd.base.client.api;

import com.github.lyd.base.client.model.entity.BaseApp;
import com.github.lyd.common.model.ResultBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author liuyadu
 */
public interface BaseAppRemoteApi {

    /**
     * 获取应用基础信息
     *
     * @param appId 应用Id
     * @return
     */
    @GetMapping("/app/{appId}")
    ResultBody<BaseApp> getApplication(@PathVariable("appId") String appId);

}
