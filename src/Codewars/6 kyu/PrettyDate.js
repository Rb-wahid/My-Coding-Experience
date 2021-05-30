function toPretty(seconds) {
  //...
  let ans = seconds;
  if (seconds >= 604800) {
    ans = parseInt(seconds / 604800);
    return `${ans == 1 ? "a week" : ans + " weeks"} ago`;
  } else if (seconds >= 86400) {
    ans = parseInt(seconds / 86400);
    return `${ans == 1 ? "a day" : ans + " days"} ago`;
  } else if (seconds >= 3600) {
    ans = parseInt(seconds / 3600);
    return `${ans == 1 ? "an hour" : ans + " hours"} ago`;
  } else if (seconds >= 60) {
    ans = parseInt(seconds / 60);
    return `${ans == 1 ? "a minute" : ans + " minutes"} ago`;
  } else if (seconds >= 1) {
    return `${ans == 1 ? "a second" : ans + " seconds"} ago`;
  } else return "just now";
}

console.log(toPretty(90));
