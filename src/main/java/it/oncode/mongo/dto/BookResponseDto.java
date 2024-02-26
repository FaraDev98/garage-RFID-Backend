package it.oncode.mongo.dto;

import it.oncode.mongo.model.Theme;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookResponseDto {
    private String id;
    private String title;
    private String plot;
    private Integer pages;
    private Double price;
    private Theme theme;
}