var nextFiveDays = function (date) {
  dates = [];

  for (var i = 0; i < 5; i++) {
    date.setDate(date.getDate() + 1);
    console.log(date);
    dates.push(
      date.getMonth() + 1 + "/" + date.getDate() + "/" + date.getFullYear()
    );
  }

  return dates.join(", ");
};
