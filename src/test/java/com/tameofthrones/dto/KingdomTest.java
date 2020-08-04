package com.tameofthrones.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;

public class KingdomTest {

    @Test
    public void serializeAndDeserializeKingdom() throws JsonMappingException, JsonProcessingException {
    final String kingdomString = 
        "{\n"
            + "  \"kingdomName\": \"LAND\",\n"
            + "  \"emblem\": \"PANDA\"\n"
        + "}";

    Kingdom kingdom = new Kingdom();
    kingdom = new ObjectMapper().readValue(kingdomString, Kingdom.class);
  }
}