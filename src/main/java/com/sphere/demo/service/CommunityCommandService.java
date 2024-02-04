package com.sphere.demo.service;

import com.sphere.demo.repository.CommunityRepository;
import com.sphere.demo.web.dto.CommunityRequestDto.CreateDto;

public interface CommunityCommandService {
    void create(CreateDto createDto);

}
