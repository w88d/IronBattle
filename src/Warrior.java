import java.util.Random;

public class Warrior extends Character implements Attacker{
    private int stamina;
    private int strength;

    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        this.stamina = stamina;
        this.strength = strength;
    }

    public int getStamina() {
        return stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    @Override
    public void attack(Character character, String attackType) {
        if (character.isAlive()) {
            String msg = "\nWarrior name: " + getName() + " is performing a " + attackType + " attack.";
            System.out.println(msg);
            Main.writeTolog(msg);
        }
        if (attackType.equals("Heavy")  ) {
            if (stamina > 0) {
                character.setHp(character.getHp() - strength);
                String  msg1= "\nWarrior name: " + getName() + ". Stamina is " + stamina + ", received a " + strength + " damage points.";
                System.out.println(msg1);
                Main.writeTolog(msg1);
                stamina -= 5;
            }else{
                stamina = 0;
            }
        }else if (attackType.equals("Weak") ) {
            character.setHp(character.getHp() - (strength /2));
            String msg2="\nWarrior name: " + getName() +". Stamina is "+ stamina + ", received a " + strength / 2 + " damage points.";
            System.out.println(msg2);
            Main.writeTolog(msg2);
            stamina += 1;
        } else if (stamina / 2 == 0) {
            stamina += 2;
        }

        if (character.getHp() <= 0) {
            character.setAlive(false);
            setHp(getHp() - strength);
            String  msg4= "\nThe winner is " + getName()+".";
            System.out.println(msg4);
            Main.writeTolog(msg4);
        }
    }
}