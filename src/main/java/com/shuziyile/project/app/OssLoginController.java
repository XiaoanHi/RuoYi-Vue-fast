package com.shuziyile.project.app;

import com.shuziyile.common.constant.Constants;
import com.shuziyile.framework.web.domain.AjaxResult;
import com.shuziyile.project.app.domain.vo.AuthRequestBody;
import com.shuziyile.project.web.service.IAppuserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 单点登录相关接口
 */
@Api(tags = "登录")
@RestController
@RequestMapping("/app/login")
public class OssLoginController {

    @Autowired
    IAppuserService appuserService;

    /**
     * 单点登录
     * @param requestBody 请求体
     * @return
     */
    @ApiOperation("单点登录")
    @PostMapping("/ossLogin")
    public AjaxResult ossLogin(@RequestBody AuthRequestBody requestBody) {
        String token = appuserService.createToken(requestBody);
        return AjaxResult.success(Constants.APP_TOKEN_PREFIX +token);
    }
}
