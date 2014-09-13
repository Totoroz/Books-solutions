'use strict';

function greaterThan(n) {
    return function(m) {
        return m > n;
    };
}

var greaterThan10 = greaterThan(10);
console.log(greaterThan10(11));


function noisy(f) {
    return function (arg) {
        console.log('calling with', arg);
        var val = f(arg);
        console.log('called with', arg, '- got', val);
        return val;
    };
}

noisy(Boolean)(1);


function unless(condition, then) {
    if (!condition) {
        then();
    }
}


function repeat(times, body) {
    for (var i = 0; i < times; i++) {
        body(i);
    }
}


repeat(3, function (n) {
    unless(n % 2, function () {
        console.log(n, 'is even');
    });
});
