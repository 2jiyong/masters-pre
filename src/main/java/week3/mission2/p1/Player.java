package week3.mission2.p1;

public class Player {
    private PlayerLevel level;

    public static final PlayerLevel BEGINNER_LEVEL = new BeginnerLevel();
    public static final PlayerLevel ADVANCED_LEVEL = new AdvancedLevel();
    public static final PlayerLevel SUPER_LEVEL = new SuperLevel();

    public Player(){
        level = new BeginnerLevel();
    }

    public void play(int count){
        level.go(count);
    }

    public void upgradeLevel(PlayerLevel level){
        this.level = level;
    }
}
