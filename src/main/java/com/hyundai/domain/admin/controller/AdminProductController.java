package com.hyundai.domain.admin.controller;

import com.hyundai.domain.admin.dto.AdminMemberParamDTO;
import com.hyundai.domain.admin.dto.AdminProductDTO;
import com.hyundai.domain.admin.dto.AdminProductParamDTO;
import com.hyundai.domain.admin.dto.AdminThemeDTO;
import com.hyundai.domain.admin.service.AdminProductService;
import com.hyundai.global.message.ResponseMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author : 강은구
 * @fileName : AdminProductController
 * @description :
 * @since : 02/19/2024
 */
@Slf4j
@RequestMapping("/admin")
@RestController
public class AdminProductController {
    @Autowired
    private AdminProductService adminProductService;
    @PostMapping("/products")
    public ResponseEntity getProductList(@RequestBody AdminProductParamDTO paramDTO){
        return ResponseMessage.SuccessResponse(paramDTO.getPageNum() + "페이지 조회에 성공했습니다", adminProductService.getProductByPage(paramDTO));
    }
    @PostMapping("/products/{productNum}")
    public ResponseEntity getProductDetail(@PathVariable long productNum){
        return ResponseMessage.SuccessResponse(productNum + " 번 상품 상세내용을 조회했습니다.",  adminProductService.getProductDetail(productNum));
    }

    @PostMapping("/products/delete/{productNum}")
    public ResponseEntity deleteProduct(@PathVariable long productNumm){
        adminProductService.deleteProduct(productNumm);
        return ResponseMessage.SuccessResponse(productNumm + " 번 상품 삭제했습니다 ", " ");
    }

    @PostMapping("/products/theme/add")
    public ResponseEntity addTheme(@RequestBody AdminThemeDTO paramDTO){
        adminProductService.addTheme(paramDTO);
        return ResponseMessage.SuccessResponse("테마를 추가하셨습니다.", " ");
    }
    @PostMapping("/products/theme/delete")
    public ResponseEntity deleteTheme(@RequestBody AdminThemeDTO paramDTO){
        adminProductService.deleteTheme(paramDTO);
        return ResponseMessage.SuccessResponse("테마 삭제에 성공하셨습니다", " ");
    }
    @PostMapping("/products/theme/modify")
    public ResponseEntity modifyTheme(@RequestBody AdminThemeDTO paramDTO){
        adminProductService.modifyTheme(paramDTO);
        return ResponseMessage.SuccessResponse("테마 변경에 성공하셨습니다", " ");
    }
}
