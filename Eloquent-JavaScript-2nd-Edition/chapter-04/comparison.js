'use strict';


function deepEqual(a, b) {
    if (a === b) {
        return true;
    } else if (a === null || typeof a !== 'object'
              || b === null || typeof b !== 'object') {
                  return false;
    }

    var aProperties = 0;
    var bProperties = 0;

    for (var key in a) {
        if (a.hasOwnProperty(key)) {
            aProperties += 1;
        }
    }

    for (var key in b) {
        if (b.hasOwnProperty(key)) {
            bProperties += 1;
            if (!(key in a) || !deepEqual(a[key], b[key])) {
                return false;
            }
        }
    }
    return aProperties === bProperties;
}


var obj = {'here': {'is': 'an'}, 'object': 2};
console.log(deepEqual(obj, obj));
// → true
console.log(deepEqual(obj, {'here': 1, 'object': 2}));
// → false
console.log(deepEqual(obj, {'here': {'is': 'an'}, 'object': 2}));
// → true
