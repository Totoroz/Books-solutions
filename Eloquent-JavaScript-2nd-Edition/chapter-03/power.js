'use strict';

function power(base, exponent) {
    exponent = exponent || 2;
    var result = 1;
    for (var i = 0; i < exponent; i++) {
        result *= base;
    }
    return result;
}

console.log(power(4));
console.log(power(4, 3));
