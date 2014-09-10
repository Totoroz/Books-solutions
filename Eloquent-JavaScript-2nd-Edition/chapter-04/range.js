'use strict';


function range(start, end, step) {
    step = step || 1;
    var arr = [];
    if (step > 0) {
        while (start <= end) {
            arr.push(start);
            start += step;
        }
    } else {
        while (start >= end) {
            arr.push(start);
            start += step;
        }
    }
    return arr;
}

console.log(range(1, 10));
console.log(range(1, 12, 2));
console.log(range(5, -10, -5));
