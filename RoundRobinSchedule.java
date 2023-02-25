import java.util.*;
public class RoundRobinSchedule {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String>teams=new ArrayList<>();
        ArrayList<Object> a=new ArrayList<>();
        ArrayList<HashMap<String,String>> map=new ArrayList<>();
        teams.add("team1");
        teams.add("team2");
        teams.add("team3");
        teams.add("team4");
        teams.add("team5");
        Match m1=new Match(teams.get(0));
        Match m2=new Match(teams.get(1));
        Match m3=new Match(teams.get(2));
        Match m4=new Match(teams.get(3));
        Match m5=new Match(teams.get(4));
        a.add(m1);
        a.add(m2);
        a.add(m3);
        a.add(m4);
        a.add(m5);
        new Match(a);
    }
}
class Match
{
    String team;
    Match(String team)
    {
        this.team=team;
    }
    public String toString()
    {
        return team;
    }
    Match(ArrayList<Object> obj)
    {
        for (int i = 0; i < obj.size(); i++) 
        {
            System.out.println("day " + (i + 1) + " Matches");
            for (int j = 0; j < obj.size() / 2; j++) 
            {
                int t1 = (i + j) % (obj.size() - 1);
                int t2 = (obj.size() - 1 - j + i) % (obj.size() - 1);
                if (j == 0) {
                    t2 = obj.size() - 1;
                }
                System.out.println(obj.get(t1) + " VS " + obj.get(t2));
            }
        }
    }
}
