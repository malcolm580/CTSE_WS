package PP.PP201516.Q3;

class DisplayMember {
    public static void showGClubMember(GClubMember gm) {
        System.out.println("Member: " + gm.getFirstName( ) +
                        ", "+ gm.getSurname( )
                        + "\t [Annual date: " +
        gm.getAnnualDate( )[0] + " - " +
        gm.getAnnualDate( )[1] + " - " +
        gm.getAnnualDate( )[2] +"]");
    }
}
