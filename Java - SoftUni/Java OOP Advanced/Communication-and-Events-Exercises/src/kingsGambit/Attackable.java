package kingsGambit;


public interface Attackable {
    
    void addDefender(Defender defender);
    
    void killDefender(String defender);
    
    void respondToAttack();
}
