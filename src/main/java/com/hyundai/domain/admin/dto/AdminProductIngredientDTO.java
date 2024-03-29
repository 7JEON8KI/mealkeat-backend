package com.hyundai.domain.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author : 강은구
 * @fileName : AdminProductIngredient
 * @description :
 * @since : 02/19/2024
 */

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class AdminProductIngredientDTO {
    private Long ingredientId;
    private String ingredientName;
}
