const oparation = (digit) => (op) => (op ? op(digit) : digit);

const zero = oparation(0);
const one = oparation(1);
const two = oparation(2);
const three = oparation(3);
const four = oparation(4);
const five = oparation(5);
const six = oparation(6);
const seven = oparation(7);
const eight = oparation(8);
const nine = oparation();

const plus = (right) => (left) => left + right;
const minus = (right) => (left) => left - right;
const times = (right) => (left) => left * right;
const dividedBy = (right) => (left) => parseInt(left / right);

console.log(seven(times(5)));