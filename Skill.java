
public class Skill {
    public static int PHYSICAL =  0;
    public static int FIRE = 1;
    public static int WIND = 2;
    public static int EARTH = 3;

    private String name;
    private int magicMod;
    private int physicalMod;
    private int type;
    
    Skill(String name, int mod, int type){
        this.type = type;
        if(type == PHYSICAL){
            this.magicMod = 0;
            this.physicalMod = mod; 
        }else{
            this.magicMod = mod;
            this.physicalMod = 0;
        }
    }

    Skill(String name, int physicalMod, int magicMod, char type){
        this.name = name;
        this.type = type;
        this.magicMod = magicMod;
        this.physicalMod = physicalMod;
    }

    public String getName() {
        return name;
    }

    public int getMagicMod() {
        return magicMod;
    }

    public int getPhysicalMod() {
        return physicalMod;
    }

    public int getType() {
        return type;
    }
  
}
