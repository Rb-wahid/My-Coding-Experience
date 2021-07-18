function length(head) {
  if (head == null) return 0;
  let i = 1;
  while (head.next !== null) {
    i++;
    head = head.next;
  }
  return i;
}

console.log(length(null));
