function length(head) {
  if (head == null) return 0;
  return 1 + length(head.next);
}

console.log(length(null));
