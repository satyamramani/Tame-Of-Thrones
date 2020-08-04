package com.tameofthrones.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MatchEmblemTest {
  
  @Test
  public void matchEmblem() {
    MatchEmblem matchEmblem = new MatchEmblem();
    String encryptedMessage1 = "FAIJWJSOOFAMAU";
    String encryptedMessage2 = "AIJWJSOOFAMAU";
    String encryptedMessage3 = "FFAIJWJSOOFAMAU";
    String encryptedEmblem1 = "UFSIF";
    String encryptedEmblem2 = "RZO";

    assertTrue(matchEmblem.matchEmblemWithMessage(encryptedMessage1, encryptedEmblem1));
    assertFalse(matchEmblem.matchEmblemWithMessage(encryptedMessage2, encryptedEmblem1));
    assertFalse(matchEmblem.matchEmblemWithMessage(encryptedMessage2, encryptedEmblem2));
    assertTrue(matchEmblem.matchEmblemWithMessage(encryptedMessage3, encryptedEmblem1));
  }
}