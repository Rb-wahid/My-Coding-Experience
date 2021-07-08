function speedListen(audioLength, playSpeed) {
  //
  const op = (digit) =>
    String(digit).length >= 2 ? digit : String(digit).padStart(2, "0");
  let [h, m, s] = audioLength.split(":").map((el) => Number(el));

  s += h * 3600;
  s += m * 60;
  s = s / playSpeed;
  s = parseInt(s);
  h = m = 0;
  if (3600 <= s) {
    h = parseInt(s / 3600);
    s = s % 3600;
  }
  if (60 <= s) {
    m = parseInt(s / 60);
    s = s % 60;
  }

  let newAudioLength = `${op(h)}:${op(m)}:${op(s)}`;

  return newAudioLength;
}

console.log(speedListen("00:30:00", 2));
