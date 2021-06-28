function redarr(arr) {
  // your code

  return { ...[...new Set(arr)].sort() };
}
