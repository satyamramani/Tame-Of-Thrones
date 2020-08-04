package com.tameofthrones.controller;

import java.util.HashSet;
import java.util.Set;

public class MatchEmblem {

  public boolean matchEmblemWithMessage(String encryptedMessage, String encryptedEmblem) {

    Set<Character> emblemCharSet = stringToCharacterSet(encryptedEmblem);

    for (char ch : encryptedMessage.toCharArray()) {
      if (emblemCharSet.contains(ch)) {
        emblemCharSet.remove(ch);
      }
    }

    if (emblemCharSet.isEmpty()) {
      return true;
    }
    
    return false;
    
  }

  public Set<Character> stringToCharacterSet(String encryptedEmblem) {
    Set<Character> set = new HashSet<Character>();
    for (char ch : encryptedEmblem.toCharArray()) {
        set.add(ch);
    }
    return set;
  }

}