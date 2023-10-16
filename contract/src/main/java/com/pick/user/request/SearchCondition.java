package com.pick.user.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SearchCondition {
    @Nullable
    private Long id;

    @Nullable
    private String name;

    @Nullable
    private Long age;

    @Nullable
    private String korean;

    @Nullable
    private String english;
}
