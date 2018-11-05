# Implement and compare TDD and BDD.

This is an experiment to implement both TDD and BDD in a simple Java project.

I've been writing JUnit tests a dozen years or more for unit testing.

I have often written the unit tests as an after thought instead of practicing TDD.

I have recently been reading more about BDD and want to give that a go.

## Java Program

For this experiment I will write a 5 card poker hand comparator.

Initially there will be the following classes.

* Suit enum - clubs, diamonds, ...
* Rank enum - 2, 3, ...
* Card - has a Rank and Suit
* Hand - has five cards

The Suit and Rank enums will not be tested, they are enums after all.

The Card will use the lombok _@Data_ annotation so it will not need testing.

The Hand will be tested. Originally the Hand is an empty class (i.e. no methods)

## Course of Action

Everything will be done on branches. The branches will be numbered so that they can be referenced to see how the tests progress.

There will be a TDD branch and a BDD branch. At each step those branches will be merged into a TDD-BDD branch.

For example the first branch will be...

__step-1-tdd__ branch will show how start a TDD test

__step-1-bdd__ branch will show how to start a BDD test

__step-1-tdd-and-bdd__ branch will result from merging the previous two branches

__step-1-tdd-and-bdd__ will be merged into __master__


The second branch will be ...

__step-2-tdd__ will come off the __master__ branch and will enhance the TDD tests

__step-2-bdd__ will come off the __master__ branch and will enhance BDD tests

__step-2-tdd-and-bdd__ branch will result from merging the previous two branches

__step-2-tdd-and-bdd__ will be merged into __master__

And so on.

## Git 

The repos can be found at [tdd-bdd-experiment](https://github.com/gpratte/tdd-bdd-experiment.git)

The _.gitignore_ ignores the maven and IntelliJ files.

## step-1
Both the TDD and BDD tests fail to compile because the method they are testing, _compareTo_, has not yet been written in the Hand class.

## step-1-tdd

Uses JUnit to test that high card wins.

Add the HandTest.

## step-1-bdd

Uses cucumber to test that high card wins.

Add the
* RunCucumberTest class
* Stepdefs class
* high_card_wins.feature file

## step-1-tdd-and-bdd

Combined the TDD and BDD tests.

## step-2-tdd-and-bdd

Implemented the _compareTo_ method on the Hand class. 

See [Interface Comparable<T>](https://docs.oracle.com/javase/8/docs/api/java/lang/Comparable.html)

Tests now pass.

## step-3-tdd

Write another test where the second hand should win. This test will fail because of compareTo blindly returns 1 which means the first hand always wins.
## step-3-bdd

Write another scenario where the second hand should win. This test will fail because of compareTo blindly returns 1 which means the first hand always wins.

## step-3-tdd-and-bdd

Combined step 3 TDD and BDD

## step-4-tdd-and-bdd

Implemented comparing two high card hands.

Also tested and implemented two hands that tie.

Tests now pass.

