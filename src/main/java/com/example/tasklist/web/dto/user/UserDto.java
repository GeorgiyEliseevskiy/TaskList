package com.example.tasklist.web.dto.user;

import com.example.tasklist.web.dto.volidation.OnCreate;
import com.example.tasklist.web.dto.volidation.OnUpdate;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class UserDto {

    @NotNull(message = "Id must be not null", groups = OnUpdate.class)
    private Long id;

    @NotNull(message = "Must be not null", groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 255, message = "Name length must be smaller than 255 symbols", groups = {OnCreate.class, OnUpdate.class})
    private String name;

    @NotNull(message = "Must be not null", groups = {OnUpdate.class, OnCreate.class})
    @Length(max = 255, message = "UserName length must be smaller than 255 symbols", groups = {OnCreate.class, OnUpdate.class})
    private String username;

    @NotNull(message = "password not be null", groups = {OnCreate.class, OnUpdate.class})
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @NotNull(message = "passwordConfiguration not be null", groups = {OnCreate.class, OnUpdate.class})
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String passwordConfiguration;
}
