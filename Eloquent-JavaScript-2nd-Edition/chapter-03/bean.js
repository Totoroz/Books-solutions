'use strict';

function countBeans(str) {
    var count = 0;
    str.split('').forEach(function (char) {
        if (char === 'B') {
            count += 1;
        }
    });
    return count;
}


console.log(countBeans('BBC'));
console.log(countBeans('Big Booty Bitches'));
