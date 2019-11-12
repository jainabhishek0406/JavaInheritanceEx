# Java Inheritance introduction with Example
Java Inheritance- parent&amp;child or super&amp;sub class code implementation 

Problem
How we can enforce child class to provide values to parent class variables.

Solution
In some application we want child class to provide values for parent class, because for some calculation or logic we want common logic in parent class for all sub classes depending upon the variable values from each sub class.

So to fulfill this case, we want to enforce subclass to provide values for parent class variables otherwise it cannot extends parent class.

Example-
Suppose we are working on a ‘TravelTimeCalculation’ project in which, we want to calculate travel time through vehicle speed and distance. 
For this formula is

Time = Distance/Speed

As per oops concept, how we should design this project?
OK.
We will create ParentClass ‘ModeOfTravel’.
And subclass- Train, Bus, & Taxi.
For all timeduration formula is same and output is depends on input values.

For code, kindly check below github repo –
	https://github.com/jainabhishek0406/JavaInheritanceEx

 



