function lastIndexOf(head, value) {
  let i = 0;
  let lastIdx = -1;

  while (head != null) {
    if (head.data === value) {
      lastIdx = i;
    }
    head = head.next;
    i += 1;
  }
  return lastIdx;
}
