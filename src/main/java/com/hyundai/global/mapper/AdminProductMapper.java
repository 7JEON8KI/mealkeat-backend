package com.hyundai.global.mapper;

import com.hyundai.domain.admin.dto.AdminProductDTO;
import com.hyundai.domain.admin.dto.AdminThemeDTO;
import com.hyundai.domain.admin.dto.AdminTotalSalesDTO;

import java.util.List;
import java.util.Map;

/**
 * @author : 강은구
 * @fileName : AdminProductMapper
 * @description :
 * @since : 02/19/2024
 */
public interface AdminProductMapper {
    List<AdminProductDTO> getAllProduct();
    void getProductByPage(Map<String, Object> params);

    void getProductDetail(Map<String, Object> params);

    int deleteProduct(Long productId);

    int modifyProduct(AdminProductDTO productDTO);

    int addTheme(AdminThemeDTO params);

    int deleteTheme(Long themeId);

    int modifyTheme(AdminThemeDTO params);
    List<AdminTotalSalesDTO> getOrderTotalSales();

}
