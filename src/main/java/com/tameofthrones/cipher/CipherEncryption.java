package com.tameofthrones.cipher;

import java.util.List;

import com.tameofthrones.kingdom.Kingdom;

/*
* This class have one method which takes kingdoms as argument
* and it uses cipher code to encrypt kingdom's emblem . 
*/

public class CipherEncryption {
  
  public void encryptEmblem(List<Kingdom> kingdoms) {
    for (Kingdom kingdomEmblem : kingdoms) {
      String emblem = cipherEncryption(kingdomEmblem.getEmblem()).toUpperCase();
      kingdomEmblem.setEmblem(emblem);
    }
  }

  private String cipherEncryption(String emblem) {
    int cipherKey = emblem.length();
    String encryptedEmblem = "";
    for (int i = 0; i < cipherKey; i++) {
      encryptedEmblem += (emblem.charAt(i) + cipherKey);
    }
    return null;
  }

}