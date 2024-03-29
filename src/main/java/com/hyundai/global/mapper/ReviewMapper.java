package com.hyundai.global.mapper;

import com.hyundai.domain.review.dto.response.AbleReviewProductResponseDto;
import com.hyundai.domain.review.dto.response.MyReviewResponseDto;
import com.hyundai.domain.review.dto.response.ReviewResponseDto;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author : 변형준
 * @fileName : ReviewMapper
 * @since : 2/18/24
 */
public interface ReviewMapper {
    void saveReview(Map<String, Object> params);
    void updateReview(Map<String, Object> params);
    void deleteReview(Map<String, Object> params);
    Optional<ReviewResponseDto> getProductReviewByMemberId(Map<String, Object> params);
    List<MyReviewResponseDto> getReviewsByMemberId(String memberId);
    List<ReviewResponseDto> getProductReviews(Map<String, Object> params);
    List<ReviewResponseDto> getProductReview(Map<String, Object> params);
    List<AbleReviewProductResponseDto> getAbleReviewProduct(String memberId);
}
