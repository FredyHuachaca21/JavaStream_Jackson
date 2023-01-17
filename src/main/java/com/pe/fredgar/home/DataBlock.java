package com.pe.fredgar.home;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataBlock {

    @JsonProperty("attribute")
    private String attribute;
    @JsonProperty("value")
    private String value;


}
