'use strict';


function arrayToList(array) {
    var list = null;
    for (var i = array.length - 1; i >= 0; i--) {
        list = {'value': array[i], 'rest': list};
    }
    return list;
}

function listToArray(list) {
    var array = [];
    for (var node = list; node; node = node.rest) {
        array.push(node.value);
    }
    return array;
}

function prepend(value, list) {
    return {'value': value, 'rest': list};
}

function nth(list, n) {
    var i = 0;
    var output;
    while (i <= n) {
        for (var key in list) {
            if (list.hasOwnProperty(key)) {
                if (key === 'rest') {
                    console.log(list[key]);
                }
            }
        }
        i += 1;
    }
    return output || null;
}

function nth(list, n) {
    if (n === 0) {
        return list.value;
    }
    return nth(list.rest, n - 1);
}

console.log(arrayToList([10, 20]));
console.log(listToArray(arrayToList([10, 20, 30])));
console.log(prepend(10, prepend(20, null)));
console.log(nth(arrayToList([10, 20, 30]), 1));
