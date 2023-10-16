package com.pick.user.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class UserRequest {
    private final Long id;
    private final String name;
    private final Long age;
    private final String korean;
    private final String english;
}
