package com.tameofthrones.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.tameofthrones.create.CreateKingdoms;
import com.tameofthrones.create.CreateKingdomsImp;
import com.tameofthrones.dto.Kingdom;
import com.tameofthrones.dto.Messages;

import org.junit.jupiter.api.Test;

public class RulerStrategyTest {

  RulerStrategy rulerStrategy = new RulerStrategyImp();

  @Test
  public void rulerStrategy() throws IOException {

    CreateKingdoms createKingdoms = new CreateKingdomsImp();

    List<Kingdom> kingdoms = createKingdoms.getKingdoms();
    List<Messages> messages = new ArrayList<Messages>();

    messages.add(new Messages("LAND", "FAIJWJSOOFAMAU"));
    messages.add(new Messages("AIR", "ROZO"));
    messages.add(new Messages("ICE", "STHSTSTVSASOS"));

    Set<String> wonKingdoms = rulerStrategy.getWonKingdoms(kingdoms, messages);

    assertEquals(4, wonKingdoms.size());
    assertTrue(wonKingdoms.contains("SPACE"));
    assertTrue(wonKingdoms.contains("LAND"));
    assertTrue(wonKingdoms.contains("AIR"));
    assertTrue(wonKingdoms.contains("ICE"));
    assertFalse(wonKingdoms.contains("WATER"));
  }
}