public class FootballPlayer extends Player{
    private int playerNumber;
    private String position;
    
    public void setPlayerNumber(int n) {
        playerNumber = n;
    }
    public int getPlayerNumber() {
        return playerNumber;
    }
    public void setPosition(String p) {
        position = p;
    } 
    public String getPosition () {
        return position;
    } 
    public boolean isSamePosition (FootballPlayer p){
        
        return (super.getTeam() == p.getTeam()) && (this.getPosition() == p.getPosition()); //equals medthod because medthod is private
   //because getTeam return value team and getPosition return value position
        /* String p1Team = super.getTeam();
        String p2Team = super.getTeam();
        return p1Team.equals(p2Team) && this.position.equals(p.position); **/

        }
    }



