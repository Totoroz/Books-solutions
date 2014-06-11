/*Declare a class ComboLock that works like the combination lock
in a gym locker, as shown here. The lock is constructed with a
combina­tion—three numbers between 0 and 39. The reset method
resets the dial so that it points to 0. The turnLeft and turnRight
methods turn the dial by a given number of ticks to the left or
right. The open method attempts to open the lock. The lock opens
if the user first turned it right to the first number in the combina-
tion, then left to the second, and then right to the third.
    public class ComboLock
    {
       . . .
       public ComboLock(int secret1, int secret2, int secret3) { . . . }
       public void reset() { . . . }
       public void turnLeft(int ticks) { . . . }
       public void turnRight(int ticks) { . . . }
       public boolean open() { . . . }
    }*/

public class P8_09 {
    private int secret1;
    private int secret2;
    private int secret3;
    private int dial;

    public P8_09(int secret1, int secret2, int secret3) {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
    }

    public void reset() {
        this.dial = 0;
    }

    public void turnLeft(int ticks) {
        this.scroll(-ticks);
        if (this.secret1 == -1) {
            if (this.shouldUnlock(secret2) == true) {
                System.out.println("Secret 2 unlocked");
            }
        }
    }

    public void turnRight(int ticks) {
        this.scroll(ticks);
        if (this.shouldUnlock(secret1) == true) {
            System.out.println("Secret 1 unlocked");
            if (this.shouldUnlock(secret2) == true) {
                if (this.shouldUnlock(secret3) == true) {
                    System.out.println("Combo lock unlocked");
                }
            }
        }
    }

    public void scroll(int ticks) {
        if (this.dial + ticks > 39) {
            if (ticks >= 39) {
                this.dial += ticks - 39;
            } else if (this.dial >= 39) {
            }
        } else if (this.dial + ticks < 0) {
            this.dial += 40 + ticks;
            this.dial += ticks - 40;
        } else {
            this.dial += ticks;
        }
    }

    public boolean shouldUnlock(int secret) {
        if (this.dial == secret) {
            secret = -1;
            return true;
        } else {
            return false;
        }
    }
}
