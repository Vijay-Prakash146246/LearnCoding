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
let height=0;
if(height)
{
     console.log('YAY! Height is defined ');
}
else
{
     console.log('Height is Undefined'); //this will execute
}

