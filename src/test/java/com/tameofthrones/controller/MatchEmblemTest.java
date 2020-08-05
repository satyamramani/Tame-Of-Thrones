package com.tameofthrones.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MatchEmblemTest {

  MatchEmblem matchEmblem;

  @BeforeEach
  void setup() {
    matchEmblem = new MatchEmblem();
  }
  
  @Test
  public void matchEmblemWithRightAndWorngMessages() {
    
    String encryptedMessage1 = "FAIJWJSOOFAMAU";
    String encryptedMessage2 = "AIJWJSOOFAMAU";
    String encryptedEmblem1 = "UFSIF";

    assertTrue(matchEmblem.matchEmblemWithMessage(encryptedMessage1, encryptedEmblem1));
    assertFalse(matchEmblem.matchEmblemWithMessage(encryptedMessage2, encryptedEmblem1));
  }

  @Test
  public void matchEmblemWithSmallCaseEmblem() { // for characters to be case sensitive.

    String encryptedMessage1 = "FAIJWJSOOFAMAU";
    String encryptedMessage2 = "faijwjsoofamau";
    String encryptedEmblem1 = "ufsif";
    String encryptedEmblem2 = "UFSIF";

    assertFalse(matchEmblem.matchEmblemWithMessage(encryptedMessage1, encryptedEmblem1));
    assertFalse(matchEmblem.matchEmblemWithMessage(encryptedMessage2, encryptedEmblem2));
  }

  @Test
  public void matchEmblemAndMessagesWithSpaceBetweenThem() {  //spaces present in messages 

    String encryptedMessage1 = "SUMMER IS COMING";
    String encryptedMessage2 = "UFSI X DFTI";
    String encryptedEmblem1 = "UFSIF";

    assertFalse(matchEmblem.matchEmblemWithMessage(encryptedMessage1, encryptedEmblem1));
    assertTrue(matchEmblem.matchEmblemWithMessage(encryptedMessage2, encryptedEmblem1));

  }
}