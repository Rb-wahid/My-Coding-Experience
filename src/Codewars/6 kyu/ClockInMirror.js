function WhatIsTheTime(timeInMirror) {
  //"05:25" --> "06:35";
  // Happy Coding
  const setTime = (hour, minute) => {
    if (minute != 00)
      return `${check2Digit(hour - 1 == 0 ? 12 : hour - 1)}:${check2Digit(
        60 - minute
      )}`;
    else {
      return `${check2Digit(hour)}:${check2Digit(minute)}`;
    }
  };
  const check2Digit = (t) => (t.toString().length < 2 ? `0${t}` : t);
  const [hour, minute] = timeInMirror.split(":");
  console.log(hour, minute);

  if (hour == 12 || hour == 6) {
    return hour == 12 ? setTime(12, minute) : setTime(06, minute);
  } else if (hour == 11 || hour == 01) {
    return hour == 11 ? setTime(01, minute) : setTime(11, minute);
  } else if (hour == 10 || hour == 02) {
    return hour == 10 ? setTime(02, minute) : setTime(10, minute);
  } else if (hour == 09 || hour == 03) {
    return hour == 09 ? setTime(03, minute) : setTime(09, minute);
  } else if (hour == 08 || hour == 04) {
    return hour == 08 ? setTime(04, minute) : setTime(08, minute);
  } else if (hour == 07 || hour == 05) {
    return hour == 07 ? setTime(05, minute) : setTime(07, minute);
  }
}

console.log(WhatIsTheTime("04:30"));

