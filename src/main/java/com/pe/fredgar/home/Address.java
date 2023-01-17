package com.pe.fredgar.home;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @JsonProperty("dynamicData")
    private List<DataBlock> dynamicData;

}
