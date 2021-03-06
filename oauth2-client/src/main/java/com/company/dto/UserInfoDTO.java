package com.company.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: zheng.th
 * @Date: 2019/1/1 21:29
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description="密码模式，提交的信息")
public class UserInfoDTO {
    @ApiModelProperty(value = "用户信息表【member】的用户名",required = true,example = "username",dataType = "String")
    private String username;
    @ApiModelProperty(value = "用户信息表【member】的密码,密文",required = true,example = "e10adc3949ba59abbe56e057f20f883e",dataType = "String")
    private String password;
    @ApiModelProperty(value = "【oauth_client_details】表的client_id,明文传递",required = true,example = "password_auth_mode",dataType =
            "String")
    private String appId;
    @ApiModelProperty(value = "【oauth_client_details】表的client_secret,明文传递",required = true,example = "123456",dataType =
            "String")
    private String appSecret;

}
