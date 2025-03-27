package com.maco.universal.company.system.dto.item;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ItemCategoryDto {
    Integer id;
    String category;
    List<ItemDto> items;
}
