'use strict';


var ANCESTRY_FILE = require('./ancestry.js');
var ancestry = JSON.parse(ANCESTRY_FILE);

function average(array) {
    return array.reduce(function (previous, current) {
        return previous + current;
    }, 0) / array.length;
}


function groupBy(array, callback) {
    var groups = {};
    array.forEach(function (item) {
        var group = callback(item);
        if (group in groups) {
            groups[group].push(item);
        } else {
            groups[group] = [item];
        }
    });
    return groups;
}


var byCentury = groupBy(ancestry, function (person) {
    return Math.ceil(person.died / 100);
});

for (var century in byCentury) {
    var ages = byCentury[century].map(function (person) {
        return person.died - person.born;
    });
    console.log(century + ' - average -  ' + average(ages));
}
