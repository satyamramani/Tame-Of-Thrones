package com.tameofthrones.controller;

import java.util.ArrayList;
import java.util.List;

public class MatchEmblem {

  // this methode will match the encryptedMessage to encryptedEmblem and returns true or false.
  public boolean matchEmblemWithMessage(String encryptedMessage, String encryptedEmblem) {

    List<Character> emblemCharSet = stringToCharacterSet(encryptedEmblem);

    //iterate over each char in message and remove the matching char from set(emblemCharSet).
    for (char ch : encryptedMessage.toCharArray()) {
      if (emblemCharSet.contains(ch)) {
        emblemCharSet.remove(Character.valueOf(ch));
      }
    }

    if (emblemCharSet.isEmpty()) {
      return true;
    }
    
    return false;
    
  }

  public List<Character> stringToCharacterSet(String encryptedEmblem) {
    List<Character> list = new ArrayList<Character>();
    for (char ch : encryptedEmblem.toCharArray()) {
        list.add(ch);
    }
    return list;
  }

}