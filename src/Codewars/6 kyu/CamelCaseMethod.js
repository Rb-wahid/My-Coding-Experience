String.prototype.camelCase = function () {
  return this.split(" ")
    .map((s) => s.charAt(0).toUpperCase() + s.substring(1))
    .join("");
};

console.log("say hello ".camelCase());
