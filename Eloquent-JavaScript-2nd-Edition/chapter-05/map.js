'use strict';


var ANCESTRY_FILE = require('./ancestry.js');
var ancestry = JSON.parse(ANCESTRY_FILE);

function map(array, transform) {
    var mapped = [];
    array.forEach(function (item) {
        mapped.push(transform(item));
    });
    return mapped;
}

console.log(map([0, 0, 0, 1, 1, 0], Boolean));
console.log(map(ancestry, function (person) {
    return person.name;
}));
