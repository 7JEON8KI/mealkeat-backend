package com.hyundai.domain.manager.service;

import com.hyundai.domain.manager.dto.ManagerOrderProductDTO;
import com.hyundai.domain.manager.dto.ManagerProductDTO;
import com.hyundai.domain.manager.dto.ManagerTop5ProductDTO;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * @author : 강은구
 * @fileName : ManagerProductService
 * @description :
 * @since : 02/20/2024
 */
public interface ManagerProductService {
    String insertProduct(ManagerProductDTO productDTO);

    List<ManagerProductDTO> getProductByMemberId();

    String deleteProduct(Map<String,Object> params);

    String addProductIngTheme(Map<String,Object> params);


    String deleteProductIngTheme(Map<String, Object> params);

    List<ManagerOrderProductDTO> getOrdersByMemberId();

    ManagerProductDTO getProductDetail(long productId);

    String modifyProduct(ManagerProductDTO productDTO);

    List<ManagerTop5ProductDTO> getTop5Product();

    void downOrderExcel(HttpServletResponse response);
}
