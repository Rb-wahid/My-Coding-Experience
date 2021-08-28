var React = require("react");

function createElement(content, tag, props) {
  // create a react element here
  tag = tag || "div";
  props = props || {};
  return React.createElement(tag, props, content);
}

function createUnorderedList(list) {
  // create a react unordered list with children list items created form the list argument
  list = list.map((content, i) => createElement(content, "li", { key: i }));
  return React.createElement("ul", null, list);
}
