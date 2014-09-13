'use strict';


var ANCESTRY_FILE = require('./ancestry.js');
var ancestry = JSON.parse(ANCESTRY_FILE);

function reduce(array, combine, start) {
    start = start || 0;
    var current = start;
    array.forEach(function (item) {
        current = combine(current, item);
    });
    return current;
}

console.log(reduce([1, 2, 3, 4], function (a, b) {
    return a - b;
}));


console.log(ancestry.reduce(function (min, current) {
    if (current.born < min.born) {
        return current;
    }
    return min;
}));
