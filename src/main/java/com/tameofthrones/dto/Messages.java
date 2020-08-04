package com.tameofthrones.dto;

/*
* To store the kingdom and the encrypted messages.
*/
public class Messages {
  
  public String kingdom;
  public String message;

  public String getKingdom() {
    return kingdom;
  }

  public void setKingdom(String kingdom) {
    this.kingdom = kingdom;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Messages(String kingdom, String message) {
    this.kingdom = kingdom;
    this.message = message;
  }

  @Override
  public String toString() {
    return "Messages [kingdom=" + kingdom + ", message=" + message + "]";
  }

  
  
}