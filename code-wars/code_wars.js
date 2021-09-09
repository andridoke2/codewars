/** ============ Awal ============ **/
/**
 * Hello name or World
 * @param {*} name 
 */
function hello(name) {
  if(name){
    let result = name.toLowerCase();
    return 'Hello, ' + result.charAt(0).toUpperCase() + result.slice(1) + '!';
  } else {
    return 'Hello, World!';
  }
}

// const hello = (name) => {
//   name ? `Hello,  ${name.charAt(0).toUpperCase() + name.slice(1).toLowerCase()} !` : `Hello, World!`;
// }

/** Testing */
// console.log(hello('johN'), 'Hello, John!', "returns 'Hello, John!' when given 'johN'")
// console.log(hello('alice'), 'Hello, Alice!', "returns 'Hello, Alice!' when given 'alice'")
// console.log(hello(), 'Hello, World!', "returns 'Hello, World!' when name is not given")
// console.log(hello(''), 'Hello, World!', "returns 'Hello, World!' when name is an empty String" )

/** ============ Akhir ============ **/


/** ============ Awal ============ **/
/**
 * Judul : is he gonna survive
 * Pertanyaan : A hero is on his way to the castle to complete his mission. 
    However, he's been told that the castle is surrounded with a couple of powerful dragons! 
    each dragon takes 2 bullets to be defeated, our hero has no idea how many bullets he 
    should carry.. Assuming he's gonna grab a specific given number 
    of bullets and move forward to fight another specific given number of dragons, will he 
    survive?. Return True if yes, False otherwise :)
 * 
 * @param {*} bullets (jumlah peluru)
 * @param {*} dragons (jumlah naga)
 */
function hero(bullets, dragons){
  // if(bullets / 2 >= dragons){
  //   return true;
  // } else {
  //   return false;
  // }
  return bullets / 2 >= dragons ? true : false;
}

// let hero = (bullets, dragons) => bullets / 2 >= dragons ? true : false;

/** Testing */
// console.log(hero(10, 5), true);
// console.log(hero(7, 4), false);
// console.log(hero(4, 5), false);
// console.log(hero(100, 40), true);
// console.log(hero(1500, 751), false);
// console.log(hero(0, 1), false);

/** ============ Akhir ============ **/


/** ============ Awal ============ **/
/**
 * A wolf in sheep's clothing
 * Wolves have been reintroduced to Great Britain. You are a sheep farmer, 
   and are now plagued by wolves which pretend to be sheep. 
   Fortunately, you are good at spotting them.
   Warn the sheep in front of the wolf that it is about to be eaten. 
   Remember that you are standing at the front of the queue which is at the end of the array:

   [sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      (YOU ARE HERE AT THE FRONT OF THE QUEUE)
      7      6      5      4      3            2      1
 * @param {*} queue (antrian domba)
 */

function warnTheSheep(queue) {
  let animal = addQueue(queue);
  let result = ``;
  let numberOfQueue = animal.length;
  
  for(let i = animal.length; i >= 0; i--){
    if(animal[i] == 'wolf'){
      if(i - 1 == 0){
        result = `Pls go away and stop eating my sheep`;
      } else {
        result = `Oi! Sheep number ${numberOfQueue - 1}! You are about to be eaten by a wolf!`;
      }
    }
    numberOfQueue--;
  }
  
  return result;
}

function addQueue(queue){
  let i = queue.length;
  let result = [];
  
  while(i >= 0){
    result.push(queue[i]);
    i--;
  }

  return result;
}

/** Testing */
// console.log(warnTheSheep(["sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"]), "Oi! Sheep number 2! You are about to be eaten by a wolf!");
// console.log(warnTheSheep(["sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"]), "Oi! Sheep number 5! You are about to be eaten by a wolf!");
// console.log(warnTheSheep(["wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"]), "Oi! Sheep number 6! You are about to be eaten by a wolf!");
// console.log(warnTheSheep(["sheep", "wolf", "sheep"]), "Oi! Sheep number 1! You are about to be eaten by a wolf!");
// console.log(warnTheSheep(["sheep", "sheep", "wolf"]), "Pls go away and stop eating my sheep");

// punya orang dari code wars (adrian.eyre)
function warnTheSheep(queue) {
  const position = queue.reverse().indexOf('wolf');
  return position === 0 ? 'Pls go away and stop eating my sheep' : `Oi! Sheep number ${ position }! You are about to be eaten by a wolf!`;
}
/** ============ Akhir ============ **/

/** ============ Awal ============ **/
/**
 * Judul : My head is at the wrong end!
 * Pertanyaan : You're at the zoo... all the meerkats look weird. Something has gone 
    terribly wrong - someone has gone and switched their heads and tails around!
    Save the animals by switching them back. You will be given an array which will 
    have three values (tail, body, head). It is your job to re-arrange the array so 
    that the animal is the right way round (head, body, tail).
    Same goes for all the other arrays/lists that you will get in the tests: 
    you have to change the element positions with the same exact logics
    Simples!
 * @param {*} arr 
 */
function fixTheMeerkat(arr) {
  let i = arr.length - 1;
  let result = [];

  while(i >= 0){
    result.push(arr[i]);
    i--;
  }

  return result;
}

let usingDoWhile = (arr) => {
  let i = arr.length - 1;
  let result = [];

  do {
    result.push(arr[i]);
    i--;
  } while(i >= 0);

  return result;
}

let usingFor = (arr) => {
  let result = [];

  for(let i = arr.length - 1; i >= 0; i--){
    result.push(arr[i]);
  }

  return result;
}

/** cara-cara lain 

const fixTheMeerkat = ([tail, body, head]) => [head, body, tail];

function fixTheMeerkat(arr) {
  return [arr[2], arr[1], arr[0]];
}

function fixTheMeerkat(arr){
  return arr.reverse();
}

function fixTheMeerkat(arr) {
  let tail = arr[0];
  arr[0] = arr[2];
  arr[2] = tail;
  return arr;
}

*/

// console.log(fixTheMeerkat(["tail", "body", "head"]), ["head", "body", "tail"]);
// console.log(fixTheMeerkat(["tails", "body", "heads"]), ["heads", "body", "tails"]);
// console.log(fixTheMeerkat(["bottom", "middle", "top"]), ["top", "middle", "bottom"]);
// console.log(fixTheMeerkat(["lower legs", "torso", "upper legs"]), ["upper legs", "torso", "lower legs"]);
// console.log(fixTheMeerkat(["ground", "rainbow", "sky"]), ["sky", "rainbow", "ground"]);
/** ============ Akhir ============ **/
