function convertFuncToArrow(string) {
  // Code here
  let funcName = string.match(/.+\b(.+)\b\(/)[1];
  let arg = string.match(/.+\b(.+)\b\)/)[1];
  let body = string.match(/.+ return \b(.+)/)[1];

  return `const ${funcName} = ${arg} => ${body}`;
}

console.log(convertFuncToArrow("function func(a) {\n    return a * 1;\n}"));
//"const func = a => a * 1;"
