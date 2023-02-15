package src;
import src.characters.Character;
import src.characters.enemies.*;
import src.gear.Crate;
import src.gear.attack.AttackType;
import src.gear.attack.combat.Weapon;
import src.gear.attack.magic.Spell;

import java.util.Objects;
import java.util.Random;

public class GameBoard {
    Random r = new Random();
//    ArrayList<Case> virtualBoard = new ArrayList<String>();

    /**
     * JE PLACE D'OFFICE LES CRATES ET LES MONSTRES
     * JE PARAMÈTRE LEURS POSITIONS GRÂCE AUX SETTERS
     */
    /**
     * Crates
     */
    private final Crate crate1 = new Crate(r.nextInt(1,15));
    private final Crate crate2 = new Crate(r.nextInt(16,28));
    private final Crate crate3 = new Crate(r.nextInt(30,44));
    private final Crate crate4 = new Crate(r.nextInt(45,62));
    private final Crate[] crates = {crate1, crate2, crate3, crate4};
    /**
     * Monstres
     */
    private final Goblin goblin = new Goblin("Grey Goblin", r.nextInt(1,15));
    private final Sorcerer sorcerer = new Sorcerer("Conjurer", r.nextInt(1,15));
    private final EvilSpirit spirit = new EvilSpirit("Ghostface", r.nextInt(1,15));
    private final Orc orc = new Orc("Orca",r.nextInt(1,15));
    private final Dragon dragon = new Dragon("Cryo Dragon", r.nextInt(45,62));
    private final Character[] monsters = {goblin, sorcerer, spirit, orc, dragon};



    /**
     * MÉTHODE POUR VÉRIFIER SI IL Y A UNE CRATE À L'EMPLACEMENT DU JOUEUR
     * @param pick SI LE JOUEUR RENCONTRE UNE CRATE, IL STOPPE SON TOUR POUR LOOTER
     * @param player POSITION DU JOUEUR
     * @return LA MÉTHODE RETOURNE LA VALEUR DE PICK (MON DÉ), SI IL N'Y A RIEN LA BOUCLE REPREND LÀ OÙ
     *          ELLE S'EST ARRÊTÉE, SINON PICK PASSE À 0 ET LE TOUR SE TERMINE LÀ OÙ IL Y A LA CRATE.
     */
    public int checkCrate (int pick, Character player) {
        for (Crate crate: crates) {
            if (player.getPosition() == crate.getPosition()) {
                System.out.println("You encounter : A CRATE !");
                System.out.println("You open it and take the item");
                lootCrate(player);
                return pick = 0;
            }
        }
        return pick;
    }
    public boolean checkFoe (int pick, Character player) {
        for (Character monster : monsters) {
            if (player.getPosition() == monster.getPosition()) {
                System.out.println("WATCH OUT ! A "+monster.getType()+" just appeared !");
                pick = 0;
                return true;
            }
        }
        return false;
    }

/**
 * SYSTÈME DE LOOTBOXES: 2 POSSIBILITÉS, SOIT UNE ARME/SPELL, SOIT UNE POTION QUI REND DE LA SANTÉ AU JOUEUR.
 * ON TIRE AU SORT LEQUEL DE CES DEUX CAS S'APPLIQUERA À LA LOOTBOX, SI LE JOUEUR TIRE 1 ON VÉRIFIE SON TYPE ET
 * IL REÇOIT UNE ARME TIRÉE AU SORT, QUI SERA ACCORDÉE À SON TYPE.
 * SI LE JOUEUR OBTIENT 2 ON TIRE AU SORT POUR QUE LE JOUEUR RÉCUPÈRE SOIT UNE GROSSE POTION SOIT UNE PETITE POTION
 * ET LES POINTS DE VIE QUI VONT AVEC.
 *
 * @param player JOUEUR
 */
    public void lootCrate (Character player) {
        Random r = new Random();
        int loot = r.nextInt(1, 3);
        switch (loot) {
            /**
             * ARMES/SPELLS
             */
            case 1 -> {
                loot = r.nextInt(1, 2);
                if (Objects.equals(player.getType(), "Wizard")) {
                    if (loot > 1 && hasGear(player)) {
                        player.setAttackGear(new Spell(AttackType.Fire, "Fire Stream", 7));
                        System.out.println("You get... " + player.getAtkGear().getName() + " !");
                        System.out.println("Your attack is now increased by "+ player.getAtkGear().getAtk());
                        player.setStrength(player.getStrength() + player.getAtkGear().getAtk());
                        break;
                    } else if (loot == 1 && hasGear(player)) {
                        player.setAttackGear(new Spell(AttackType.Lightning, "Ligntning Bolt", 2));
                        System.out.println("You get... " + player.getAtkGear().getName() + " !");
                        System.out.println("Your attack is now increased by "+ player.getAtkGear().getAtk());
                        player.setStrength(player.getStrength() + player.getAtkGear().getAtk());
                        break;
                    } else {
                        System.out.println("Nothing you can use...");
                    }
                    break;
                }
                if (Objects.equals(player.getType(), "Warrior")) {
                    if (loot == 1 && hasGear(player)) {
                        player.setAttackGear(new Weapon(AttackType.Blade, "Stone Blade", 5));
                        System.out.println("You get... " + player.getAtkGear().getName() + " !");
                        System.out.println("Your attack is now increased by "+ player.getAtkGear().getAtk());
                        player.setStrength(player.getStrength() + player.getAtkGear().getAtk());
                        break;
                    } else if (loot == 2 && hasGear(player)) {
                        player.setAttackGear(new Weapon(AttackType.Mace, "Whack Mace", 3));
                        System.out.println("You get... " + player.getAtkGear().getName() + " !");
                        System.out.println("Your attack is now increased by "+ player.getAtkGear().getAtk());
                        player.setStrength(player.getStrength() + player.getAtkGear().getAtk());
                        break;
                    } else {
                        System.out.println("Nothing you can use...");
                    }
                    break;
                }
                System.out.println("ATK : "+player.getStrength());
            }
            /**
             * POTIONS
             */
            case 2 -> {
                loot = r.nextInt(1, 2);
                if (loot == 1) {
                    consumePotion("You found a BIG Potion, your health increases by 5 Points !", player, 5);
                    break;
                }
                if (loot == 2) {
                    consumePotion("You found a SMALL Potion, your health increases by 2 Points !", player, 2);
                    break;
                }
            }
        }
    }

    private static boolean hasGear(Character player) {
        boolean hasGear;
        if (player.getAtkGear() == null) {
            hasGear = false;
        } if (player.getAtkGear() != null && player.getAtkGear().getAtk() < 7) {
            hasGear = false;
        } else {
            hasGear = true;
        }
        return hasGear;
    }

    private static void consumePotion(String x, Character player, int x1) {
        System.out.println(x);
        player.setHealth(player.getHealth() + x1);
        System.out.println("You now have " + player.getHealth() + " HP.");
    }
}