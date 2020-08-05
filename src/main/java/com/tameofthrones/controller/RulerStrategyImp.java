package com.tameofthrones.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.tameofthrones.cipher.CipherEncryption;
import com.tameofthrones.cipher.CipherEncryptionImp;
import com.tameofthrones.dto.Kingdom;
import com.tameofthrones.dto.Messages;

public class RulerStrategyImp implements RulerStrategy {

  public Set<String> getWonKingdoms(List<Kingdom> kingdoms, List<Messages> messages) {
  
    //set to store the kingdom won by king.
    Set<String> wonKingdoms = new HashSet<String>();
    wonKingdoms.add("SPACE");

    CipherEncryption cipherEncryption = new CipherEncryptionImp();
    MatchEmblem matchEmblem = new MatchEmblem();

    //encrypt the kingdoms emblem according to cipher code.
    Map<String,String> encryptedEmblemKigdoms = cipherEncryption.encryptEmblem(kingdoms);

    for (Messages message : messages) {

      String kingdomName = message.getKingdom();
      String encryptedMessage = message.getMessage();
      //if kingdom name is not valid in messgae than discard that message.
      if (encryptedEmblemKigdoms.containsKey(kingdomName)) {

        String encryptedEmblem = encryptedEmblemKigdoms.get(kingdomName);

        //if encrypted message matches with the encrypted emblem for a kingdom than
        //add the kingdom to the set(wonKingdoms).
        if (matchEmblem.matchEmblemWithMessage(encryptedMessage, encryptedEmblem)) {
          wonKingdoms.add(kingdomName);
        }

      }
      

    }

    //if number of won kingdoms is greater or equal to 3 then return all won kingdoms.
    if (wonKingdoms.size() <= 3) {
      wonKingdoms.clear();
      wonKingdoms.add("NONE");
    }
    return wonKingdoms;
  }

}