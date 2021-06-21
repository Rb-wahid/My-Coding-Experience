function regexContainsAll(str) {
  return new RegExp(`[${str}]`, 'g');
}