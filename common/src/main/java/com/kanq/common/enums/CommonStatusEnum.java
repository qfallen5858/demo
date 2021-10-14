package com.kanq.common.enums;

import lombok.Getter;

@Getter
public enum CommonStatusEnum {

    NORMAL(0, "正常"),
    FORBID(1, "禁用");

    private Integer status;

    private String description;

    CommonStatusEnum(Integer status, String description){
        this.status = status;
        this.description = description;
    }

    public static CommonStatusEnum fromStatus(Integer status){
        for(CommonStatusEnum commonStatusEnum: CommonStatusEnum.values()){
            if (commonStatusEnum.status.equals(status)){
                return commonStatusEnum;
            }
        }
        return NORMAL;
    }
}
