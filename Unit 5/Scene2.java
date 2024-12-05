public class Scene2
{
    //parameters for scene 1 in Bright Star
    private String characters;
    private String songList;
    private String setting;
    private String enterSL;
    private String enterSR;
    private String exitSL;
    private String exitSR;
    private String complexEntrences;


    
    /*constructer for a Bright Star cast member
     * note, SR = stage right
             SL = stage left */
    public Scene2(String c, String sL, String set, String entsl, String entsr, String exsl, String exsr)
    {
       characters = c;
       songList = sL;
       setting = set;
       enterSL = entsl;
       enterSR = entsr;
       exitSL = exsl;
       exitSR = exsr;
    }
    //for if the scene has no songs...
    public Scene2(String c, String set, String entsr, String entsl, String exsr, String exsl)
    {
        characters = c;
        setting = set;
        enterSL = entsl;
        enterSR = entsr;
        exitSL = exsl;
        exitSR = exsr;
    }

    public Scene2(String c, String set, String complexEntrences)
    {
        characters = c;
        setting = set;
        
    }
    
    //characters in scene2: All characters
    public void getChar()
    {
        System.out.println("Characters: " + characters);
    }
    //songs in scene 2: All songs
    public void getSongs()
    {
        System.out.println("Song List: " + songList);
    }
    //setting of scene 2
    public void getSetting()
    {
        System.out.println("Setting: " + setting);
    }
    //toString method :)
    public String toString()
    {
        return "Characters: " + characters + "\nSong List: " + songList + "\nSetting: " + setting + "\nEnter Stage Left: " + enterSL + "\nEnter Stage Right: " + enterSR + "\nExit Stage Left: " + exitSL + "\nExit Stage Right: " + exitSR;
    }

    public static void main(String[] args)
    {

        Scene2 s1 = new Scene2("Full Cast", "If You Knew My Story", "nowhere particular", "main cast + ensemble", "main cast + ensemble", "ensemble", "ensemble");
       // System.out.println(s1);
        Scene2 s2 = new Scene2("Billy, Margo, Daddy Cain, Spirits", "She's Gone", "Daddy Cain's Cabin", "Spirits", "null", "Billy, Daddy Cain", "Margo, Spirits");
        s2.getChar();

    }
    
}
