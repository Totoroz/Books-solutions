'use strict';


for (var i = 0; i < 101; i++) {
    var str = '';
    if (i % 3 === 0) {
        str += 'Fizz';
    }
    if (i % 5 === 0) {
        str += 'Buzz';
    }
    console.log(str || i);
}
