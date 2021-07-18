function indexOf(head, value) {
  if (head == null) return -1;

  const check = (head) => head.data === value;

  let i = 0;

  while (head.next != null) {
    if (check(head)) {
      return i;
    }
    i++;
    head = head.next;
  }

  if (check(head)) {
    return i;
  }
  return -1;
}
