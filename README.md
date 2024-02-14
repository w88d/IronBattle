# IronBattle homework
A basic RPG battle simulator that will consist of having two characters fighting to determine one winner.

 # Description

The characters are created before the battle starts. They can have either the same character type or different character types.
 
The battle is 1 vs. 1 and will be by rounds, in each round both combatants will attack at the same time (so even if one combatant does the killing blow both will take damage). So the combat could end in a tie. In case of a tie, the battle is restarted to have only one winner.
 

There are two scenarios we used to implement this project.

The project Starts with a text-based menu the user can navigate through.

First scenario: The user creates warriors and wizards individually customizing their stats and name, providing all the details manually. The code for this scenario was commented out in the main method.

Second scenario: This is the default scenario. The user is asked to choose the character type, and write at the names. The name shouldn’t have numbers and should be one word!

The whole battle is simulated afterwards by creating random characters with random stats and making them duel.

The characters are wizards and warriors.

Every round a warrior will have randomly either a Heavy attack or a Weak attack. The damage of a Heavy attack is equal to their strength and every hit will decrease their stamina by 5 points. The damage of a Weak attack is half of the strength (truncate decimals). Every Weak attack will recover his stamina by 1. If a warrior does not have the stamina to make a Heavy attack he will do a Weak attack instead.

If a warrior does not have the stamina to do a Weak attack he will not inflict any damage and recover his stamina by 2.

Every round a wizard will try to randomly cast either a Fireball or a Staff hit. The damage of a Fireball is equal to his intelligence and every Fireball will decrease their mana by 5 points. The damage of a staff hit is equal to 2. Every staff hit will recover his mana by 1.
If a wizard does not have the mana to cast a Fireball he will do a Staff hit instead.
If a wizard does not have the mana to cast a Staff hit he will not inflict any damage and recover his mana by 2.

 

If statements were used in the attack methods to validate each condition.

# In both scenarios 

a battle between the characters will start and determine the winner.
a complete log of the battle is displayed on the command line. When the battle is over the winner is displayed as well. a log of the battle is stored in a text file as will.


 # Documentation
[Logging Using FileWriter](https://youtu.be/ijQCdoSUX4o?si=Tfd49AZYVNaQHODc) 


[JavaFiles](https://www.w3schools.com/java/java_files.asp)

