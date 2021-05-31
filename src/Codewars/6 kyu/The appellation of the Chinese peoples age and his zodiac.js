function ageAndZodiac(born, sex) {
  //coding here...
  let age = 2016 - born;
  let zo = born < 2000 ? 12 - ((2000 - born) % 12) : (born - 2000) % 12;
  if (age < 0 || age > 150) return "无效的年份"; //invalid

  let title = (age, sex) => {
    let k = "";
    if (age < 2) {
      k = `你${age === 0 ? "正值" : "已逾"}`;
      return `${k}${sex == "man" ? "襁褓之中" : "襁褓之中"}`;
    } else if (age < 4) {
      k = `你${age === 2 ? "正值" : "已逾"}`; //ok
      return `${k}${sex == "man" ? "孩提之年" : "孩提之年"}`;
    } else if (age < 7) {
      k = `你${age === 4 ? "正值" : "已逾"}`; //ok
      return `${k}${sex == "man" ? "黄口小儿" : "黄口小儿"}`;
    } else if (age === 7) {
      k = `你${age === 7 ? "正值" : "已逾"}`; //ok
      return `${k}${sex == "man" ? "" : "髫年"}`;
    } else if (age === 8) {
      k = `你${age === 8 ? "正值" : "已逾"}`; //ok
      return `${k}${sex == "man" ? "龆年" : ""}`;
    } else if (age < 12) {
      k = `你${age === 10 ? "正值" : "已逾"}`; //ok
      return `${k}${sex == "man" ? "总角之年" : "总角之年"}`;
    } else if (age < 13) {
      k = `你${age === 12 ? "正值" : "已逾"}`; //ok
      return `${k}${sex == "man" ? "" : "金钗之年"}`;
    } else if (age < 15) {
      k = `你${age === 13 ? "正值" : "已逾"}`; //ok
      return `${k}${sex == "man" ? "舞勺之年" : "豆蔻年华"}`;
    } else if (age < 16) {
      k = `你${age === 15 ? "正值" : "已逾"}`; //ok
      return `${k}${sex == "man" ? "舞象之年" : "及笄之年"}`;
    } else if (age < 20) {
      k = `你${age === 16 ? "正值" : "已逾"}`; //ok
      return `${k}${sex == "man" ? "" : "碧玉年华"}`;
    } else if (age < 24) {
      k = `你${age === 20 ? "正值" : "已逾"}`; //ok
      return `${k}${sex == "man" ? "弱冠之年" : "桃李年华"}`;
    } else if (age < 30) {
      k = `你${age === 24 ? "正值" : "已逾"}`; //ok
      return `${k}${sex == "man" ? "" : "花信年华"}`;
    } else if (age < 40) {
      k = `你${age === 30 ? "正值" : "已逾"}`; //ok
      return `${k}${sex == "man" ? "而立之年" : "半老徐娘"}`;
    } else if (age < 50) {
      k = `你${age === 40 ? "正值" : "已逾"}`; //ok
      return `${k}${sex == "man" ? "不惑之年" : "不惑之年"}`;
    } else if (age < 60) {
      k = `你${age === 50 ? "正值" : "已逾"}`; //ok
      return `${k}${sex == "man" ? "知命之年" : "知命之年"}`;
    } else if (age < 70) {
      k = `你${age === 60 ? "正值" : "已逾"}`; // ok
      return `${k}${sex == "man" ? "花甲之年" : "花甲之年"}`;
    } else if (age < 80) {
      k = `你${age === 70 ? "正值" : "已逾"}`; //ok
      return `${k}${sex == "man" ? "古稀之年" : "古稀之年"}`;
    } else if (age < 90) {
      k = `你${age === 80 ? "正值" : "已逾"}`; //ok
      return `${k}${sex == "man" ? "耄耋之年" : "耄耋之年"}`;
    } else if (age < 100) {
      k = `你${age === 90 ? "正值" : "已逾"}`; //ok
      return `${k}${sex == "man" ? "鲐背之年" : "鲐背之年"}`;
    } else {
      k = `你${age === 100 ? "正值" : "已逾"}`; //ok
      console.log(k);
      return `${k}${sex == "man" ? "期颐之年" : "期颐之年"}`;
    }
  };
  let zodiac = [
    "龙",
    "蛇",
    "马",
    "羊",
    "猴",
    "鸡",
    "狗",
    "猪",
    "鼠",
    "牛",
    "虎",
    "兔",
  ];
  console.log(title(age, sex), age);
  return `${title(age, sex)}，生肖属${zodiac[zo]}`;
}

console.log(ageAndZodiac(1913, "women"));
