package com.github.lyd.base.client.model;

import com.github.lyd.base.client.model.entity.BaseResourceApi;

import java.io.Serializable;

public class GatewayRateLimitApisDto extends BaseResourceApi implements Serializable {
    private static final long serialVersionUID = 1212925216631391016L;
    private Long itemId;
    private Long policyId;
    private Long policyName;
    private Long limit;
    private String intervalUnit;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public Long getPolicyName() {
        return policyName;
    }

    public void setPolicyName(Long policyName) {
        this.policyName = policyName;
    }

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public String getIntervalUnit() {
        return intervalUnit;
    }

    public void setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
    }
}
