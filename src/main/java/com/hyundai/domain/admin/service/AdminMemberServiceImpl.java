package com.hyundai.domain.admin.service;

import com.hyundai.domain.admin.dto.AdminManagerDTO;
import com.hyundai.domain.admin.dto.AdminMemberDTO;
import com.hyundai.domain.utils.file.DownExcelView;
import com.hyundai.global.exception.GlobalErrorCode;
import com.hyundai.global.exception.GlobalException;
import com.hyundai.global.mapper.AdminMemberMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
/**
 * @author : 강은구
 * @since : 02/19/2024
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class AdminMemberServiceImpl implements AdminMemberService{

    private final AdminMemberMapper adminMemberMapper;

    private final DownExcelView downExcelView;

    @Override
    @Transactional(readOnly = true)
    public List<AdminMemberDTO> getMemberList() {
        return adminMemberMapper.getAllMembers();
    }

    @Override
    public String modifyMember(AdminMemberDTO member) {
        try{
            adminMemberMapper.modifyMember(member);
        } catch (Exception e
        ){
            throw new GlobalException(GlobalErrorCode.NON_CLEAR_REASON);
        }
        return "성공";
    }

    @Override
    public String deleteMember(AdminMemberDTO member) {
        try{
            adminMemberMapper.deleteMember(member);
            return "성공";
        } catch (Exception e
        ){
            throw new GlobalException(GlobalErrorCode.NON_CLEAR_REASON);
        }
    }

    @Override
    public String changeMemberAuthorization(AdminManagerDTO member) {
        try{
            adminMemberMapper.grantAuthorization(member.getMemberId());
            return "성공";
        } catch (Exception e){
            throw new GlobalException(GlobalErrorCode.NON_CLEAR_REASON);
        }

    }

    @Override
    public List<AdminMemberDTO> searchMembers(String word) {
        return adminMemberMapper.searchMembers(word);
    }

    @Override
    public List<AdminManagerDTO> getManagerList() {
        return adminMemberMapper.getAllManagers();
    }

    @Override
    public void getMemberExcelFile(HttpServletResponse response) throws IOException {
        downExcelView.makeWorkbook(adminMemberMapper.getAllMembers(), "회원 목록", response);
    }
}

