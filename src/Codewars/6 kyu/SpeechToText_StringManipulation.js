var bot = {
  message: function (msg) {
    if (/Add/.test(msg)) {
      let digit = msg.replace(/\D+/g, " ");
      return digit.split(" ").reduce((sum, digit) => sum + Number(digit), 0);
    } else if (/Subtract/.test(msg)) {
      let digit = msg.replace(/\D+/g, " ");
      return digit
        .split(" ")
        .reverse()
        .reduce((sub, digit) => -sub + Number(digit), 0);
    } else if (/weather/.test(msg)) {
      let day = msg.match(/(am|pm)/)[0];
      let [h] = msg.replace(/\D+/g, " ").trim().split(" ");
      if (h >= 6 && h < 12) {
        return day == "am" ? "sunny" : "raining";
      } else if (h <= 12 && h < 6) {
        return day == "pm" ? "sunny" : "raining";
      }
    }
  },
};

console.log(bot.message("What is the weather at 4:30am?"));
