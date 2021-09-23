export function toAlternatingCase(s: string): string {
  let str = [...s]
    .map((ch) => {
      if (/[a-z]/.test(ch)) {
        return ch.toUpperCase();
      } else {
        return ch.toLowerCase();
      }
    })
    .join("")
    .toString();
  return str;
}
