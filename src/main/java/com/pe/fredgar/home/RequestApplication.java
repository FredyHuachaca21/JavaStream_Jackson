package com.pe.fredgar.home;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RequestApplication {
    public static void main(String[] args) throws JsonProcessingException {

        List<DataBlock> dataBlocks = new ArrayList<>();
        DataBlock dataBlock = new DataBlock("Calle", "Lima");
        dataBlocks.add(dataBlock);
        Address address = new Address();
        address.setDynamicData(dataBlocks);
        System.out.println(address);

        /*========================*/
        DataBlock dataBlock1 = new DataBlock("Numero", "255");
        DataBlock dataBlock2= new DataBlock("Piso", "5");
        DataBlock dataBlock3 = new DataBlock("Interior", "Lima 255");

        List<DataBlock> dataBlockList = Arrays.asList(dataBlock, dataBlock1, dataBlock2, dataBlock3);
        Address address1 = new Address();
        address1.setDynamicData(dataBlockList);
        System.out.println(address1);

        System.out.println(new ObjectMapper().writeValueAsString(address1));

    }
}
