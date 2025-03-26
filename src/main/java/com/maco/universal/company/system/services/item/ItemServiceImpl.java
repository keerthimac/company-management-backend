package com.maco.universal.company.system.services.item;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.maco.universal.company.system.dto.ItemCategoryDto;
import com.maco.universal.company.system.entities.item.ItemCategoryEntity;
import com.maco.universal.company.system.repositories.item.ItemCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ObjectMapper mapper;
    private final ItemCategoryRepository itemCategoryRepo;

    @Override
    public ItemCategoryDto addCategory(ItemCategoryDto itemCategoryDto) {
        ItemCategoryEntity itemCategoryEntity = mapper.convertValue(itemCategoryDto, ItemCategoryEntity.class);
        ItemCategoryEntity save = itemCategoryRepo.save(itemCategoryEntity);
        return mapper.convertValue(save, ItemCategoryDto.class);
    }
}
