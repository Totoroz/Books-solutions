'use strict';


var journal = [];

function addEntry(events, hasTurned) {
    journal.push({
        events: events,
        squirrel: hasTurned
    });
}

addEntry(['work', 'touched tree', 'pizza', 'running', 'television'], false);
addEntry(['work', 'ice cream', 'cauliflower', 'lasagna', 'touched tree',
        'brushed teeth'], false);
addEntry(['weekend', 'cycling', 'break', 'peanuts', 'beer'], true);
