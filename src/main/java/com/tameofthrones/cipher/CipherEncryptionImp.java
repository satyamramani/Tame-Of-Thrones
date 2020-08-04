package com.tameofthrones.cipher;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tameofthrones.dto.Kingdom;


public class CipherEncryptionImp implements CipherEncryption {

  //This method takes list of kingdom as argument and returns the encrypted emblem kingdom.
  public Map<String,String> encryptEmblem(List<Kingdom> kingdoms) {

    Map<String,String> encryptedEmblemKingdoms = new HashMap<String,String>();

    //iterate over each kingdom and encrypt its emblem.
    for (Kingdom kingdomEmblem : kingdoms) {

      String encryptedEmblem = cipherEncryptionString(kingdomEmblem.getEmblem().toUpperCase());
      encryptedEmblemKingdoms.put(kingdomEmblem.getKingdomName(), encryptedEmblem);

    }

    return encryptedEmblemKingdoms;
  }

  //This method encrypts emblem.
  public String cipherEncryptionString(String emblem) {

    int cipherKey = emblem.length();
    String encryptedEmblem = "";

    for (int i = 0; i < cipherKey; i++) {

      int encryptedEmblemChar = emblem.charAt(i) + cipherKey;

      if(encryptedEmblemChar > 90) {

        encryptedEmblemChar = encryptedEmblemChar - 26;
        encryptedEmblem += (char)(encryptedEmblemChar);

      } else {

        encryptedEmblem += (char)(encryptedEmblemChar);
      }
      
    }

    return encryptedEmblem;
  }
}