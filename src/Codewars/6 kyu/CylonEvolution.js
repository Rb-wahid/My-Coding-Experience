class Cylon {
  constructor(model) {
    this.model = model;
  }

  attack() {
    return "Destroy all humans!";
  }
}

class HumanSkin extends Cylon {
  constructor(model) {
    super(model);
  }
  infiltrate() {
    return "Infiltrate the colonies";
  }
}

cylon = new Cylon("raider");
console.log(cylon.attack());
//Test.assertEquals(cylon.attack(), "Destroy all humans!");

caprica = new HumanSkin(6);
console.log(caprica.infiltrate());
console.log(caprica.attack());
//Test.assertEquals(caprica.infiltrate(), "Infiltrate the colonies");
