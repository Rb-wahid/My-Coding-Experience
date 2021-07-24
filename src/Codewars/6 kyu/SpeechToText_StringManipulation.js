var bot = {
  message: function (msg) {
    let h, m, a;
    [_, h, m] = msg.match(/Add (\d+) to (\d+)/) || [];

    if (h && m) {
      return Number(h) + Number(m);
    }

    [_, h, m] = msg.match(/Subtract (\d+) from (\d+)/) || [];
    if (h && m) {
      return Number(m) - Number(h);
    }

    [_, h, m, c] = msg.match(/What is the weather at (\d+):(\d+)(am|pm)/) || [];
    h = Number(h) + Number(m) / 60;
    if (c == "pm") {
      h += 12;
    }
    return h >= 6 && h <= 18 ? "sunny" : "raining";
  },
};

console.log(bot.message("What is the weather at 4:30am?"));
