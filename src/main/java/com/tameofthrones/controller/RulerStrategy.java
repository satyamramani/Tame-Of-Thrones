package com.tameofthrones.controller;

import java.util.List;
import java.util.Set;

import com.tameofthrones.dto.Kingdom;
import com.tameofthrones.dto.Messages;

public interface RulerStrategy {

  Set<String> getWonKingdoms(List<Kingdom> kingdoms, List<Messages> messages);

}