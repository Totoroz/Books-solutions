'use strict';

function isEven(number) {
    if (number === 0) {
        return true;
    } else if (number === 1) {
        return false;
    }
    return number < 0 ? isEven(-number) : isEven(number - 2);
}

console.log(isEven(50));
console.log(isEven(75));
console.log(isEven(-1));
console.log(isEven(0));
