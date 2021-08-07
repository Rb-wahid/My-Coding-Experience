function lastSurvivors(string) {
  let regex = /(.)(.*?)\1/;
  const isDuplicat = (str) => regex.test(str);
  const getChar = (ch) =>
    String.fromCharCode(ch.charCodeAt(0) + 1).replace("{", "a");
  let str = string;
  while (isDuplicat(str)) {
    str = str.replace(regex, (_, repeat, rest) => getChar(repeat) + rest);
  }
  return str;
}

console.log(
  lastSurvivors(
    "xsdlafqpcmjytoikojsecamgdkehrqqgfknlhoudqygkbxftivfbpxhxtqgpkvsrfflpgrlhkbfnyftwkdebwfidmpauoteahyh"
  )
);
