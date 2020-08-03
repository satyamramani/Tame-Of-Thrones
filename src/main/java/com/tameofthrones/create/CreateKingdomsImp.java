package com.tameofthrones.create;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tameofthrones.kingdom.Kingdom;

public class CreateKingdomsImp implements CreateKingdoms {

  Map<String,String> kingdomAndEmblem = new HashMap<String,String>();
  List<Kingdom> kingdoms = new ArrayList<Kingdom>();

  public CreateKingdomsImp() {

    kingdomAndEmblem.put("SPACE", "Gorilla");
    kingdomAndEmblem.put("LAND", "Panda");
    kingdomAndEmblem.put("WATER", "Octopus");
    kingdomAndEmblem.put("ICE", "Mammoth");
    kingdomAndEmblem.put("AIR", "Owl");
    kingdomAndEmblem.put("FIRE", "Dragon");

  }

  public List<Kingdom> creatKingdoms() {

    for (String kingdomName : kingdomAndEmblem.keySet()) {
      Kingdom kingdom = new Kingdom(kingdomName, kingdomAndEmblem.get(kingdomName));
      kingdoms.add(kingdom);
    }
    
    return kingdoms;
  }

}