function narcissistic(value) {
  // Code me to return true or false
  let valueStr = value.toString();
  let len = valueStr.length;
  return (
    valueStr.split("").reduce((sum, el) => sum + Math.pow(el, len), 0) === value
  );
}

console.log(narcissistic(1652));
