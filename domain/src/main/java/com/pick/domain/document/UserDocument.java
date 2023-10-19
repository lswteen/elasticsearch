package com.pick.domain.document;

import lombok.*;
import org.springframework.data.elasticsearch.annotations.*;

import java.time.LocalDateTime;

@Document(indexName = "user_index")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Getter
@Setting(settingPath = "elastic/es-setting.json")
@Mapping(mappingPath = "elastic/es-mapping.json")
public class UserDocument {
    private Long id;
    private String name;
    private Long age;
    private String korean;
    private String english;

    @Field(type = FieldType.Date, format = DateFormat.basic_date_time)
    private LocalDateTime created;
}
