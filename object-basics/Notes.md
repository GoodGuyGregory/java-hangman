## Java Objects

**j-shell**

REPEL for Java introduced in Java 9

Opening Classes with Jshell is very easy use the `/open <classname>` make sure you are in the directory where your class exisits. and make sure that the class implementation is not `public class <desired class>`

**Objects**

Objects in java have two main things: 
* State
* Behavior

This has the ability to abtract the working process from the client

**YAGNI**

adding complexity to objects before they are built is a common mistake programmers make and it is a common phrase to emphasise this idea of not over complicating development. `KISS` or Keep it simple stupid.

`You.Aint.Gonna.Need.It.`

**Exceptions**

IllegalArgumentExceptions thrown are known as Runtime Error Handlers.

**MVP** 

Create a `minimum viable product`. the idea is to develope the minimum user storys before developing more tools. an MVP is defined by defining the minimum requirements to prove that the product is working as hypothesized.

**Separation of Concerns**

Code that modifies its own set of principles and is concerned with only the game logic would be the console prompting. this is a separation of concerns for the development process. the process was to separate the display of the game from the logic, or state of the game. because the concerns were separated, we will be able to use the same game logic in other applications, such as console applications, web apps and mobile apps

![](img/separation.png)

The Game class which will maintain the logic of the game. The Prompter class deals with the IO.

**Story Notes** 

Never stive to complete more than the story deserves, complete the task at hand then continue working through the next story after you have completed your work

**Command Line Arguments in Java**

passing in additional arguments to java with the `String[] args` implementation