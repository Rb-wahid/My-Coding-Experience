function pieChart(obj) {
  obj = obj.split(",");

  const genarator = (x) => {
    res = (Number(x) * 360) / sum;
    return Number.isInteger(res) ? res : Math.floor(res * 100) / 100;
  };
  let json = {};
  let sum = 0;
  for (let str of obj) {
    let [key, value] = str.replace(/[\{\}\"\'\s]/g, "").split(/:/);
    sum += Number(value);
    json[key] = value;
  }

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
