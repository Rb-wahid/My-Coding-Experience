function humanReadable(seconds) {
  // TODO
  const format = (num, str) => {
    num = parseInt(num);

    if (str == "h") {
      num = num > 99 ? 99 : num;
    }

    return num < 10 ? `0${num}` : num;
  };
  let h = seconds / (60 * 60);
  let m = (seconds / 60) % 60;
  let s = seconds % 60;

  return `${format(h, "h")}:${format(m)}:${format(s)}`;
}
console.log(humanReadable(659999));
console.log(humanReadable(34));
