package com.tameofthrones.controller;

import java.util.HashSet;
import java.util.Set;

public class MatchEmblem {

  // this methode will match the encryptedMessage to encryptedEmblem and returns true or false.
  public boolean matchEmblemWithMessage(String encryptedMessage, String encryptedEmblem) {

    Set<Character> emblemCharSet = stringToCharacterSet(encryptedEmblem);

    //iterate over each char in message and remove the matching char from set(emblemCharSet).
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