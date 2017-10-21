package PP.PP201516.Q3;

public class Main {
    public static void main (String args[]){
        GClubMember member1 = new GClubMemberAdapter( new AClubMember("Edward","Fung",11,11,2011));
        DisplayMember.showGClubMember(member1);
    }
}
