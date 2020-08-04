package com.tameofthrones.dto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class KingdomTest {

  @Test
  public void serializeAndDeserializeKingdom() {
    Kingdom kingdom = new Kingdom("LAND","PANDA");

    assertEquals("LAND",kingdom.getKingdomName());
    assertEquals("PANDA",kingdom.getEmblem());
  }
}