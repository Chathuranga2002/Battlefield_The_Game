import java.util.concurrent.ThreadLocalRandom;

public class Bomb implements Weapon{
    int rand;
    @Override
    public void Shoot() {
        ThreadLocalRandom random = ThreadLocalRandom. current();
         rand = random. nextInt(1, 11);

    }

    @Override
    public int getScore() {
        return rand;
    }
}
