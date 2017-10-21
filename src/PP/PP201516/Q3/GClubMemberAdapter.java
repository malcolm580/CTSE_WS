package PP.PP201516.Q3;

public class GClubMemberAdapter extends  GClubMember {

    private AClubMember adaptee;

    public GClubMemberAdapter( AClubMember adaptee ){
        super();
        this.adaptee = adaptee;
    }

    public String getSurname( ) { return adaptee.getLastName(); }
    public String getFirstName( ) { return adaptee.getInitials(); }
    public int[] getAnnualDate( ) { return adaptee.getJoinDate(); }

}
