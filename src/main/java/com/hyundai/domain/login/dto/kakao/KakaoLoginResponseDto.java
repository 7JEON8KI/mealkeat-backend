package com.hyundai.domain.login.dto.kakao;

import lombok.*;

/**
 * @author : 변형준
 * @fileName : KakaoLoginResponseDto
 * @since : 2/13/24
 */

@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class KakaoLoginResponseDto {
    private String memberEmail;
    private String accessToken;
    private String refreshToken;
    private Boolean isMember;
}
