function updateAccounts(accounts, logons) {
  let accUserId = accounts.Accounts.map(({ Id }) => Id);
  //console.log(accUserId);
  for (let logonUser of logons.Logons) {
    const { Id, Name, Date } = logonUser;
    if (accUserId.includes(Id)) {
      let index = accUserId.indexOf(Id);
      const { LogonCount: counter } = accounts.Accounts[index];
      accounts.Accounts[index].LogonCount = counter + 1;
      if (accounts.Accounts[index].LastLogon < Date) {
        if (Name != "") {
          accounts.Accounts[index].Name = Name;
        }

        accounts.Accounts[index].LastLogon = Date;
      }
    } else {
      let obj = {};
      for (const key in logonUser) {
        obj[key] = logonUser[key];
      }
      obj.LogonCount = 1;
      accounts.Accounts.push(obj);

      let accUserSort = accounts.Accounts.sort(
        (userA, userB) => userA.Id - userB.Id
      );
    }
  }
  return accounts;
}

var accounts = {
  Accounts: [
    {
      Id: 21,
      Name: "AJohn Shepherd",
      LogonCount: 13,
      LastLogon: new Date(2017, 1, 14, 16, 15, 6, 111),
    },
    {
      Id: 22,
      Name: "BJohn Shepherd",
      LogonCount: 16,
      LastLogon: new Date(2017, 1, 14, 16, 15, 6, 111),
    },
    {
      Id: 23,
      Name: "CJohn Shepherd",
      LogonCount: 15,
      LastLogon: new Date(2017, 1, 14, 16, 15, 6, 111),
    },
  ],
};

var logons = {
  Logons: [
    {
      Id: 20,
      Name: "BJohn Shepherd",
      Date: new Date(2018, 1, 14, 16, 15, 6, 111),
    },
  ],
};

console.log(updateAccounts(accounts, logons));
