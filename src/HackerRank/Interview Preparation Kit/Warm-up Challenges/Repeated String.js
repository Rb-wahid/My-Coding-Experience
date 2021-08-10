"use strict";

const fs = require("fs");

process.stdin.resume();
process.stdin.setEncoding("utf-8");

let inputString = "";
let currentLine = 0;

process.stdin.on("data", function (inputStdin) {
  inputString += inputStdin;
});

process.stdin.on("end", function () {
  inputString = inputString.split("\n");

  main();
});

function readLine() {
  return inputString[currentLine++];
}

/*
 * Complete the 'repeatedString' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. LONG_INTEGER n
 */

function repeatedString(s, n) {
  // Write your code here
  let filterLength = (str) => [...str].filter((ch) => ch == "a").length;
  let div = n / s.length;
  let rem = n % s.length;
  let ans = parseInt(div) * filterLength(s);

  s = s.slice(0, rem);
  return ans + filterLength(s);
}

function main() {
  const ws = fs.createWriteStream(process.env.OUTPUT_PATH);

  const s = readLine();

  const n = parseInt(readLine().trim(), 10);

  const result = repeatedString(s, n);

  ws.write(result + "\n");

  ws.end();
}
