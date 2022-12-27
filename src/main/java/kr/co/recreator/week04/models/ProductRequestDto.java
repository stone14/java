package kr.co.recreator.week04.models;

import lombok.Getter;

@Getter
public class ProductRequestDto {
    private String title;
    private String link;
    private String image;
    private int lprice;
}