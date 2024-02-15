public class Main{
    public static void main(String[] args) {
        Character player = new Player(1000, 20, 20, 50, 50);
        Character enemy1 = new Enemy(1000, 20, 20, 50, 50);
        Skill sex = new Skill("sex", 1, Skill.PHYSICAL);

        player.attack(sex, enemy1);
        System.out.println(enemy1.getHealth());
    }
}