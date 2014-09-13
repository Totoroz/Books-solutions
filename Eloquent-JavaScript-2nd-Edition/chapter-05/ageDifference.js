'use strict';


var ANCESTRY_FILE = require('./ancestry.js');
var ancestry = JSON.parse(ANCESTRY_FILE);

function average(array) {
    return array.reduce(function (previous, current) {
        return previous + current;
    }, 0) / array.length;
}

var byName = {};
ancestry.forEach(function(person) {
  byName[person.name] = person;
});

var differences = ancestry.filter(function (person) {
    return typeof byName[person.mother] !== 'undefined';
}).map(function (person) {
    return person.born - byName[person.mother].born;
});

console.log(differences);
console.log(average(differences));
