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
  
    Set<String> wonKingdoms = new HashSet<String>();
    wonKingdoms.add("SPACE");
    CipherEncryption cipherEncryption = new CipherEncryptionImp();
    MatchEmblem matchEmblem = new MatchEmblem();
    Map<String,String> encryptedEmblemKigdoms = cipherEncryption.encryptEmblem(kingdoms);
    for (Messages message : messages) {
      String kingdomName = message.getKingdom();
      String encryptedMessage = message.getMessage();
      String encryptedEmblem = encryptedEmblemKigdoms.get(kingdomName);
      if (matchEmblem.matchEmblemWithMessage(encryptedMessage, encryptedEmblem)) {
        wonKingdoms.add(kingdomName);
      }

    }

    if (wonKingdoms.size() <= 3) {
      wonKingdoms.clear();
      wonKingdoms.add("NONE");
    }
    return wonKingdoms;
  }

}