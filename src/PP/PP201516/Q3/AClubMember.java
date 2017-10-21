package PP.PP201516.Q3;

class AClubMember {
    String lastName; // Family Name
    String initials; // name
    int[] joinDate = new int[3];// MM, DD, YYYY
    public AClubMember( ) { this("UNKNOW","UNKNOW",0,0,0);}
    public AClubMember (String lastName, String initials, int mm, int dd, int yyyy) {
        this.lastName = lastName;
        this.initials = initials;
        joinDate[0] = mm; joinDate[1] = dd; joinDate[2] = yyyy;
    }
    public String getLastName( ) { return lastName; }
    public String
    getInitials( ) { return initials; }
    public int[] getJoinDate ( ) { return joinDate; }
}
