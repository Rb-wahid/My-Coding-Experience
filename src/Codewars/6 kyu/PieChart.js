function pieChart(obj) {
  let json = JSON.parse(obj);
  let sum = Object.values(json).reduce((sum, val) => sum + val, 0);
  const genarator = (x) => {
    res = (Number(x) * 360) / sum;
    return Number.isInteger(res) ? res : Math.floor(res * 100) / 100;
  };

  for (let key in json) {
    json[key] = genarator(json[key]);
  }
  return JSON.stringify(json);
}

console.log(
  pieChart(
    '{"sjbi":91,"5d6ob":69,"uoul":62,"ht5zb":57,"1wbp5":37,"rrw9i":2,"eay1":39}'
  )
);
