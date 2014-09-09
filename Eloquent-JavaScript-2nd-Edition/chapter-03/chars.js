'use strict';

function countChar(str, needle) {
    var count = 0;
    str.split('').forEach(function (ch) {
        if (ch === needle) {
            count += 1;
        }
    });
    return count;
}

console.log(countChar('Waldo', 'W'));
console.log(countChar('Waldo', 'w'));
console.log(countChar('wallet', 'l'));
