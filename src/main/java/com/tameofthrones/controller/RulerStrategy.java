package com.tameofthrones.controller;

import java.util.List;

import com.tameofthrones.dto.Kingdom;
import com.tameofthrones.dto.Messages;

public interface RulerStrategy {

  List<String> getWonKingdoms(List<Kingdom> kingdoms, List<Messages> messages);

}