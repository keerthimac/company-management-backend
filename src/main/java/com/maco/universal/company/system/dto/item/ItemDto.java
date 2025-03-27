package com.maco.universal.company.system.dto.item;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ItemDto {
    private Integer id;
    private String name;
    private String description;
    private ItemCategoryDto itemCategory;
}
