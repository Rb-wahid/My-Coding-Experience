function isValidIP(str) {
  return (
    str.split(".").filter((v) => v === Number(v).toString() && Number(v) < 256)
      .length === 4
  );
}

let str = "123.045.067.089";

console.log(isValidIP(str));
