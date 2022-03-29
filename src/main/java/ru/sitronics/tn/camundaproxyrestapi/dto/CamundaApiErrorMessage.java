package ru.sitronics.tn.camundaproxyrestapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CamundaApiErrorMessage {
    @JsonProperty("type")
    private final String type;
    @JsonProperty("message")
    private final String message;
}
