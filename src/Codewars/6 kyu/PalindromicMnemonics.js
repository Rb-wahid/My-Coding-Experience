function palindromicMnemonic(objArray) {
  //Good luck!
  console.log(objArray);
  const firstKey = (obj) => {
    let str = "";
    for (const key in obj) {
      str += key.toString().charAt(0);
    }
    return str.toLowerCase();
  };

  const firstValue = (obj) => {
    let str = "";
    for (const key in obj) {
      str += obj[key].toString().charAt(0);
    }
    return str.toLowerCase();
  };

    const isPalim = (str) => {
        str = str.split``;
        console.log(str);
        let i = 0;
        let len = str.length;
        let j = len - 1;
        if (!(len & 1))
            return false;
        
    for (i, j; i <= len / 2 && j <= len / 2; i++, j++) {
      console.log(str[i] !== str[j], str[i], str[j]);
      if (str[i] !== str[j]) return false;
    }
    return true;
  };

  let ans = [];
  for (const obj of objArray) {
    let key = firstKey(obj);
    let value = firstValue(obj);
    let isKeyPalim = key.length > 2 ? isPalim(key) : false;
    //  let isValuePalim = value.length > 2 ? isPalim(obj) : false;
    //console.log(isKeyPalim);
    if (isKeyPalim) {
      if (key === value) {
        ans.push("Palindromic Mnemonic!");
      } else {
        ans.push("Palindromic");
      }
    } else if (key === value) {
      ans.push("Mnemonic");
    } else {
      ans.push("Objectively objective object");
    }
  }
  return ans.join`\n`;
}

var object1 = { Aardvark: "arigatou", 13: "100" }; //"A1" vs "a1"
var object2 = { Korean: "BBQ", is: "TASTY" }; //"Ki" vs "BT"
var object3 = { Harry: "has", often: "over", heated: "HATS" }; //"Hoh" vs "hoH"
var objArray = [object1, object2, object3];

console.log(
  palindromicMnemonic([{ 1: 2, Korean: "BBQ", is: "TASTY", true: false }])
);
