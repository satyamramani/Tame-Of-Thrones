package com.tameofthrones.controller;

import java.util.List;
import java.util.Set;

import com.tameofthrones.dto.Kingdom;
import com.tameofthrones.dto.Messages;

/*
* RulerStrategy has one method getWonKingdoms where
* it takes arguments kingdoms and messages as lists.
* and returns the kingdoms which is won by shan king.
*/

public interface RulerStrategy {

  Set<String> getWonKingdoms(List<Kingdom> kingdoms, List<Messages> messages);

}