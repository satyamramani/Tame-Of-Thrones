package com.tameofthrones.create;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tameofthrones.dto.Kingdom;


public class CreateKingdomsImp implements CreateKingdoms {

  //map to initialize the kingdom name and emblem.
  Map<String,String> kingdomAndEmblem = new HashMap<String,String>();
  List<Kingdom> kingdoms = new ArrayList<Kingdom>();

  //it creates a kingdom with kingdom name and kingdom emblem.
  public CreateKingdomsImp() {

    kingdomAndEmblem.put("SPACE", "GORILLA");
    kingdomAndEmblem.put("LAND", "PANDA");
    kingdomAndEmblem.put("WATER", "OCTOPUS");
    kingdomAndEmblem.put("ICE", "MAMMOTH");
    kingdomAndEmblem.put("AIR", "OWL");
    kingdomAndEmblem.put("FIRE", "DRAGON");

  }

  public List<Kingdom> getKingdoms() {

    for (String kingdomName : kingdomAndEmblem.keySet()) {
      Kingdom kingdom = new Kingdom(kingdomName, kingdomAndEmblem.get(kingdomName));
      kingdoms.add(kingdom);
    }
    
    return kingdoms;
  }

}