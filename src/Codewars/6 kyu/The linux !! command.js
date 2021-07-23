function bangBang(history) {
  let sp = history.split(/\d/g);
  console.log(sp);
  return sp[sp.length - 1].trim();
}
