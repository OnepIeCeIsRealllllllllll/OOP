public class Player {
    private String name;//attribute
    private String team;
    
    public void setName(String n){
        name = n;
        
    }
    public String getName(){
        return name;
    }
    public void setTeam(String t) {
        team = t;
    }
    public String getTeam() {
       return team; // return team(private) in Footballteam equals medthod
    }
    public boolean isSameTeam(Player p){
        return (team == p.team);
        }
}
    

