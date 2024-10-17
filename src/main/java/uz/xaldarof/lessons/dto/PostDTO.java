package uz.xaldarof.lessons.dto;

import lombok.Data;

@Data
public class PostDTO {
    private String title;
    private String description;
    private Long categoryId;
}
