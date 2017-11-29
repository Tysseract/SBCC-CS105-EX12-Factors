# Exercise: Factors (18 points)

The project name of this exercise is **Factors** 

The purpose of this assignment is to learn how to do comparisons using the if statement and passing arguments into main() through the command line. Additionally, you get more practice on how to write all of your own code and Javadoc comments.

### Problem Description

The detailed description of this problem comes from the Programming Projects P4.17 on page 192 in the Late Objects book (P6.3 on page 302 in Early Objects). Ignore the last paragraph that starts `Use a class FactorGenerator`...

You are writing a program that prints out all the factors of a number, in ascending order. All the work of the program, as usual, will be in **Factors.java**. In `public static void main` you should have the user enter a single integer. Then pass that integer to a method you write, `public static String findFactors(int number)`. In that method you will find all the factors, in ascending order, and add them to a single string with a singe space between each number, including the last. Then return that string from the method.

Hints:

1. The parameter passed on the command line will always be integers greater than or equal to 2.
2. Don't forget about integer division and modulo!

### Getting Started

We are going to do this exercise by writing code that prints the factors of a given number in Factors.java. [How to Start Every Project in this Class](https://github.com/sbcc-cs105-spring2016/HowToStartEveryProject) create a source file called **Factors.java**. This is where your code will go. 

There is no code to copy for the assignment. You get to do it all! Don't forget to provide proper Javadoc documentation.

To run your own tests while developing, in `main` ask the user for input (using a scanner) and outputs the factors sequentially. If you input 150 then your output should look like this:

```
Enter a number greater than 2: 150
2 3 5 5
```

Notice that the numbers are in ascending order. You will need to do that too.

### Running the Unit Tests

Next you'll want to run these unit tests. Start by right-clicking on the `unittest.cs105` package and selecting **Run As -> JUnit Test**. 

To go back to the project view, select the **Package Explorer** tab.

### How to turn in this exercise

The first step of turning in your code is to commit and push your code to GitHub. Once you've completed this step your code will be on GitHub in your repository, not the repository for the class. This will allow you to use all your projects later as a portfolio.

To start the process write click your project and select **Team -> Commit...** and follow the usual procedures.

#### Completing the turn-in process


Now to complete the turn-in process, once you confirmed that your code is on BitBucket, you need to create a **build plan** on Bamboo. This action will create a Bamboo build plan that will build and test your code every time you push code to your project. You can also run builds manually

Follow the directions in [How to Turn in Every Project in This Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToTurnInEveryProjectInThisClass.md)

**NOTE** You do not need to anything on Canvas to turn-in your assignment, but your grade will be posted on there so that you may track your progress throughout the term.
