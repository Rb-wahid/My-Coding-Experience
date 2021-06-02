function handAngle(date) {
  const angleClock = (h, m) => {
    let mAng = m * 6;
    let hAng = h * 30 + m * 0.5;
    let ang = Math.abs(hAng - mAng);

    return Math.min(ang, 360 - ang);
  };
  let h = date.getHours();

  let m = date.getMinutes();

  h = h % 12;

  return (Math.PI / 180) * angleClock(h, m);
}
