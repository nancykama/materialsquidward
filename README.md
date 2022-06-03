# **Material Gworl Squidward!**
#### ***Objective: Help Squiddy collect his Krabby Patties and slay while evading Emo Gworl Patrick, Spongebob Roundpants, and Jellyfish!***


## **Project Intro:**
In Quarter 4, we were assigned to create a game encompassing all the JAVA concepts we have learned throughout the year like `for loops`, `while loops`, `if statements`, writing classes, `arrays`, `ArrayLists`, `inheritance`, `recursion`, and sorting methods like `Bubble Sort`, `Selection Sort`, and `Insertion Sort`. 

## **Game Overview:**
For this game, we wanted to do a fun spinoff on Mario Bros, collabing with Spongebob characters. The goal is to increase the score  by ***evading obstacles*** and ***collecting coins*** to get more points. We all know Handsome Squidward is an icon and the moment but can you match his slay levels and win the game?

![Game GIF recording](https://github.com/nancykama/materialsquidward/blob/master/Yassifyed%20Mario%20Bros/src/imgs/ezgif.com-gif-maker%20(1).gif)

## **Meet the Characters:**
![squiddy](https://github.com/nancykama/materialsquidward/blob/master/Yassifyed%20Mario%20Bros/src/imgs/squiddy_225x225.png)
![jellyfish](https://github.com/nancykama/materialsquidward/blob/master/Yassifyed%20Mario%20Bros/src/imgs/jelly-removebg-preview_1_125x120.png)
![patrick](https://github.com/nancykama/materialsquidward/blob/master/Yassifyed%20Mario%20Bros/src/imgs/emogworlpatty_150x150.png)
![spongy](https://github.com/nancykama/materialsquidward/blob/master/Yassifyed%20Mario%20Bros/src/imgs/fully_yassified_spongy_2_200x140.png)
![krabbypatty](https://github.com/nancykama/materialsquidward/blob/master/Yassifyed%20Mario%20Bros/src/imgs/material_patty-removebg-preview_2_90x90.png)

## **Specific Elements of Code**
Here are some of the things we had to include to show stuff we learned in `JAVA`
- Inheritance 
  ```
  public class Spongebob extends Patrick {
	//add location attributes
		private int x2 , y2; 
		//position  
		private Image img;
		private AffineTransform tx;

		public Spongebob (int x, int y) {
			super(x, y);
			img = getImage("/imgs/fully yassified spongy.png"); //load the image 
			//use your variables
		}
  ```
- 2D Array Implementation
  - Initialization
    ```
    Color scoreColors[][] = {{Color.RED, Color.ORANGE}, {Color.YELLOW, Color.GREEN}, {Color.BLUE, Color.MAGENTA}, {Color.LIGHT_GRAY, Color.PINK}};
    ```
  - Switching Colors Through Array Traversal
    ```
    scoreColor = scoreColors[rnd.nextInt(scoreColors.length)][rnd.nextInt(scoreColors[0].length)];
    ```
- Randomization
  ```
     int x0 = (int)(Math.random() * 601) + 100;
     int x01 = (int)(Math.random() * 601) + 100;
	 int x02 = (int)(Math.random() * 601) + 100;
	 int x03 = (int)(Math.random() * 601) + 100;
  ```
  ```
          coin.x3 = rnd.nextInt(700 - 10 + 1) + 10;
		coinn.x3 = rnd.nextInt(700 - 10 + 1) + 10;
  ```
These were just some of the specifics we had to include, because we learned these concepts after Term 1, so we had to show that we were able to apply them. 

## **Game Design:**
![game](https://github.com/nancykama/materialsquidward/blob/master/other%20imgs/game1.PNG)
![endscreen](https://github.com/nancykama/materialsquidward/blob/master/ezgif.com-gif-maker.gif)

## **Trello** 
In this project, we didn't just focus on coding. We also worked on or project organization and time management skills. Our favorite teacher Mr. DomDavid introduced us to Trello, the best organizational platform. It was super helpful to assign people and due dates to different tasks. There was also a lot of aesthetic options liek labels and color coding to make our Trello Board more slay. I <3 Trello. 
![trello](https://github.com/nancykama/materialsquidward/blob/master/tello.PNG)

## **What We Learned:**
As we have been working on this project for the whole quarter, we learned a lot. We learned how to apply the skills we were taught (shoutout Mr.David) throughout CSA towards projects we see in real life rather than ***AP FRQs and MCQs***. We also learned how to incorporate `file reading` and `switch case` statements into our code. The biggest concepts we got to put to motion were `Inheritance` and `2D arrays` with nested loops. With the AP exam rapidly approaching, we only got to use these functions in accordance with exam practice, so applying them in the game was our first time learning how we can recognize these concepts at work in other well known projects and games. 

## **Final Thoughts:**
It was really fun to work on this game together with my friends. From choosing the theme and designing the characters to actually going through the coding process, it was definitely a cool way to compile everything we learned and showcase it.
