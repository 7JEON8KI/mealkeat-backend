package com.hyundai.domain.admin.controller;

import com.hyundai.domain.admin.service.AdminService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Log4j
@RequestMapping("/admin")
@RestController
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

    @GetMapping("/member")
    public ResponseEntity<Map<String, Object>> getMembers(){
        Map<String, Object> result = adminService.getMemberList();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
    @GetMapping("/member/{standard}/{pageNum}")
    public ResponseEntity<Map<String, Object>> getMembersByPage(@PathVariable("pageNum") Long pageNum, @PathVariable("standard") String standard){
        Map<String, Object> result = adminService.getMemberListByPage(standard, pageNum);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
