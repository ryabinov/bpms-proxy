package ru.sitronics.tn.camundaproxyrestapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CamundaApiExceptionDto {
    @JsonProperty("type")
    private String type;
    @JsonProperty("message")
    private String message;
}
