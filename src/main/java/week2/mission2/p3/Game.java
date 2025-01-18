package week2.mission2.p3;
import java.util.Random;
public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        Originator gamer = new Originator();
        Originator.Memento memento = gamer.createMemento();

        for (int i=0; i<1000; i++) {
            int dice = random.nextInt(6) + 1;
            solveDiceResult(dice,gamer);

            if (gamer.hasMoreMoneyThanMemento(memento)){
                memento = gamer.createMemento();
            }
            else if (gamer.hasLessThanHalfMoneyOfMemento(memento)){
                gamer.setMemento(memento);
            }
        }
        printResult(gamer);
    }

    public static void solveDiceResult(int dice, Originator gamer){
        if (dice==1 || dice==3){
            gamer.setMoney(gamer.getMoney()+100);
        }
        else if (dice==2 || dice==4){
            gamer.setMoney(gamer.getMoney()/2);
        }
        else if (dice==6){
            int idx = gamer.getFruitNumber()%3;
            gamer.getFruits()[idx].setCount(gamer.getFruits()[idx].getCount()+1);
            gamer.setFruitNumber(idx+1);
        }
    }

    public static void printResult(Originator gamer){
        System.out.println("현재 돈 : "+gamer.getMoney());
        System.out.println("현재 과일 : "+gamer.getFruits()[0].getCount()+" "+gamer.getFruits()[1].getCount()+" "+gamer.getFruits()[2].getCount());
    }
}
