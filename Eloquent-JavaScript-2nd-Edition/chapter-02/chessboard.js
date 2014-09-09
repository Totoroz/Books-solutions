'use strict';


var board = '';
for (var i = 0; i < 8; i++) {
    for (var j = 0; j < 8; j++) {
        if ((i + j) % 2 === 0) {
            board += '#';
        } else {
            board += ' ';
        }
    }
    board += '\n';
}

console.log(board);
