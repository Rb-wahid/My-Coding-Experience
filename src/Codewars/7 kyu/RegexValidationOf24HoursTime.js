function validateTime(time) {
  res = /^((2[0-3]|[01][\d])|[\d]):[0-5][\d]$/g.test(time);
  return res;
}
