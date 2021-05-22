function WhatIsTheTime(timeInMirror) {
  let [hour, minute] = timeInMirror.split`:`.map((el) => +el);

  hour = (minute ? 11 : 12) - (hour % 12) || 12;
  minute = (60 - minute) % 60;

  return [hour, minute].map((el) => (el > 9 ? el : `0${el}`)).join`:`;
}

console.log(WhatIsTheTime("04:30"));
