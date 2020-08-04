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
    String encryptedEmblem1 = "UFSIF";

    assertTrue(matchEmblem.matchEmblemWithMessage(encryptedMessage1, encryptedEmblem1));
    assertFalse(matchEmblem.matchEmblemWithMessage(encryptedMessage2, encryptedEmblem1));
  }

  @Test
  public void matchEmblemWithSmallCase() { // for characters to be case sensitive.

    MatchEmblem matchEmblem = new MatchEmblem();
    String encryptedMessage1 = "FAIJWJSOOFAMAU";
    String encryptedMessage2 = "faijwjsoofamau";
    String encryptedEmblem1 = "ufsif";
    String encryptedEmblem2 = "UFSIF";

    assertFalse(matchEmblem.matchEmblemWithMessage(encryptedMessage1, encryptedEmblem1));
    assertFalse(matchEmblem.matchEmblemWithMessage(encryptedMessage2, encryptedEmblem2));
  }
}