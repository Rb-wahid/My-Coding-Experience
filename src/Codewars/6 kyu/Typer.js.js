var typer = (function (TO_BE_DEFINED_BY_YOU) {
  return {
    isNumber: function (num) {
      if (isNaN(num)) {
        return false;
      }
      return num.constructor == Number;
    },
    isString: function (str) {
      return str.constructor == String;
    },
    isArray: function (arr) {
      return Array.isArray(arr);
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
      try {
        return err.constructor == Error || err.constructor == TypeError;
      } catch (e) {
        return true;
      }
    },
    isNull: function (n) {
      return Object.is(n, null);
    },
    isUndefined: function (n) {
      return Object.is(n, undefined);
    },
  };
})(null);
