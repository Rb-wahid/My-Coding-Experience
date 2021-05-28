var moment = require("moment");

function getDate(uts, loc) {
  // Your code here
  return moment(uts * 1000).format(formats[loc].toUpperCase());
}

console.log(getDate(1481020142, "en-GB"));
