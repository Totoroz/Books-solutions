'use strict';


function sum(arr) {
    var output = 0;
    arr.forEach(function (item) {
        output += item;
    });
    return output;
}


console.log(sum([1, 2, 3, 4, 5]));
console.log(sum([5, 20, 30, 4]));
