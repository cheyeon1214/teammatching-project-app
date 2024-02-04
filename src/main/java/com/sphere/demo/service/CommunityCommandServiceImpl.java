package com.sphere.demo.service;

import com.sphere.demo.converter.CommunityConverter;
import com.sphere.demo.domain.Community;
import com.sphere.demo.repository.CommunityRepository;
import com.sphere.demo.web.dto.CommunityRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CommunityCommandServiceImpl implements CommunityCommandService {

    private final CommunityRepository communityRepository;
    @Override
    public void create(CommunityRequestDto.CreateDto createDto) {
        Community community = CommunityConverter.toCommunity(createDto);

        communityRepository.save(community);
    }

}
