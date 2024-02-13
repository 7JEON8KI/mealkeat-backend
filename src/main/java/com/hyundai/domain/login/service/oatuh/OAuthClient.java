package com.hyundai.domain.login.service.oatuh;

import com.hyundai.domain.login.dto.oauth.OAuthMember;
import com.hyundai.domain.login.dto.oauth.OAuthParams;
import com.hyundai.domain.login.entity.enumtype.OAuthProvider;

/**
 * @author : 변형준
 * @fileName : OAuthClient
 * @since : 2/11/24
 */
public interface OAuthClient {
    public OAuthProvider oauthProvider();
    public String getOauthLoginToken(OAuthParams oauthParams);
    public OAuthMember getMemberInfo(String accessToken);
}
