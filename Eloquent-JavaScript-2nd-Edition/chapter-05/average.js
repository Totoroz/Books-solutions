'use strict';


var ANCESTRY_FILE = require('./ancestry.js');
var ancestry = JSON.parse(ANCESTRY_FILE);


function average(array) {
    return array.reduce(function (a, b) {
        return a + b;
    }) / array.length;
}

console.log(average([5, 4, 3, 2, 1]));


function male(person) {
    return person.sex === 'm';
}


function female(person) {
    return person.sex === 'f';
}


function age(person) {
    return person.died - person.born;
}

console.log(average(ancestry.filter(female).map(age)));
