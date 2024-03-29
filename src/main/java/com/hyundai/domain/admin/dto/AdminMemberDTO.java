package com.hyundai.domain.admin.dto;

import com.hyundai.domain.login.entity.enumtype.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class AdminMemberDTO {

    private String memberId;
    private String memberEmail;
    private String memberName;
    private String memberNickname;
    private String memberPhone;
    private int memberGender;
    private String memberBirth;
    private Role memberRole;
    private LocalDateTime createdDate;
    private LocalDateTime modifiedDate;
    private LocalDateTime deletedDate;

    private String infoAddr;
    private String infoZipcode;
}