package com.cybernode.ai.distributed_codeforge.common_lib.dto;

// User DTO representation across microservices
public record UserDto(
        Long id,
        String username,
        String name
) {
}