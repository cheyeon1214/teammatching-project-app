package com.sphere.demo.converter;

import com.sphere.demo.domain.Community;
import com.sphere.demo.web.dto.CommunityRequestDto;

import java.util.ArrayList;

public class CommunityConverter {
    public static Community toCommunity(CommunityRequestDto.CreateDto createDto) {
        return Community.builder()
                .user_id(createDto.getUser_id())
                .title(createDto.getTitle())
                .body(createDto.getBody())
                .build();
    }
}
