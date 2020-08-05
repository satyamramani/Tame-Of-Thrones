package com.tameofthrones.create;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tameofthrones.dto.Kingdom;

public class CreateKingdomsImp implements CreateKingdoms {

  Map<String,String> kingdomAndEmblem = new HashMap<String,String>();
  List<Kingdom> kingdoms = new ArrayList<Kingdom>();

  public CreateKingdomsImp() {

    kingdomAndEmblem.put("SPACE", "Gorilla");
    kingdomAndEmblem.put("LAND", "Panda");
    kingdomAndEmblem.put("AIR", "Owl");
    kingdomAndEmblem.put("ICE", "Mammoth");
    kingdomAndEmblem.put("WATER", "Octopus");
    kingdomAndEmblem.put("FIRE", "Dragon");

  }

  public List<Kingdom> getKingdoms() throws IOException {

    for (String kingdomName : kingdomAndEmblem.keySet()) {

      kingdoms.add(new Kingdom(kingdomName, kingdomAndEmblem.get(kingdomName).toUpperCase()));

    }

    return kingdoms;
  }

}