/*
//alert("Hi JavaScript file get Linked ");
//Linking a java script file 
let js = "amazing";
console.log(js);
console.log(40+8+23-10);

//Values and variables 
//We follow camel_case convention generally 
console.log("Vijay");
console.log(23);
let firstName="Vijay";
firstName="Niraj";
console.log(firstName);
console.log(firstName);
console.log(firstName);
//In javascript variable name contain number,letter, $(Doller) and _ underscore
//variable name can't start with number 
//keyword are also not allowed as variable name i.e. new ,function,name
//But name is allowed as a variable name and it ius not recommended


//Variable name convention 
//in java script we follow camel case naming convention 
//we declear variable name whose value is constant in capoital letter 
let name = "Vijay Prakash Singh";
let PI=3.1415;
// let @function=23;//SyntaxError: Unexpected token '='
let $function=67;
// let 5name="Vijay";//SyntaxError: Invalid or unexpected token
// console.log(5name);
console.log($function);
 
let person="Vijay";
let myFirstJob="Technical Consultant";
let myCurrentJob="Software Developer";

let job1="Teacher";
let job2="Developer";
console.log(myFirstJob,myCurrentJob);

*/


//===========================================================
//In java script every value is either object type or 
//primitive type so first here we deal with primitive type
//Data Type : 
//number,string(written in in '' or "")
//undefined : not assign value to variable 
//null : empty value 
//symbol : such value mmust be unique and not changed 
//BigInt : for larger integer value 

//=========================================================
//Type of code comment in java script 
//Single line comment By : //
//multiLine comment By : /* write multi line comment here */

/*
let javascriptIsFun=true;
console.log(typeof true);
console.log(javascriptIsFun);
console.log(typeof javascriptIsFun);
console.log(typeof 23);
console.log(typeof'Vijay');
console.log(typeof"Vijay");

javascriptIsFun='Yes!';
console.log(typeof javascriptIsFun);
let year;
console.log(year); //undefined
console.log(typeof year); //undefined
year=1995;
console.log(typeof year);
console.log(typeof null);//object This is one kind of bug 

*/

//=========================================================
/* 
//Different way to declear variable in javascript
//By let,const and var

//For let kind of variable we can reassign the value of that variable
let age=30;
age=41;
console.log(age);
//For const type local variable we can't reassign the value 
//and also we can't declear empty const variable 
const birthYear=1995;
console.log(birthYear);
//birthYear=1997;
//console.log(birthYear);//TypeError: Assignment to constant variable.
//const job;//Missing initializer in const declaration

//By var : This is the old way to declear variable in java Script
//And we know that let is block scope and var is function scope
// we can reassign the value of var type variable 
var job='programmer';
job="Teacher";
console.log(job);

//In javascript we can declear variable without any data type
name="Binay";
console.log(name);
name=12;
console.log(name);
//But such kind of decleration are not recomended 
//So please ignore such kind of decleration because it's scope is not clear
*/

//================================================================
/*
//Basic Operator in javascript 
//Mathematical operator 
const ageVijay=2037-1991;
const ageGopal=2037-1995;
console.log(ageVijay);
console.log(ageGopal);
 const now =2037;
//This is not allowed in javascript 
 //const ageVijay=now-1991; //it give following error 
 //SyntaxError: Identifier 'ageVijay' has already been declared
 const ageVijay1=now-1991;
 const ageGopal1=now-1995;
 console.log(ageVijay1,ageGopal1);
 console.log(ageGopal*2,ageVijay/10,2**3);
 //** this is known as power operator 2**3=2*2*2
 const firstName="Vijay";
 const lastName="Singh";
 console.log(firstName+lastName);
 console.log(firstName+' '+lastName);
 //Assignment operator 
 let x = 10+5;
 x+=10;
 x*=4;
 x++;
 x--;
 --x;
 console.log(x);

//Comparision operator >,<,>=,<=
console.log(ageVijay1>ageGopal1);
console.log(ageGopal>=18);
const isFullAge=ageGopal1<=19;
console.log(isFullAge);
console.log(now-1991 > now-2018);
y=25-10-5; //precedence left to right
console.log(y);
x=y=25-10-5;
console.log(x+' '+y);
x=y=16; //precedence right to left
console.log(x+' '+y);
const averageAge=(ageGopal1+ageVijay1)/2;
console.log(ageGopal,ageVijay1,averageAge);
*/

//===============================================================
//Coding challenge #1
/*
Mark and John are trying to compare their BMI 
(Body Mass Index), which is calculated using the formula:
 BMI = mass / height ** 2 = mass / (height * height). 
 (mass in kg and height in meter).

1. Store Mark's and John's mass and height in variables
2. Calculate both their BMIs using the formula 
(you can even implement both versions)
3. Create a boolean variable 'markHigherBMI' containing 
information about whether Mark has a higher BMI than John.

TEST DATA 1: Marks weights 78 kg and is 1.69 m tall. 
John weights 92 kg and is 1.95 m tall.
TEST DATA 2: Marks weights 95 kg and is 1.88 m tall. 
John weights 85 kg and is 1.76 m tall.
GOOD LUCK 😀
*/
/*
const massMark=95;
const heightMark=1.88;
const BMIMark=massMark/(heightMark**2);
const massJohn=85;
const heightJohn=1.76;
const BMIJohn=massJohn/(heightJohn*heightJohn);
const markHigherBMI=BMIMark>BMIJohn;
console.log(BMIMark,BMIJohn,markHigherBMI);
*/

//=========================================================
/*
//Strings and Template literals 
const firstName="Vijay Prakash";
const job = "Teacher";
const birthYear=1991;
const year=2037;
const vijayDetails="i'm "+firstName+(year-birthYear)+' Year old '+job+'!';
console.log(vijayDetails); 
//By using string literals 
//so we generally prefered using this method 
const vijayDetails1=`I'm ${firstName}, a ${year-birthYear} year old ${job} !`;
console.log(vijayDetails1);
console.log(`This is just a regular String ......`);
console.log(`This String\n\ writing in multiple \n\ line`);
//Generally we recommended 
console.log(`This is multiple 
line comment 
of string `);
*/

//==========================================================
//Taking decision using if else statement 
/*
const age=15;
if(age>=18)
{
     console.log('Vijay can start driving licence 🚗 ');
}
else
{
     const yearsLeft=18-age;
     console.log(`Vijay is to young. Wait another ${yearsLeft} years :)`)
}

const birthYear=2012;
let century;
if(birthYear<=2000)
{
     century=20;
}
else
{
     century=21;
}
console.log(century);
*/

//==========================================================
//Coding challenge #2
/*
Use the BMI example from Challenge #1, and the code you 
already wrote, and improve it:

1. Print a nice output to the console, 
saying who has the higher BMI. The message can be either 
"Mark's BMI is higher than John's!" or "John's BMI is 
higher than Mark's!"
2. Use a template literal to include the BMI values in the
outputs. Example: "Mark's BMI (28.3) is higher than John's
 (23.9)!"

HINT: Use an if/else statement 😉

GOOD LUCK 😀
*/
/*
const massMark=95;
const heightMark=1.88;
const BMIMark=massMark/(heightMark**2);
const massJohn=85;
const heightJohn=1.76;
const BMIJohn=massJohn/(heightJohn*heightJohn);
const markHigherBMI=BMIMark>BMIJohn;
if(BMIMark>BMIJohn)
{
     console.log(`Mark's BMI (${BMIMark}) is higher then jhon's (${BMIJohn})!`);
}
else
{
     console.log(`Jhon's BMI (${BMIJohn}) is higher then mark's (${BMIMark})!`);
}
*/

//===========================================================================
//Type Conversion(we are doing manually) and Coersion(Java Script doing automatically)
//Type conversion here we are doing manually
/* 
const inputYear='1991';
console.log(inputYear+18);//199118
console.log(Number(inputYear)+5);
console.log(Number('Vijay'));//NaN
console.log(typeof NaN);//number
console.log(String(23)+46);//2346

//Type of Coersion Here javascript convert automatcally
console.log('I am '+23+' Years old');
console.log('23'-'10'-5);
console.log("23"/"2");
let n="1"+1;
n=n-1;
console.log(n);//10
*/ 

//===========================================================
/*
//Truthy and Falsy value
//There are 5 falsy vaue in java Script : 0,"",undefined,null,NAN
console.log(Boolean(0));//false
console.log(Boolean(""));
console.log(Boolean(''));
console.log(Boolean(undefined));
console.log(Boolean(null));
console.log(Boolean("Vijay"));//true
console.log(Boolean({}));//true {} denote empty Objact

const money=100;
if(money)
{
     console.log("Don't spend it all ;)");
}
else
{
     console.log('You should get a job!');
}
let height=10;
if(height)
{
     console.log('YAY! Height is defined ');
}
else
{
     console.log('Height is Undefined'); //this will execute
}
*/

//==================================================================
/*
//Equality operator: ==(it is loose) vs ===(it is strict)
//So strict eqaulity also check data type of variable and it must be same
const age ='18';
if(age===18) console.log('you just become an adult :D(Strict)');
if(age==18) console.log('you just become an adult :D(Loose)');
//Take input from user 
const favourite=Number(prompt("What is your favourite number ?"));
console.log(favourite);
console.log(typeof favourite);//number
if(favourite===23)
{
     console.log('Cool ! 23 is an amazing number!');
}
else if(favourite===7)
{
     console.log("7 is also a cool number ");
}
else if(favourite===9)
{
     console.log("9 is also a cool number");
}
else
{
     console.log("Number is not 23 or 7 or 9");
}
*/
//================================================================
/*
//Logical operator 
//Not operator !==(strict version) and !=(loose version)
//So always prefer to use strict version of
const favourite=Number(prompt("What is your favourite number ?"));
if(favourite!==23)
console.log('Why not 23 ?');
//! NOT operator has higher precedence than AND and OR

const hasDriversLicense=true;
const hasGoodVision=true;
console.log(hasDriversLicense && hasGoodVision);
console.log(hasDriversLicense || hasGoodVision);
console.log(!hasDriversLicense);
if(hasDriversLicense && hasGoodVision)
{
     console.log('Vijay is able to derive!');
}
else
{
     console.log('Someone else should derive....');
}
const isTired=true;
console.log(hasDriversLicense && hasGoodVision && isTired);
if(hasDriversLicense && hasGoodVision && !isTired)
{
     console.log('Gopal is able to derive!');
}
else
{
     console.log('Someone else should derive....');
}
*/

//================================================================

//Coding challenge #3
/*
There are two gymnastics teams, Dolphins and Koalas. 
They compete against each other 3 times. The winner 
with the highest average score wins the a trophy!

1. Calculate the average score for each team, using the 
test data below
2. Compare the team's average scores to determine the 
winner of the competition, and print it to the console. 
Don't forget that there can be a draw, so test for that 
as well (draw means they have the same average score).

3. BONUS 1: Include a requirement for a minimum score 
of 100. With this rule, a team only wins if it has a 
higher score than the other team, and the same time a 
score of at least 100 points. HINT: Use a logical 
operator to test for minimum score, as well as multiple 
else-if blocks 😉
4. BONUS 2: Minimum score also applies to a draw! 
So a draw only happens when both teams have the same 
score and both have a score greater or equal 100 points. 
Otherwise, no team wins the trophy.

TEST DATA: Dolphins score 96, 108 and 89. 
Koalas score 88, 91 and 110
TEST DATA BONUS 1: Dolphins score 97, 112 and 101. 
Koalas score 109, 95 and 123
TEST DATA BONUS 2: Dolphins score 97, 112 and 101. 
Koalas score 109, 95 and 106

GOOD LUCK 😀
*/
/*
const scoreTeam1=(97+112+101)/3;
const scoreTeam2=(109+95+106)/3;
console.log(scoreTeam1,scoreTeam2);

if(scoreTeam1 > scoreTeam2)
{
     console.log('Team_1 win the trophy 🏆');
}
else if(scoreTeam2 > scoreTeam1)
{
     console.log('Team_2 win the trophy 🏆');
}
else if(scoreTeam2 === scoreTeam1)
{
     console.log('🏆 Both win the trophy 🏆');
}
//Bonus 1
const team1Score=(97+112+101)/3;
const team2Score=(109+95+123)/3;
if(team1Score > team2Score && team1Score>=100)
{
     console.log('Team_1 win the trophy 🏆');
}
else if(team2Score > team1Score && team2Score>=100)
{
     console.log('Team_2 win the trophy 🏆');
}
else if(team1Score === team2Score && team1Score>=100 && team2Score>=100)
{
     console.log('🏆 Both win the trophy 🏆');
}
else
{
     console.log('Ohh! Sorry No one win the trophy 😥😥');
}
*/

//=========================================================================
/*
//The Switch statement 
//The Switch statement basically work on strict comparision 
//if we didn't provide the break; then it will 
//print all statement when one condition get true
let day="wednesday";
switch(day)
{
     case "monday" :
          console.log('Plan course structure');
          console.log('Go to coding meetup');
          break;
     case "tuesday" :
          console.log('Prepare theory video');
          break;
     case "wednesday" :
     case "thursday" :
          console.log('Write code Example');
          break;
     case "friday" :
          console.log('Record Video');
          break;
     case "saturday" :
     case "sunday" :
          console.log('Enjoy the weekend!🤹‍♂️');
          break;
     case "default" :
          console.log('Not a valid day!');
}

//Here we are using strict comparision 
day="saturday";
if(day==="monday")
{
     console.log('Plan course structure');
     console.log('Go to coding meetup');
}
else if(day==="tuesday")
{
     console.log('Prepare theory video');
}
else if(day==="wednesday" || day==="thursday")
{
     console.log('Write code Example');
}
else if(day==="friday")
{
     console.log('Record Video');
}
else if(day==="saturday" || day==="sunday")
{
     console.log('Enjoy the weekend!🤹‍♂️');
}
else
{
     console.log('Not a valid day!');
}
*/


//============================================================
/*
//Statement and Expression 
//We know that the expression always produce a value 
3+4;
1991
true && false && !false

//This is a statement 
if(23>12)
{
     const str = '23 is bigger';
}
const me="Vijay Prakash Singh.";
console.log(`I am ${2037-1991} years old ${me}`);
*/

//================================================================
/*
// The Conditional(Ternary)Operator
const age=13;
age>=18?console.log("I like to drink wine 🍷"):console.log("I like to drink water 💧");

//expression 
const drink=age>=18?"Wine 🍷":"Water 💧";
console.log(drink);

let drink2;
if(age>=18)
{
     drink2= "Wine 🍷";
}
else
{
     drink2= "Water 💧";
}
console.log(drink2);
console.log(`I like to drink ${age>=18?"Wine 🍷":"Water 💧"}`);
*/

//==================================================================
//Coding challenge #4
/*
Steven wants to build a very simple tip calculator for 
whenever he goes eating in a resturant. In his country, 
it's usual to tip 15% if the bill value is between 50 
and 300. If the value is different, the tip is 20%.

1. Your task is to caluclate the tip, depending on the 
bill value. Create a variable called 'tip' for this. 
It's not allowed to use an if/else statement 😅 
(If it's easier for you, you can start with an 
if/else statement, and then try to convert it to a 
ternary operator!)
2. Print a string to the console containing the bill 
value, the tip, and the final value (bill + tip). 
Example: 'The bill was 275, the tip was 41.25, and 
the total value 316.25'

TEST DATA: Test for bill values 275, 40 and 430

HINT: To calculate 20% of a value, simply multiply 
it by 20/100 = 0.2
HINT: Value X is between 50 and 300, 
if it's >= 50 && <= 300 😉

GOOD LUCK 😀
*/
const bill=40;
const tip=(bill<=300 && bill>=50)?bill*0.15:bill*0.2;
console.log(`The bill was ${bill}, the tip was ${tip}, and the total value ${bill+tip}`);