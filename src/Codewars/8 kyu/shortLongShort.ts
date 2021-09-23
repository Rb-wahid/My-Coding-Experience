export function shortLongShort(a: string, b: string): string {
  // your code here
  let short: string;
  let long: string;

  if (a.length <= b.length) {
    short = a;
    long = b;
  } else {
    short = b;
    long = a;
  }

  return short + long + short;
}
