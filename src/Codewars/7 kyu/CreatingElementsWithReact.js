var React = require("react");

function createElement(content, tag, props) {
  // create a react element here
  tag = tag || "div";
  props = props || {};
  return React.createElement(tag, props, content);
}

function createUnorderedList(list) {
  // create a react unordered list with children list items created form the list argument
  return React.createElement(
    "ul",
    {},
    list.map((content) => createElement(content, "li"))
  );
}
