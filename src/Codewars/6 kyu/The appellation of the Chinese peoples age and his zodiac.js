function ageAndZodiac(born, sex) {
  //coding here...
  let age = 2016 - born;
  let zo = born < 2000 ? 12 - ((2000 - born) % 12) : (born - 2000) % 12;
  if (age < 0 || age > 150) return "无效的年份"; //invalid

  let title = (age, sex) => {
    if (age < 2) return sex == "man" ? "襁褓之中" : "襁褓之中";
    else if (age < 4) return sex == "man" ? "孩提之年" : "孩提之年";
    else if (age < 7) return sex == "man" ? "黄口小儿" : "黄口小儿";
    else if (age === 8) return sex == "man" ? "" : "髫年";
    else if (age < 10) return sex == "man" ? "龆年" : "";
    else if (age < 12) return sex == "man" ? "总角之年" : "总角之年";
    else if (age < 13) return sex == "man" ? "" : "金钗之年";
    else if (age < 15) return sex == "man" ? "舞勺之年" : "豆蔻年华";
    else if (age < 16) return sex == "man" ? "舞象之年" : "及笄之年";
    else if (age < 20) return sex == "man" ? "" : "碧玉年华";
    else if (age < 24) return sex == "man" ? "弱冠之年" : "桃李年华";
    else if (age < 30) return sex == "man" ? "" : "花信年华";
    else if (age < 40) return sex == "man" ? "而立之年" : "半老徐娘";
    else if (age < 50) return sex == "man" ? "不惑之年" : "不惑之年";
    else if (age < 60) return sex == "man" ? "知命之年" : "知命之年";
    else if (age < 70) return sex == "man" ? "花甲之年" : "花甲之年";
    else if (age < 80) return sex == "man" ? "古稀之年" : "古稀之年";
    else if (age < 90) return sex == "man" ? "耄耋之年" : "耄耋之年";
    else if (age < 100) return sex == "man" ? "鲐背之年" : "鲐背之年";
    else return sex == "man" ? "期颐之年" : "期颐之年";
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
  return `你正值${title(age, sex)}，生肖属${zodiac[zo]}`;
}

console.log(ageAndZodiac(1996, "man"));
