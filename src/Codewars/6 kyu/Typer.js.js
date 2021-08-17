var typer = (function (TO_BE_DEFINED_BY_YOU) {
  return {
    isNumber: function (num) {
      return num.constructor == Number && !isNaN(num);
    },
    isString: function (str) {
      return str.constructor == String;
    },
    isArray: function (arr) {
      return arr.constructor == Array;
    },
    isFunction: function (fn) {
      return fn.constructor == Function;
    },
    isDate: function (date) {
      return date.constructor == Date;
    },
    isRegExp: function (regex) {
      return regex.constructor == RegExp;
    },
    isBoolean: function (bool) {
      return bool.constructor == Boolean;
    },
    isError: function (err) {
      return err instanceof Error;
    },
    isNull: function (n) {
      return Object.is(n, null);
    },
    isUndefined: function (n) {
      return Object.is(n, undefined);
    },
  };
})(null);
