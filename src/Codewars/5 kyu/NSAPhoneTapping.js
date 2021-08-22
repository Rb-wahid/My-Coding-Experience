let obj = {};
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
    let { owner, number: ownerNumber } = cellphone;
    let { name: ownerName } = owner;
    obj[this.name] = (obj[this.name] || []).concat(
      `${this.name} called ${callee.name} from ${ownerName}'s phone(${ownerNumber})`
    );
  }
  text(cellphone, ...recipients) {
    let { owner, number: ownerNumber } = cellphone;
    let { name: ownerName } = owner;

    recipients.forEach(({ name: recipientName }) => {
      obj[this.name] = (obj[this.name] || []).concat(
        `${this.name} texted ${recipientName} from ${ownerName}'s phone(${ownerNumber})`
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
