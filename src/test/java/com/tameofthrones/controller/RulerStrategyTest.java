package com.tameofthrones.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.tameofthrones.dto.Kingdom;
import com.tameofthrones.dto.Messages;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RulerStrategyTest {

  RulerStrategy rulerStrategy;
  List<Kingdom> kingdoms;

  @BeforeEach
  void setup() throws IOException {

    rulerStrategy = new RulerStrategyImp();

    kingdoms = new ArrayList<Kingdom>();

    kingdoms.add(new Kingdom("SPACE","GORILLA"));
    kingdoms.add(new Kingdom("LAND","PANDA"));
    kingdoms.add(new Kingdom("AIR","OWL"));
    kingdoms.add(new Kingdom("ICE","MAMMOTH"));
    kingdoms.add(new Kingdom("WATER","OCTOPUS"));
    kingdoms.add(new Kingdom("FIRE","DRAGON"));
    
  }
  

  @Test
  public void rulerStrategy() throws IOException {

    List<Messages> messages = new ArrayList<Messages>();

    messages.add(new Messages("LAND", "FAIJWJSOOFAMAU"));
    messages.add(new Messages("AIR", "ROZO"));
    messages.add(new Messages("ICE", "STHSTSTVSASOS"));
    messages.add(new Messages("FIRE", "JXGOOMUTOO"));

    Set<String> wonKingdoms = rulerStrategy.getWonKingdoms(kingdoms, messages);

    assertEquals(5, wonKingdoms.size());
    assertTrue(wonKingdoms.contains("SPACE"));
    assertTrue(wonKingdoms.contains("LAND"));
    assertTrue(wonKingdoms.contains("AIR"));
    assertTrue(wonKingdoms.contains("ICE"));
  }

  @Test
  public void rulerWonLessThenThreeKingdoms() throws IOException {

    List<Messages> messages = new ArrayList<Messages>();

    messages.add(new Messages("LAND", "FAIJWJSOOFAMAU"));
    messages.add(new Messages("AIR", "ROZO"));
    messages.add(new Messages("ICE", "HSTSTVSASS"));
    messages.add(new Messages("WATER", "HSCBDYDGCBASS"));

    Set<String> wonKingdoms = rulerStrategy.getWonKingdoms(kingdoms, messages);

    assertEquals(1, wonKingdoms.size());
    assertTrue(wonKingdoms.contains("NONE"));

  }

  @Test
  public void rulerStrategyWithNoMessages() throws IOException { //no messages

    List<Messages> messages = new ArrayList<Messages>();

    Set<String> wonKingdoms = rulerStrategy.getWonKingdoms(kingdoms, messages);

    assertEquals(1, wonKingdoms.size());
    assertTrue(wonKingdoms.contains("NONE"));

  }

  @Test
  public void rulerStrategyWithWorngKingdomNames() throws IOException { //chech invalid kingdom names
    
    List<Messages> messages = new ArrayList<Messages>();

    messages.add(new Messages("land", "FAIJWJSOOFAMAU"));
    messages.add(new Messages("AOR", "ROZO"));
    messages.add(new Messages("I@E", "HSTSTVSASS"));
    messages.add(new Messages("WAER", "HSCBDYDGCBASS"));

    Set<String> wonKingdoms = rulerStrategy.getWonKingdoms(kingdoms, messages);

    assertEquals(1, wonKingdoms.size());
    assertTrue(wonKingdoms.contains("NONE"));
  }

  @Test
  public void rulerStrategyWithSmallCaseMessages() {

    List<Messages> messages = new ArrayList<Messages>();

    messages.add(new Messages("LAND", "faiosxfusa"));
    messages.add(new Messages("AIR", "rozo"));
    messages.add(new Messages("ICE", "hststvsastso"));
    messages.add(new Messages("WATER", "djcudsbch"));

    Set<String> wonKingdoms = rulerStrategy.getWonKingdoms(kingdoms, messages);

    assertEquals(1, wonKingdoms.size());
    assertTrue(wonKingdoms.contains("NONE"));

  }

  @Test
  public void rulerStrategyWithMultipleSameKngdomNames() {  //multiple kingdom naes

    List<Messages> messages = new ArrayList<Messages>();

    messages.add(new Messages("LAND", "FAIJWJSOOFAMAU"));
    messages.add(new Messages("AIR", "ROZO"));
    messages.add(new Messages("ICE", "STHSTSTVSASOS"));
    messages.add(new Messages("LAND", "FAIJWJSAMAU"));
    messages.add(new Messages("AIR", "RZO"));
    messages.add(new Messages("ICE", "STASOS"));
    messages.add(new Messages("LAND", "FAMAU"));
    messages.add(new Messages("AIR", "RASDFO"));
    messages.add(new Messages("ICE", "STHSTSTVSASOS"));


    Set<String> wonKingdoms = rulerStrategy.getWonKingdoms(kingdoms, messages);

    assertEquals(4, wonKingdoms.size());
    assertTrue(wonKingdoms.contains("LAND"));
    assertTrue(wonKingdoms.contains("AIR"));
    assertTrue(wonKingdoms.contains("ICE"));

  }
}