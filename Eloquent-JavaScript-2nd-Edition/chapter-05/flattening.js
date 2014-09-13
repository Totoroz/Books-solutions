'use strict';


function flatten(arrays) {
    return arrays.reduce(function (previous, current) {
        return previous.concat(current);
    }, []);
}

var arrays = [[1, 2, 3], [4, 5], [6]];
console.log(flatten(arrays));
