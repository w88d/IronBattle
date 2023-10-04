import java.util.Random;

public class Wizard extends Character implements Attacker {
    private int mana;
    private int intelligence;

    public Wizard(String name, int hp, int mana, int intelligence) {
        super(name, hp);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public void attack(Character character, String attackType) {
        if (character.isAlive()) {
            String msg = "\nWizard name: " + getName() + " is performing a " + attackType + " attack.";
            System.out.println(msg);
            Main.writeTolog(msg);
        }
        if (attackType.equals("FireBall")) {

            if (mana > 0) {
                character.setHp(character.getHp() - intelligence);
                String msg2 = "\nWizard name: " + getName() + " casts a Fireball on " + character.getName() + ", mana is " + getMana();
                System.out.println(msg2);
                Main.writeTolog(msg2);
                mana -= 5;
            } else {
                mana = 0;
            }
        } else if (attackType.equals("Staff hit") ) {
            character.setHp(character.getHp() - 2);

            String msg3 = "\nWizard name: " + getName() + " hits " + character.getName() + " with the staff " + ", mana is " + getMana() + ", intelligence is " + intelligence + ".";
            System.out.println(msg3);
            Main.writeTolog(msg3);
            mana += 1;

        } else if (mana - 2 == 0) {
            mana += 2;
        }

        if (character.getHp() <=0) {
            character.setAlive(false);
            setHp(getHp() - intelligence);
            String msg4 = "\nThe winner is " + getName() + ".";
            System.out.println(msg4);
            Main.writeTolog(msg4);
        }

    }
}