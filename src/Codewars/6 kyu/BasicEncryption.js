function encrypt(text, rule) {
  return text.replace(/./g, (el) =>
    String.fromCharCode((el.charCodeAt() + rule) % 256)
  );
}

console.log(encrypt("please encrypt me", 2));
