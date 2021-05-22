function getAge(birthDate, nowDate) {
    return parseInt(
      Math.abs(nowDate - birthDate) / (1000 * 24 * 60 * 60) / 365
    );
}

console.log(getAge(new Date('1913/01/01'), new Date('2013/01/01')));