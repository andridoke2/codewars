/**
 * Belum fix
 * @param {*} x
 * @returns
 */
function apple(x) {
  return power(parseInt(x), parseInt(x)) > 1000
    ? "It's hotter than the sun!!"
    : 'Help yourself to a honeycomb Yorkie for the glovebox.';
}

function power(firstValue, secondValue) {
  let result = 1;
  if (secondValue < 1) {
    result = firstValue * secondValue;
  } else {
    for (let i = 0; i < secondValue; i++) {
      result *= firstValue;
    }
  }
  return result;
}

// console.log(apple('50'));
// console.log(apple(4));
// console.log(apple('6'));
// console.log(apple(90));

/**
 * Write function that checks if a given string (case insensitive) is a palindrome.
 * @param {*} x
 * Palindrome adalah kata atau kalimat yang dibaca dari belakang memiliki makna yang sama
 * Contoh : Kasur ini rusak -> Kasur ini rusak
 */
function isPalindrome(x) {
  let temp = x.split('').reverse().join('');
  // if (temp.toLowerCase() == x.toLowerCase()) {
  //   return true;
  // } else {
  //   return false;
  // }
  return temp.toLowerCase() == x.toLowerCase() ? true : false;
  /**
   * atau
   * return x.split("").reverse().join("").toLowerCase() === x.toLowerCase() ? true : false;
   */
}

/**
 * source : codewars
 * author : anisaAnya, iheb taboui, bruno99, YuriDozhdikov
 * @param {*} x
 * @returns
 */
function isPalindromeFromCodeWars(x) {
  x = x.toLowerCase();
  let a = 0;
  let b = x.length;
  while (a < b) {
    if (x[a] != x[b - 1]) return false;
    a++;
    b--;
  }
  return true;
}

/**
 * source : codewars
 * author : ilyhryh
 * @param {*} line
 * @returns
 */
function isPalindrome(line) {
  line = line.toString().toLowerCase();
  for (var left = 0, right = line.length - 1; left < right; ) {
    if (line.charAt(left++) !== line.charAt(right--)) {
      return false;
    }
  }
  return true;
}

/*
main is palindrome

console.log(isPalindrome('a'));
console.log(isPalindrome('aba'));
console.log(isPalindrome('hello'));
console.log(isPalindrome('Bob'));
console.log(isPalindrome('Abba'));
console.log(isPalindrome('Madam'));
console.log(isPalindrome('AbBa'));
console.log(isPalindrome(''));
*/
