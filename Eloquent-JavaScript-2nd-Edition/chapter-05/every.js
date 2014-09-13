'use strict';


function every(array, predicate) {
    var bool = true;
    array.forEach(function (item) {
        if (!predicate(item)) {
            bool = false;
        }
    });
    return bool;
}

console.log(every([NaN, NaN, NaN], Number.isNaN));
console.log(every([NaN, NaN, '4'], Number.isNaN));
