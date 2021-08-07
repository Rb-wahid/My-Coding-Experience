function lastSurvivors(string) {
  const isNotDuplicat = (arr) => new Set(arr).size == arr.length;
  const getAlpha = (ancii) => (ancii + 1 > 122 ? 97 : ancii + 1);
  let str = [...string].sort();
  while (!isNotDuplicat(str)) {
    for (let idx = 0; idx < str.length - 1; idx += 1) {
      if (str[idx] == str[idx + 1]) {
        let charCode = str[idx].charCodeAt();
        str.splice(idx, 1);
        str[idx] = String.fromCharCode(getAlpha(charCode));
        break;
      }
    }

    str = str.sort();
  }
  return str.join("");
}

console.log(
  lastSurvivors(
    "xsdlafqpcmjytoikojsecamgdkehrqqgfknlhoudqygkbxftivfbpxhxtqgpkvsrfflpgrlhkbfnyftwkdebwfidmpauoteahyh"
  )
);
