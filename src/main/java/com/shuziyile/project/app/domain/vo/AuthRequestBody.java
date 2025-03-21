package com.shuziyile.project.app.domain.vo;

import lombok.Data;

@Data
public class AuthRequestBody {
    private String code;
    private String grant_type;
    private String refresh_token;
}
