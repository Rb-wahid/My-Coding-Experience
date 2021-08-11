function Cylon(model) {
  this.model = model;
}

Cylon.prototype.attack = function () {
  return "Destroy all humans!";
};

function HumanSkin(model) {
  this.model = model;
}

HumanSkin.prototype = Object.create(Cylon.prototype);
HumanSkin.prototype.constructor = HumanSkin;

HumanSkin.prototype.infiltrate = function () {
  return "Infiltrate the colonies";
};

cylon = new Cylon("raider");
console.log(cylon.attack());
//Test.assertEquals(cylon.attack(), "Destroy all humans!");

caprica = new HumanSkin(6);
console.log(caprica.infiltrate());
console.log(caprica.attack());
//Test.assertEquals(caprica.infiltrate(), "Infiltrate the colonies");
