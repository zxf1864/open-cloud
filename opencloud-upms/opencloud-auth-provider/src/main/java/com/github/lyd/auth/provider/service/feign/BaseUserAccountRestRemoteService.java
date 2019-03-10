package com.github.lyd.auth.provider.service.feign;

import com.github.lyd.base.client.api.BaseUserAccountRemoteApi;
import com.github.lyd.common.constants.ServicesConstants;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author: liuyadu
 * @date: 2018/10/24 16:49
 * @description:
 */
@Component
@FeignClient(value = ServicesConstants.BASE_SERVICE)
public interface BaseUserAccountRestRemoteService extends BaseUserAccountRemoteApi {


}
