public abstract class Character {
    private int health;
    private int strength;
    private int magic;
    private int resistance;
    private int agility;
    private int isDown;
    
    public Character(int health, int strength, int magic, int resistance, int agility) {
        this.health = health;
        this.strength = strength;
        this.magic = magic;
        this.resistance = resistance;
        this.agility = agility;
    }

    public void attack(Skill skill, Character characterAttacked){
        double characterDamage;
        checkAffinities(skill);
        if(skill.getType() == Skill.PHYSICAL){
            characterDamage = skill.getPhysicalMod() * this.strength;
        }else{
            characterDamage = skill.getMagicMod() * this.magic;
        }
        double damageNegated = 100 / 100 + characterAttacked.getResistance();
         
        characterAttacked.recieveDamage((int)(characterDamage * damageNegated));
    }

    private void checkAffinities(Skill skill) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checkAffinities'");
    }

    public int getHealth() {
        return health;
    }

    public void heal(int amount){
        setHealth(getHealth() + amount);
    }

    public void recieveDamage(int amount){
        setHealth(getHealth() - amount);
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getResistance() {
        return resistance;
    }

    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }
    
}
