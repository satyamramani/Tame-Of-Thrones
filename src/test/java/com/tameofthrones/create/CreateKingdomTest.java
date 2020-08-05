package com.tameofthrones.create;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.tameofthrones.dto.Kingdom;

import org.junit.jupiter.api.Test;

public class CreateKingdomTest {

  @Test
  public void getKingdomNameTest() throws IOException { // for kingdom names
    
    List<String> kingdomNames = new ArrayList<String>();

    CreateKingdoms createKingdoms = new CreateKingdomsImp();

    List<Kingdom> kingdoms = createKingdoms.getKingdoms();

    for (Kingdom kingdom : kingdoms) {
      kingdomNames.add(kingdom.getKingdomName());
    }

    Collections.sort(kingdomNames);
    //for expected list of kingdoms
    List<String> expectedKingdoms = new ArrayList<String>();
    expectedKingdoms.add("SPACE");
    expectedKingdoms.add("LAND");
    expectedKingdoms.add("WATER");
    expectedKingdoms.add("ICE");
    expectedKingdoms.add("AIR");
    expectedKingdoms.add("FIRE");

    Collections.sort(expectedKingdoms);

    assertEquals(6, kingdoms.size());
    assertEquals(expectedKingdoms,kingdomNames);

  }

  @Test
  public void getKingdomEmblemTest() throws IOException { // for kingdom emblem test

    List<String> kingdomEmblem = new ArrayList<String>();

    CreateKingdoms createKingdoms = new CreateKingdomsImp();

    List<Kingdom> kingdoms = createKingdoms.getKingdoms();

    for (Kingdom kingdom : kingdoms) {
      kingdomEmblem.add(kingdom.getEmblem());
    }

    Collections.sort(kingdomEmblem);
    //for expected list of kingdoms
    List<String> expectedKingdomEmblem = new ArrayList<String>();
    expectedKingdomEmblem.add("GORILLA");
    expectedKingdomEmblem.add("PANDA");
    expectedKingdomEmblem.add("MAMMOTH");
    expectedKingdomEmblem.add("OCTOPUS");
    expectedKingdomEmblem.add("OWL");
    expectedKingdomEmblem.add("DRAGON");

    Collections.sort(expectedKingdomEmblem);

    assertEquals(6, kingdoms.size());
    assertEquals(expectedKingdomEmblem,kingdomEmblem);
  }

  
}