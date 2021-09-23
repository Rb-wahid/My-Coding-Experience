export function toAlternatingCase(s: string): string {
  return [...s]
    .map((ch: string) => {
      return ch === ch.toUpperCase() ? ch.toLowerCase() : ch.toUpperCase();
    })
    .join("");
}
