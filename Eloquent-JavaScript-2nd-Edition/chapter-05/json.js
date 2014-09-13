'use strict';

var string = JSON.stringify({name: 'X', born: 1980});
console.log(string);
var obj = JSON.parse(string);
console.log(obj.born);
