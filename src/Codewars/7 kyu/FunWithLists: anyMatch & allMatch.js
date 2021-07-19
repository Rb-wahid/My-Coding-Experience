function anyMatch(head, p) {
  while (head != null) {
    if (p(head.data)) {
      return true;
    }
    head = head.next;
  }
  return false;
}

function allMatch(head, p) {
  while (head != null) {
    if (!p(head.data)) {
      return false;
    }
    head = head.next;
  }
  return true;
}
