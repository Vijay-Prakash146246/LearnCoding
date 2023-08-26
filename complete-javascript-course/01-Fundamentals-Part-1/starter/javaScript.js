//alert("Hello Bunny");

//linking java script file 
let js = "Hello Buddy i am java script";
console.log(js);
console.log(99+1-2);

// Value of variable 
let firstName = "Vijay";
let middleName = "prakash"
let lastName = "Singh";
console.log(firstName+"\t"+middleName+"\t"+lastName);

//variable name convention 
let name = "Vijay Prakash Singh";
let $function = 65;
console.log($function);
let person = "Vijay";
let pi = 3.14;
let job1 = "developer";
let job2 = "Teacher";
console.log(name+person+pi+job1+job2);

//dataTypes
console.log("\n dataTypes \n");
let fun = true;
console.log(fun);
console.log(typeof fun);
let num =10;
console.log(typeof num);
let num1=123.5;
console.log(typeof num1);
let name1="Vijay Prakash";
console.log(typeof(name1));
let year;
console.log(year);
console.log(typeof(year));
year = 1991;
console.log(typeof(year));
console.log(typeof(null));
let data;
console.log(typeof(Date));

//Basic Operator
console.log("\n Basic mathematics operator \n");
const x = 2023;
 const Vijay = x-1995;
 const rajnish = x-2001;
 console.log(x)
 console.log(Vijay)
 console.log(rajnish);
 console.log(x,Vijay,rajnish);
 console.log(3**4);
 const name2 = "Vijay";
 const address = "Nawada,Bihar";
 console.log(name2+" "+address);
  let x1 = 12+5;
  x1+=17;
  x1*=10;
  x1++;
  x1--;
  console.log(x1);
//comparision operator 
console.log(Vijay>rajnish);
console.log(Vijay>=35);

//operator precedence 
let z1,z2;
z1=z2=25-10-5;
console.log(z1,z2);
const avg = (rajnish+Vijay)/2;
console.log(rajnish,Vijay,avg);


// Coding Challenge #1

/*
Mark and John are trying to compare their BMI
(Body Mass Index), which is calculated using 
the formula: BMI = mass / height ** 2 = 
mass / (height * height).
(mass in kg and height in meter).

1. Store Mark's and John's mass and 
height in variables
2. Calculate both their BMIs 
using the formula (you can even implement 
both versions)
3. Create a boolean 
variable 'markHigherBMI' 
containing information about whether Mark 
has a higher BMI than John.

TEST DATA 1: Marks weights 78 kg 
and is 1.69 m tall. John weights 92 kg 
and is 1.95 m tall.
TEST DATA 2: Marks weights 95 kg and is 1.88
 m tall. John weights 85 kg and is 1.76 m tall.

GOOD LUCK 😀
*/
let mark_H = 1.69;
let mark_W = 78;
let BMI_M = mark_W/(mark_H**2);
let john_H = 1.95;
let jhon_W = 92;
let BMI_J = jhon_W/(john_H**2);
let markHigherBMI = (BMI_M>BMI_J);
if(markHigherBMI)
console.log("Mark has higher BMI than Jhon "+BMI_M);
else
console.log("Mark has lower BMI than Jhon "+BMI_M);

// Strings and Template Literals
console.log("AutoSave");


