package com.hyundai.global.mapper;

import com.hyundai.domain.admin.dto.AdminMemberDTO;
import com.hyundai.domain.admin.dto.AdminMemberParamDTO;

import java.util.List;

public interface AdminMemberMapper {
    List<AdminMemberDTO> getListByParams(AdminMemberParamDTO params);

    List<AdminMemberDTO> getAllMembers();

    void modifyMember(AdminMemberDTO memberDTO);

    void deleteMember(AdminMemberDTO memberDTO);

    void grantAuthorization(AdminMemberDTO memberDTO);

    AdminMemberDTO getMemberDetail(String memberId);

    List<AdminMemberDTO> searchMembers(String word);



}