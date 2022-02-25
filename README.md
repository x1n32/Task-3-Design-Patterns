# Task-3-Design-Patterns
Observer Design pattern and Decorator Design Pattern

The Code in the Decorator and Observer are demo code to provide the basics
They also provide a description on how they work
Please have a look.

Teamworking with another person is encouraged!

The tasks involve creating code that involves the character.java code
Character.java is the base. CharacterImp provides functionality to it as it now does something.
KnightClass.java is the Decorator Class. If you are familiar with RPG video games, sometimes they let you choose a class.
Knight takes functionality from CharacterImp, and adds some of its own.
KnightWithLightBoots and KnightWith Sword stem from the basic Knight class, by taking features of the knight class, with its own properties.

Tasks:
1. Look at the demo code provided in the folders to get familiar.
2. Create a KnightWithAShield.java class, that extends knightClass, that provides 10 extra defence, and returns " + shield " when the job function is called.
3. Let's create a new Decorator class like Knight, this time, lets have a Wizard class. Create a "WizardDecorator.java" that extends Character. Set its base magic to 20. Create a String method called magicSpell().
4. Get a friend to join your repository to create a "fireWizard.java" that extends WizardDecorator. Make magicSpell() output "Fireball!"

EXT:
5. Create an "apprentice.java" file. This will be your observer class.
6. Create a "Master.java" which will be another Decorator Class. This will also be our Observable class.
7. Set "Master" base stats all to 30. Create a method called "advice" similar to Channel.java's upload() method.
8. Can you notify "apprentice" when the "master" is going to call the "advice" method"




HINTS: 

4a. This is similar to KnightWithBoots and KnightWithSword




Apprentice listens to General 