'use strict';


var ANCESTRY_FILE = require('./ancestry.js');
var ancestry = JSON.parse(ANCESTRY_FILE);

var theSet = ['Carel Haverbeke', 'Maria van Brussel',
              'Donald Duck'];
function isInSet(set, person) {
  return set.indexOf(person.name) > -1;
}

console.log(ancestry.filter(function(person) {
  return isInSet(theSet, person);
}));

console.log(ancestry.filter(isInSet.bind(null, theSet)));
