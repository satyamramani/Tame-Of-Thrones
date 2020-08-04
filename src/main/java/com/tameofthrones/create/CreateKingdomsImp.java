package com.tameofthrones.create;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tameofthrones.dto.Kingdom;


public class CreateKingdomsImp implements CreateKingdoms {

  Map<String,String> kingdomAndEmblem = new HashMap<String,String>();
  List<Kingdom> kingdoms = new ArrayList<Kingdom>();

  public CreateKingdomsImp() {

    kingdomAndEmblem.put("SPACE", "GORILLA");
    kingdomAndEmblem.put("LAND", "PANDA");
    kingdomAndEmblem.put("WATER", "OCTOPUS");
    kingdomAndEmblem.put("ICE", "MAMMOTH");
    kingdomAndEmblem.put("AIR", "OWL");
    kingdomAndEmblem.put("FIRE", "DRAGON");

  }

  public List<Kingdom> creatKingdoms() {

    for (String kingdomName : kingdomAndEmblem.keySet()) {
      Kingdom kingdom = new Kingdom(kingdomName, kingdomAndEmblem.get(kingdomName));
      kingdoms.add(kingdom);
    }
    
    return kingdoms;
  }

}