package com.sphere.demo.web.controller;

import com.sphere.demo.apipayload.ApiResponse;
import com.sphere.demo.apipayload.status.SuccessStatus;
import com.sphere.demo.service.CommunityCommandService;
import com.sphere.demo.web.dto.CommunityRequestDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CommunityRestContoller {
    private final CommunityCommandService communityCommandService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/community")
    public ApiResponse<Void> create(@RequestBody @Valid CommunityRequestDto.CreateDto createDto) {
        communityCommandService.create(createDto);
        return ApiResponse.of(SuccessStatus._CREATED, null);
    }


}
