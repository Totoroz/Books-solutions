'use strict';

function fac(n) {
    if (n === 0) {
        return 1;
    }
    return fac(n - 1) * n;
}

console.log(fac(81));
