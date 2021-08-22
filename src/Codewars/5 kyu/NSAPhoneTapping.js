let obj = {};
// [CALLER] called/texted [CALLEE] from [PHONE OWNER]'s phone([PHONE NUMBER])
// Dan called Erin from Dan's phone(202-555-0149)
// Create the NSA object
var NSA = {
  log: function (person) {
    let ans = obj[person.name] || "No Entries";
    delete obj[person.name];
    return Array.isArray(ans) ? ans.join("\n") : ans;
  },
};

// Create the Person constructor
class Person {
  constructor(name) {
    this.name = name;
  }
  call(cellphone, callee) {
    let { owner, number } = cellphone;
    let { name } = owner;
    obj[name] = (obj[name] || []).concat(
      `${name} called ${callee.name} from ${name}'s phone(${number})`
    );
    console.log(obj[name]);
  }
  text(cellphone, ...recipients) {
    // Dan texted Alex from Dan's phone(202-555-0149)
    let { owner, number } = cellphone;
    let { name } = owner;
    recipients.forEach((p) => {
      obj[name] = (obj[name] || []).concat(
        `${name} texted ${p.name} from ${name}'s phone(${number})`
      );
    });
  }
}

var dan = new Person("Dan");
var alex = new Person("Alex");
var phone = { owner: dan, number: "202-555-0199" };
dan.call(phone, alex);
var mark = new Person("Mark");
dan.text(phone, alex, mark);

console.log(NSA.log(dan));
console.log(NSA.log(dan));
