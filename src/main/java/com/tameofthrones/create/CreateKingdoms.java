package com.tameofthrones.create;

import java.io.IOException;
import java.util.List;

import com.tameofthrones.dto.Kingdom;

/*
* Create kingdoms with a method createKindoms.
* Returns List of kingdoms.
*/

public interface CreateKingdoms {
  
  List<Kingdom> getKingdoms() throws IOException;

}