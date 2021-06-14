function decode(number) {
  //your code here
  number = number.replace(/[01]+/g, (el) =>
    el.length === 4 ? parseInt(el, 2) : el
  );
  let rst = "";
  let split = number.split("98");
  for (const el of split) {
    console.log(el);

    console.log(el, /[01]$/g.test(el));
    if (/[01]$/g.test(el)) rst += parseInt(el, 2) || el;
    else {
      let arr = el.match(/\d{3}/g);
      if (arr) {
        rst += arr.map((el) => String.fromCharCode(el - 4)).join``;
      } else {
        rst += el;
      }
    }

    rst += ", ";
  }
  return rst.substring(0, rst.length - 2);
}

console.log(
  decode("119112105105116981000981091199810019810612111498100000110001")
);
