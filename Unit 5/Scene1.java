public class Scene1 
{
    //parameters for scene 1 in Bright Star
    private String characters;
    private String songList;
    private String setting;


    
    //constructer for a Bright Star cast member
    public Scene1(String c, String sL, String set)
    {
       characters = c;
       songList = sL;
       setting = set;
    }
    
    //characters in scene1: All characters
    public void getChar()
    {
        System.out.println(characters);
        
    }

    
}
