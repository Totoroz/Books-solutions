'use strict';


var ANCESTRY_FILE = require('./ancestry.js');
var ancestry = JSON.parse(ANCESTRY_FILE);
var grouped = {};


ancestry.forEach(function (person) {
    grouped[person.name] = person;
});

console.log(grouped['Philibert Haverbeke']);


function reduceByAncestors(person, callback, defaultValue) {
    function valueFor(person) {
        if (!person) {
            return defaultValue;
        }
        return callback(person, valueFor(grouped[person.mother]),
                        valueFor(grouped[person.father]));
    }
    return valueFor(person);
}


function sharedDNA(person, fromMother, fromFather) {
    if (person.name === 'Pauwels van Haverbeke') {
        return 1;
    }
    return (fromMother + fromFather) / 2;
}

var ph = grouped['Philibert Haverbeke'];
console.log(reduceByAncestors(ph, sharedDNA, 0) / 4);


function countAncestors(person, test) {
    return reduceByAncestors(person, function (person, fromMother, fromFather) {
        var thisCounts = test(person);
        return fromMother + fromFather + (thisCounts ? 1 : 0);
    }, 0);
}


function longLivingPercentage(person) {
    var all = countAncestors(person, function (person) {
        return true;
    });
    var longLiving = countAncestors(person, function (person) {
        return (person.died - person.born) >= 70;
    });
    return longLiving / all;
}

console.log(longLivingPercentage(grouped['Emile Haverbeke']));
