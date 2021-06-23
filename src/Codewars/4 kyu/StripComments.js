function solution(input, markers) {
  let split = input.split("\n");
  let result = split
    .map((el) => {
      let sp = el.split(new RegExp(`[${markers.join``}]`, "g"));
      return sp[0].trim();
    })
    .join("\n");
  return result;
}
