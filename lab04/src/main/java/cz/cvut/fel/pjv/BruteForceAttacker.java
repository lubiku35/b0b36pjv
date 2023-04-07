package cz.cvut.fel.pjv;
 
public class BruteForceAttacker extends Thief {
    @Override
    public void breakPassword(int sizeOfPassword) {
        breakPassword(sizeOfPassword, "");
        return;
    }
 
    private boolean breakPassword(int size, String pwd) {
        if (pwd.length() == size) { if (tryOpen(pwd.toCharArray())) { return true; }
        } else { for (char x : getCharacters()) { if (breakPassword(size, pwd + x)) { return true; } } }
        return false;
    }
}
