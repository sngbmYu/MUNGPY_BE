package com.sfz.mungpy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DogMatch {
    private Long id;
    private String name;
    private String image;
    private String description;
    private String matchReason;
}
