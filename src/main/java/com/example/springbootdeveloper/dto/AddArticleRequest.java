package com.example.springbootdeveloper.dto;

import com.example.springbootdeveloper.domain.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor  // 기본생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Getter
public class AddArticleRequest {
    
    private String title;
    private String content;
    private String author;
    
    public Article toEntity(String userName) { // 생성자를 사용해 객체 생성
        return Article.builder()
                .author(author)
                .title(title)
                .content(content)
                .build();
    }

}
