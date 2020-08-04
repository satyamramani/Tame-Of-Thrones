package com.tameofthrones.create;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.tameofthrones.dto.Kingdom;

import org.junit.jupiter.api.Test;

public class CreateKingdomTest {

  @Test
  public void createKingdom() {
    
    CreateKingdoms createKingdoms = new CreateKingdomsImp();

    List<Kingdom> kingdoms = createKingdoms.getKingdoms();

    assertEquals(6, kingdoms.size());
    assertEquals("SPACE",kingdoms.get(0).getKingdomName());
    assertEquals("GORILLA",kingdoms.get(0).getEmblem());
    assertEquals("FIRE", kingdoms.get(1).getKingdomName());

  }
}