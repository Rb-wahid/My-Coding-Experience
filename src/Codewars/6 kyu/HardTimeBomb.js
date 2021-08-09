var wireCode = Object.keys(global); // Find the wire.
var numVal = wireCode.find((key) => typeof global[key] == "number");
Bomb.CutTheWire(global[numVal]);
