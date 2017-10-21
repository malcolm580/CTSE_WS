package PP.PP201516.Q3;

class GClubMember {
    String surname; // Family Name
    String firstName; // name
    int[] annualDate = new int[3];// DD, MM, YYYY
    public GClubMember( ) {
        this("UNKNOW","UNKNOW",0,0,0);}
    public GClubMember (String surname, String firstName,
                        int dd, int mm, int yyyy) {
        this.surname = surname;
        this.firstName = firstName;
        annualDate[0] = dd; annualDate[1] = mm;
        annualDate
                [2] = yyyy;
    }
    public String getSurname( ) { return surname; }
    public String getFirstName( ) { return firstName; }
    public int[] getAnnualDate( ) { return annualDate; }
}
