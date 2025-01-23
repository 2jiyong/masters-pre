package week3.mission2.p1;

public abstract class PlayerLevel {
    public abstract void run();
    public abstract void jump();
    public abstract void turn();

    final public void go(int count){
        run();
        for(int i=0; i<count; i++){
            jump();
        }
        turn();
    }
}
