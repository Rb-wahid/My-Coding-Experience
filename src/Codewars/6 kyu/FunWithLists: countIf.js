function countIf(head, p) {
  let i = 0;
  while (head != null) {
    if (p(head.data)) {
      i += 1;
    }
    head = head.next;
  }

  return i;
}
