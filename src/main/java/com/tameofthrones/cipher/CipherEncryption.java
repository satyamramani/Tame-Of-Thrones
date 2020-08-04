package com.tameofthrones.cipher;

import java.util.ArrayList;
import java.util.List;

import com.tameofthrones.kingdom.Kingdom;

/*
* This class have one method which takes kingdoms as argument
* and it uses cipher code to encrypt kingdom's emblem . 
*/

public class CipherEncryption {
  
  public List<Kingdom> encryptEmblem(List<Kingdom> kingdoms) {
    List<Kingdom> kingdomsCopy = new ArrayList<Kingdom>(kingdoms.size());
    for (Kingdom kingdom : kingdoms) kingdomsCopy.add(new Kingdom(kingdom));
    for (Kingdom kingdomEmblem : kingdomsCopy) {
      String emblem = cipherEncryption(kingdomEmblem.getEmblem().toUpperCase());
      kingdomEmblem.setEmblem(emblem);
    }
    return kingdomsCopy;
  }

  private String cipherEncryption(String emblem) {
    int cipherKey = emblem.length();
    String encryptedEmblem = "";
    for (int i = 0; i < cipherKey; i++) {
      int encryptedEmblemChar = emblem.charAt(i) + cipherKey;
      if(encryptedEmblemChar > 90) {
        encryptedEmblemChar = encryptedEmblemChar - 26;
        encryptedEmblem += (char)(encryptedEmblemChar);
      }
      else {
        encryptedEmblem += (char)(encryptedEmblemChar);
      }
      
    }
    return encryptedEmblem;
  }

}