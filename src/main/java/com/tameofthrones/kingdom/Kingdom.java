package com.tameofthrones.kingdom;

public class Kingdom {
  
  public String kingdomName;
  public String emblem;

  public String getKingdomName() {
    return kingdomName;
  }

  public void setKingdomName(String kingdomName) {
    this.kingdomName = kingdomName;
  }

  public String getEmblem() {
    return emblem;
  }

  public void setEmblem(String emblem) {
    this.emblem = emblem;
  }

  public Kingdom(String kingdomName, String emblem) {
    this.kingdomName = kingdomName;
    this.emblem = emblem;
  }
  
}